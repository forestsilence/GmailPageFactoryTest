package com.company.Sites;

import com.company.Pages.InboxPage;
import com.company.Pages.LoginPage;
import com.company.Pages.MailPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class GMailSite extends Site {
    WebDriver webDriver = super.webDriver;

    public GMailSite(String browser) {
        super(browser);
    }
//
//    public GMailSite(String browser) {
//        this();
////        super(browser);
//        switch (browser) {
//            case "Firefox":
//                webDriver = new FirefoxDriver();
//                break;
//            default:
//                webDriver = new ChromeDriver();
//        }
//
//        webDriver.manage().window().maximize();
//        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//        webDriver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
//    }

//    public GMailSite(WebDriver driver) {
//        webDriver = driver;
//    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public LoginPage loginPage() {
        return new LoginPage(webDriver);
    }

    public InboxPage inboxPage() {
        return new InboxPage(webDriver);
    }

    public MailPage mailPage() {
        return new MailPage(webDriver);
    }

//    public void stop() {
//        if (super.webDriver != null) {
//            super.webDriver.quit();
//        }
//    }

}
