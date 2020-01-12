package com.company.Sites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Site {
    WebDriver webDriver;

    public Site() {}

    public Site(String browser) {
        this();
        switch (browser) {
            case "Firefox":
                webDriver = new FirefoxDriver();
                break;
            default:
                webDriver = new ChromeDriver();
        }

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        webDriver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void stop() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
