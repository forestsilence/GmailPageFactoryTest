package com.company.Tests;

import com.company.BaseTest;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.company.Config.*;

public class GMailTest extends BaseTest {

    @BeforeMethod
    public void setup() {
        webDriver = webSite.getWebDriver();
        wait = new WebDriverWait(webDriver, 30, 500);

        webDriver.get(URL);
        System.out.println("Check url");
        Assert.assertTrue(webDriver.getCurrentUrl().contains("accounts.google.com"));
        System.out.println("Authorization");
        webSite.loginPage().auth(EMAIL, PASS);
    }

    @Test
    public void openMail() {
        System.out.println("Counting");
        webSite.inboxPage().waitForLoadInboxPage();
        webSite.inboxPage().printNumberOfSections();
        System.out.println("Open mail");
        webSite.inboxPage().openMail();
    }

    @Test
    public void countMails() {
        System.out.println("Count mails");
        System.out.println("Wait for load inbox page");
        webSite.inboxPage().waitForLoadInboxPage();
        System.out.println("Open mail");
        webSite.inboxPage().openMail();
        System.out.println("Wait for load mail page");
        webSite.mailPage().waitForLoadMailPage();
        System.out.println("Expand mails");
        webSite.mailPage().expandMails();
        webSite.mailPage().printNumberOfMails();
    }

    @Test
    public void replyToSender() {
        System.out.println("Wait for load inbox page");
        webSite.inboxPage().waitForLoadInboxPage();
        System.out.println("Open mail");
        webSite.inboxPage().openMail();
        System.out.println("Wait for load mail page");
        webSite.mailPage().waitForLoadMailPage();
        System.out.println("Expand mails");
        webSite.mailPage().expandMails();
        System.out.println("Number of mails = " + webSite.mailPage().getNumberOfMails());
        System.out.println("Click reply button");
        webSite.mailPage().clickReplyButton();
        System.out.println("Write answer");
        webSite.mailPage().writeAnswer();
        System.out.println("Click send button");
        webSite.mailPage().sendAnswer();
    }

    @Test
    public void writeLetter() {
        System.out.println("Wait for load inbox page");
        webSite.inboxPage().waitForLoadInboxPage();
        System.out.println("Open mail");
        webSite.inboxPage().openMail();
        System.out.println("Wait for load mail page");
        webSite.mailPage().waitForLoadMailPage();
        System.out.println("Expand mails");
        webSite.mailPage().expandMails();
        System.out.println("Number of mails = " + webSite.mailPage().getNumberOfMails());
        webSite.mailPage().writeNewLetter();
    }


//    @Test
//    public void authorization() {
//        System.out.println("Enter e-mail");
//        webSite.loginPage().enterEmail(EMAIL);
//        webSite.loginPage().clickEmailNextButton();
//        System.out.println("Enter password");
//        webSite.loginPage().enterPassword(PASS);
//        webSite.loginPage().clickPassNextButton();
//        webSite.loginPage().clickConfirmButton();
//    }
}
