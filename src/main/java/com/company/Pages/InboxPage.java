package com.company.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InboxPage extends Page {

    @FindBy(css = ".zA.yO")
    List<WebElement> sections;

    @FindBy(css = ".zA.yO")
    WebElement mailSection;

    @FindBy(xpath = "//div[@role='main']//table/tbody/tr[./td//span[@email='whitepeak@mail.ru']]")
    WebElement targetMailSection;

    public InboxPage(WebDriver driver) {
        super(driver);
    }

    public void waitForLoadInboxPage(){
        waitVisible(mailSection);
    }

    public void openSection(){
        waitVisible(targetMailSection);
        targetMailSection.click();
    }

    public void printNumberOfSections(){
        System.out.println("Sections = " + sections.size());
    }

}
