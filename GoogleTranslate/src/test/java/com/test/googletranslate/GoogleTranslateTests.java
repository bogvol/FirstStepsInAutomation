package com.test.googletranslate;

import com.test.googletranslate.pages.GoogleMainPage;
import com.test.googletranslate.pages.GoogleTranslatePage;
import com.test.googletranslate.pages.ResultsPage;
import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class GoogleTranslateTests {
    private WebDriver driver;
    private WebDriver driverForConcurrentSession = null;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
        if (driverForConcurrentSession != null) driverForConcurrentSession.quit();
    }

    @Test
    public void searchResult() {
        // Search requested text
        GoogleMainPage mainPage = new GoogleMainPage(driver);
        mainPage.search("google translate");
        // Get link to Google Translate EN (not depends on localization)
        ResultsPage searchResult = new ResultsPage(driver);
        String link = searchResult.retrieveItemLinkFromResultsList();
        String linkEN = link.replaceAll("(hl=)[a-z]+", "hl=en");
        // Open Google Translate in new browser session
        driverForConcurrentSession = new ChromeDriver();
        driverForConcurrentSession.manage().window().maximize();
        driverForConcurrentSession.get(linkEN);
        // Choose languages
        GoogleTranslatePage translator = new GoogleTranslatePage(driverForConcurrentSession);
        translator.chooseSourceAndTargetLanguage("English", "Polish");

        assertThat(translator.getTranslation("luxoft test task"), containsString("zadaniem testu"));
    }
}
