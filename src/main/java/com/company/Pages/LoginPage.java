package com.company.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends Page {

    @FindBy(id = "identifierId")
    WebElement emailInputField;

    @FindBy(id = "identifierNext")
    WebElement nextEmailButton;

//    @FindBy(xpath = "//input[@type='password']")
//    @FindBy(css = "input[type='password']")
    @FindBy(name = "password")
    WebElement passwordInputField;

    @FindBy(id = "passwordNext")
    WebElement nextPassButton;

    @FindBy(id = "yDmH0d")
    WebElement confirmButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail (String text) {
        emailInputField.clear();
        emailInputField.sendKeys(text);
    }

    public void clickEmailNextButton() {
        nextEmailButton.click();
    }

    public void enterPassword (String text) {
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='password']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']"))).click();
        passwordInputField.clear();
        passwordInputField.sendKeys(text);
    }

    public void clickPassNextButton() {
        nextPassButton.click();
    }

    public void clickConfirmButton() {
        confirmButton.click();
    }

    public void auth(String email, String pass) {
        enterEmail(email);
        clickEmailNextButton();
        enterPassword(pass);
        clickPassNextButton();
//        clickConfirmButton();
    }
}
