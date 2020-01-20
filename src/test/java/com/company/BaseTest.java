package com.company;

import com.company.Sites.GMailSite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class BaseTest {
    public WebDriver webDriver;
    public WebDriverWait wait;
    public GMailSite webSite;

//    @Parameters({"browser"})
//    @BeforeMethod
//    public void init(@Optional("Firefox") String browser) {
//        webSite = new GMailSite(browser);
//    }

    @AfterMethod
    public void stop() {
       webSite.stop();
    }
}
