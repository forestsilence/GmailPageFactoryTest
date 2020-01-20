package com.company.Sites;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Site {
    protected WebDriver webDriver;

    public Site(String browser) {
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

    public Site(String hubURL, DesiredCapabilities capabilities) throws MalformedURLException {

        webDriver = new RemoteWebDriver(new URL(hubURL), capabilities);


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
