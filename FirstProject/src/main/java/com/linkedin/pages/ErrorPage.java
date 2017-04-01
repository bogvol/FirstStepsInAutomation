package com.linkedin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Kengoroo on 28.02.2015.
 */
public class ErrorPage {
    @FindBy(xpath = "//div[@id = 'control_gen_2']")
    private WebElement errMsg;

    public ErrorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getErrorText(){
        return errMsg.getText();
    }

}
