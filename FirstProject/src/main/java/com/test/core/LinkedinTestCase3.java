package com.test.core;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Kengoroo on 07.02.2015.
 */
public class LinkedinTestCase3 {
    public static void main(String[] args) {
        WebDriver testCase3 = new FirefoxDriver();
        testCase3.get("https://www.linkedin.com/");

        WebElement loginField = testCase3.findElement(By.id("session_key-login"));
        loginField.sendKeys("comp9@i.ua");

        WebElement passwordField = testCase3.findElement(By.id("session_password-login"));
        passwordField.sendKeys("РЖУНИМАГУ");

        WebElement enterButton = testCase3.findElement(By.id("signin"));
        enterButton.click();

        boolean present;
        try {
            WebElement errorMsg = testCase3.findElement(By.partialLinkText("измените пароль"));
            present = true;
        } catch (NoSuchElementException e) {
            present = false;
        }

        if (present) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test Failed");
        }

    }
}
