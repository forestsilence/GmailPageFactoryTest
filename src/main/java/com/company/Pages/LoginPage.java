package com.company.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends Page {
//    public WebDriver webDriver;
//    public WebDriverWait wait;

    @FindBy(id = "identifierId")
    WebElement emailInputField;

    @FindBy(id = "identifierNext")
    WebElement nextEmailButton;

//    <input type="password" class="whsOnd zHQkBf" jsname="YPqjbf"
//    autocomplete="current-password" spellcheck="false" tabindex="0"
//    aria-label="Введите пароль" name="password" autocapitalize="off"
//    dir="ltr" data-initial-dir="ltr" data-initial-value="">
//    #password > div.aCsJod.oJeWuf > div > div.Xb9hP > input
    @FindBy(xpath = "//input[@type='password']")
    WebElement passwordInputField;

    @FindBy(id = "passwordNext")
    WebElement nextPassButton;

    @FindBy(id = "yDmH0d")
    WebElement confirmButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

//    public LoginPage (WebDriver driver) {
//        webDriver = driver;
//        wait = new WebDriverWait(webDriver, 30, 500);
//        PageFactory.initElements(webDriver, this);
//    }

    public void enterEmail (String text) {
        emailInputField.clear();
        emailInputField.sendKeys(text);
    }

    public void clickEmailNextButton() {
        nextEmailButton.click();
    }

    public void enterPassword (String text) {
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#password"))).click();
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
        clickConfirmButton();
    }
}
