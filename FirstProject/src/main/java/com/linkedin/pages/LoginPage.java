package com.linkedin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Kengoroo on 28.02.2015.
 */
public class LoginPage {
    @FindBy(id = "session_key-login")
    private WebElement loginField;

    @FindBy(id = "session_password-login")
    private WebElement passwordField;

    @FindBy(id = "signin")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password){
        loginField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
