package com.test.core;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Kengoroo on 07.02.2015.
 */
public class LinkedinTestCase2 {
    public static void main(String[] args) {
        WebDriver testCase2 = new FirefoxDriver();
        testCase2.get("https://www.linkedin.com/");

        WebElement loginField = testCase2.findElement(By.id("session_key-login"));
        loginField.sendKeys("comp9@i.ua");

        WebElement passwordField = testCase2.findElement(By.id("session_password-login"));
        passwordField.sendKeys("ржуJнимагу");

        WebElement enterButton = testCase2.findElement(By.id("signin"));
        enterButton.click();

        boolean present;
        try {
            WebElement errorMsg = testCase2.findElement(By.partialLinkText("измените пароль"));
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
