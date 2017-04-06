package com.test.googletranslate.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchField;

    public GoogleMainPage(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void search(final String requestedPhrase) {
        searchField.sendKeys(requestedPhrase);
        searchField.sendKeys(Keys.RETURN);
    }
}
