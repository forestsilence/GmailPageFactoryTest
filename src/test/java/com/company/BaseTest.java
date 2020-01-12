package com.company;

import com.company.Sites.GMailSite;
import com.company.Sites.Site;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
    public WebDriver webDriver;
    public WebDriverWait wait;
    public GMailSite webSite;

    @Parameters({"browser"})
    @BeforeClass
    public void init(@Optional("chrome") String browser) {
        webSite = new GMailSite(browser);
    }

    @AfterClass
    public void stop() {
       webSite.stop();
    }
}
