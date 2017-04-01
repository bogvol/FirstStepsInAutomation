package com.tests;

import com.linkedin.pages.ErrorPage;
import com.linkedin.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Kengoroo on 28.02.2015.
 */
public class LinkedinTests {
    private WebDriver driverForFirefox;

    //анотация TestNg которая исполняеться перед каждым методом в классе
    @BeforeMethod
    public void openLinkedinPage(){
        driverForFirefox = new FirefoxDriver();
        driverForFirefox.get("https://www.linkedin.com/");
    }
    //анотация TestNg которая исполняеться после каждого метода в классе
    @AfterMethod
    public void closeBrowser(){
        driverForFirefox.quit();
    }
    // анотация, которая указывает TestNg, что следующий блок кода является тестом и его можно запустить отдельным потоком
    @Test(enabled = true)
    public void positiveLogin(){
//        openLinkedinPage(); это заменили на @BeforeMethod
//        WebDriver webDriver = new FirefoxDriver(); это было, заменили на метод openLinkedinPage и переменную driverForFirefox
//        webDriver.get("https://www.linkedin.com/");
        LoginPage page = new LoginPage(driverForFirefox);
        page.login("comp9@i.ua","ржунимагу");
    }
    @Test
    public void wrongPass(){
//        openLinkedinPage();
        LoginPage page = new LoginPage(driverForFirefox);
        page.login("comp9@i.ua","ржуjнимагу");

        ErrorPage errPage = new ErrorPage(driverForFirefox);
        String message = errPage.getErrorText();

        Assert.assertEquals(message, "При заполнении формы были допущены ошибки. Проверьте и исправьте отмеченные поля.");
    }
//    @Test
//    public void positiveLogin(){
//        WebDriver testCase1 = new FirefoxDriver();
//        testCase1.get("https://www.linkedin.com/");
//        WebElement loginField = testCase1.findElement(By.id("session_key-login"));
//        loginField.sendKeys("comp9@i.ua");
//        WebElement passwordField = testCase1.findElement(By.id("session_password-login"));
//        passwordField.sendKeys("ржунимагу");
//        WebElement enterButton = testCase1.findElement(By.id("signin"));
//        enterButton.click();
//        try {
//            WebElement searchButton = testCase1.findElement(By.id("1advanced-search"));
//        } catch (NoSuchElementException v) {
//            Assert.fail("Login failed");
//        }
//    }
//    @Test
//    public void wrongPassword(){
//        WebDriver testCase2 = new FirefoxDriver();
//        testCase2.get("https://www.linkedin.com/");
//        WebElement loginField = testCase2.findElement(By.id("session_key-login"));
//        loginField.sendKeys("comp9@i.ua");
//        WebElement passwordField = testCase2.findElement(By.id("session_password-login"));
//        passwordField.sendKeys("ржуJнимагу");
//        WebElement enterButton = testCase2.findElement(By.id("signin"));
//        enterButton.click();
//        boolean present;
//        try {
//            WebElement errorMsg = testCase2.findElement(By.partialLinkText("измените пароль"));
//            present = true;
//        } catch (NoSuchElementException e) {
//            present = false;
//        }
//        Assert.assertTrue(present);
//    }
}
