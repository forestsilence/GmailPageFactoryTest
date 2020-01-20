package com.company.Sites;

import com.company.Pages.InboxPage;
import com.company.Pages.LoginPage;
import com.company.Pages.MailPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

public class GMailSite extends Site {

    public GMailSite(String browser) {
        super(browser);
    }

    public GMailSite(String hubURL, DesiredCapabilities capability) throws MalformedURLException {
        super(hubURL, capability);
    }

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
}
