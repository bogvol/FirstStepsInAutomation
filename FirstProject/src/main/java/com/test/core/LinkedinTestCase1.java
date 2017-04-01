package com.test.core;

//import com.SuperDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Kengoroo on 05.02.2015.
 */
public class LinkedinTestCase1 {
    public static void main(String[] args) {
        WebDriver testCase1 = new FirefoxDriver();
        testCase1.get("https://www.linkedin.com/");

        WebElement loginField = testCase1.findElement(By.id("session_key-login"));
        loginField.sendKeys("comp9@i.ua");

        WebElement passwordField = testCase1.findElement(By.id("session_password-login"));
        passwordField.sendKeys("ржунимагу");

        WebElement enterButton = testCase1.findElement(By.id("signin"));
        enterButton.click();

        boolean present;
        try {
            WebElement searchButton = testCase1.findElement(By.id("advanced-search"));
            present = true;
        } catch (NoSuchElementException v) {
            present = false;
        }
        if (present) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test Failed");
        }
        testCase1.quit();
    }
}
