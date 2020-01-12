package com.company.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class InboxPage extends Page {

//    <tr class="zA yO" jscontroller="ZdOxDb" jsaction="Tnvr6c:RNc9jf;PG1zDd:eyrEaf;WGbBt:UL4Ddb;nVvxM:UL4Ddb;"

//*[@id=":2q"]
    @FindBy(css = ".zA.yO")
    List<WebElement> sections;

    @FindBy(css = ".zA.yO")
    WebElement mailSection;

//    <span class="yP" email="whitepeak@mail.ru" name="Александр" data-hovercard-id="whitepeak@mail.ru" data-hovercard-owner-id="145">Александр</span>
//    <span class="bx0">5</span>

    @FindBy(css = "span.yP")
    List<WebElement> mailGroups;

    @FindBy(xpath = "//div[@role='main']//table/tbody/tr[./td//span[@email='whitepeak@mail.ru']]")
    WebElement currentMail;

    public InboxPage(WebDriver driver) {
        super(driver);
    }

    public void waitForLoadInboxPage(){
        wait.until(ExpectedConditions.visibilityOf(mailSection));
    }

    public void openMail(){
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("span[contains(text(),'Александр')]")));
        waitVisible(currentMail);
        currentMail.click();
    }

//    public void openMail(String sender){
//        for (WebElement mail: mailGroups){
//            System.out.println(mail);
//            WebElement mailLink = mail.findElement(By.tagName("span"));
//                if (mailLink.getAttribute("span").contains(sender)) {
//                mailLink.click();
//            }
//        }
//    }

    public void printNumberOfSections(){
        System.out.println("Sections = " + sections.size());
        System.out.println("MailGroups = " + mailGroups.size());
    }

    public void clickMailSection(){
        mailSection.click();
    }

}
