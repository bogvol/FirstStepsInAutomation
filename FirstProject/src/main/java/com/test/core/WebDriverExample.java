package com.test.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Kengoroo on 25.01.2015.
 */
public class WebDriverExample {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.yahoo.com/");

        WebElement searchField = driver.findElement(By.id("p_13838465-p"));
        searchField.sendKeys("webdriver example");

        WebElement searchButton = driver.findElement(By.id("search-submit"));
        searchButton.click();
    }
}
