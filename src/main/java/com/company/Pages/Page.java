package com.company.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.company.Config.IMPLICITY_WAIT;

public class Page {
    public WebDriver webDriver;
    public WebDriverWait wait;

    public Page(WebDriver driver){
        webDriver = driver;
        wait = new WebDriverWait(webDriver, 30, 500);
        PageFactory.initElements(webDriver, this);
    }

    public WebElement waitVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10, 100);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public Boolean waitInvisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10, 100);
        return wait.until(ExpectedConditions.invisibilityOf(element));
    }

    protected void setImplicitly(boolean val) {
        if (val) {
            webDriver.manage().timeouts().implicitlyWait(IMPLICITY_WAIT, TimeUnit.SECONDS);
            return;
        }
        webDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }
}
