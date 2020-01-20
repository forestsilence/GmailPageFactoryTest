package com.company.Tests;

import com.company.BaseTest;
import com.company.Sites.GMailSite;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static com.company.Config.*;

public class GMailTest extends BaseTest {
    String browser, hubURL;

    //Before tests run SeleniumGrid.bat in Project directory
    //selenium-server-standalone-3.141.59.jar added

    //Commands in Maven console
    //mvn clean test - to for run tests through Maven
    //mvn allure:serve - to get Allure report

    @BeforeMethod
    public void setup() throws MalformedURLException {
        browser = "chrome";
        hubURL = "http://localhost:4444/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);
        capabilities.setPlatform(Platform.WINDOWS);
//        capabilities.setVersion("79");

        webSite = new GMailSite(hubURL, capabilities);
        webDriver = webSite.getWebDriver();
        wait = new WebDriverWait(webDriver, 30, 500);

        webDriver.get(URL);
        System.out.println("Check url");
        Assert.assertTrue(webDriver.getCurrentUrl().contains("accounts.google.com"));
        System.out.println("Authorization");
        webSite.loginPage().auth(EMAIL, PASS);
    }

    @Test
    public void openMailSection() {
        System.out.println("Counting");
        webSite.inboxPage().waitForLoadInboxPage();
        webSite.inboxPage().printNumberOfSections();
        System.out.println("Open mail");
        webSite.inboxPage().openSection();
    }

    @Test
    public void countMails() {  //Counts mails in needed section
        System.out.println("Count mails");
        System.out.println("Wait for load inbox page");
        webSite.inboxPage().waitForLoadInboxPage();
        System.out.println("Open mail");
        webSite.inboxPage().openSection();
        System.out.println("Wait for load mail page");
        webSite.mailPage().waitForLoadMailPage();
        System.out.println("Expand mails");
        webSite.mailPage().expandMails();
        webSite.mailPage().printNumberOfMails();
    }

    @Test
    public void replyToSender() { //Counts mails in needed section and send reply to sender
        System.out.println("Wait for load inbox page");
        webSite.inboxPage().waitForLoadInboxPage();
        System.out.println("Open mail");
        webSite.inboxPage().openSection();
        System.out.println("Wait for load mail page");
        webSite.mailPage().waitForLoadMailPage();
        System.out.println("Expand mails");
        webSite.mailPage().expandMails();
        int numberOfMails = webSite.mailPage().getNumberOfMails();
        System.out.println("Number of mails = " + numberOfMails);
        System.out.println("Click reply button");
        webSite.mailPage().clickReplyButton();
        System.out.println("Write answer");
        webSite.mailPage().writeAnswer(numberOfMails);
        System.out.println("Click send button");
        webSite.mailPage().sendAnswer();
        System.out.println("Wait for send letter");
        webSite.mailPage().waitForSendLetter();
//        System.out.println("Mails size = " + webSite.mailPage().getNumberOfMails());
//        webSite.mailPage().printNumberOfMails();
    }

    @Test
    public void writeNewLetter() { //Counts mails in needed section and send mail to sender via creating new mail
        System.out.println("Wait for load inbox page");
        webSite.inboxPage().waitForLoadInboxPage();
        System.out.println("Open mail");
        webSite.inboxPage().openSection();
        System.out.println("Wait for load mail page");
        webSite.mailPage().waitForLoadMailPage();
        System.out.println("Expand mails");
        webSite.mailPage().expandMails();
        System.out.println("Number of mails = " + webSite.mailPage().getNumberOfMails());
        System.out.println("Write new letter and send it");
        webSite.mailPage().writeNewLetter(ADDRESS);
        System.out.println("Wait for send letter");
        webSite.mailPage().waitForSendLetter();
    }
    @Ignore
    @Test //Counts mails in needed section and send mail to target address via creating new mail
    public void writeTargetLetter() {
        System.out.println("Wait for load inbox page");
        webSite.inboxPage().waitForLoadInboxPage();
        System.out.println("Open mail");
        webSite.inboxPage().openSection();
        System.out.println("Wait for load mail page");
        webSite.mailPage().waitForLoadMailPage();
        System.out.println("Expand mails");
        webSite.mailPage().expandMails();
        System.out.println("Number of mails = " + webSite.mailPage().getNumberOfMails());
        System.out.println("Write new letter and send it");
        webSite.mailPage().writeNewLetter("target@address.email"); //Put email you need here
        System.out.println("Wait for send letter");
        webSite.mailPage().waitForSendLetter();
    }
}
