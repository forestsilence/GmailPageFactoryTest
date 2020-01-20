package com.company.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MailPage extends Page {

    @FindBy(className = "adx")
    WebElement expandedAriaButton;

//    @FindBy(xpath = "//table//tbody//td/span[@email='whitepeak@mail.ru']")
//    @FindBy(xpath = "//span[@email='whitepeak@mail.ru']")
//    @FindBy(css = "img[jid='whitepeak@mail.ru']")
//    @FindBy(css = "img[jid='whitepeak@mail.ru']")
    @FindBy(css = ".aCi > img[data-hovercard-id='whitepeak@mail.ru']")
    List<WebElement> mails;

//    @FindBy(xpath = "//table//td/div[@data-tooltip='Ответить']")
//    @FindBy(xpath = "//div[@data-tooltip='Ответить']")
    @FindBy(css = "div[data-tooltip='Ответить']")
    WebElement replyInnerButton;

//    @FindBy(xpath = "//table//td//div[@aria-label='Тело письма']")
    @FindBy(css = "table div[aria-label='Тело письма']")
    WebElement bodyOfMail;

//    @FindBy(xpath = "//table//tbody//td//div[contains(@aria-label, 'Отправить')]")
//    @FindBy(xpath = "//div[contains(@aria-label, 'Отправить')]")
    @FindBy(css = "table div[aria-label*='Отправить']")
    WebElement sendButton;

    @FindBy(className = "bAq")
    WebElement letterWasSendMessage;

//    Write new letter test elements block
//    @FindBy(className = "aic")
//    @FindBy(xpath = "div[@class='z0']/div[@role='button']")
    @FindBy(css = ".z0 > div[role='button']")
    WebElement newLetterButton;

    @FindBy(name = "to")
    WebElement emailInputField;

    @FindBy(name = "subjectbox")
    WebElement subjectInputField;

    @FindBy(css = "div[role='textbox']")
    WebElement textField;

//    @FindBy(css = "table>tbody>tr>td>div>div>div[aria-label*='Отправить']")
    @FindBy(css = "table div[aria-label*='Отправить']")
    WebElement newLetterSendButton;

    public MailPage(WebDriver driver){
        super(driver);
    }

    public void waitForLoadMailPage(){
        waitVisible(expandedAriaButton);
    }

    public void expandMails(){
        expandedAriaButton.click();
    }

    public int getNumberOfMails(){
        waitInvisible(expandedAriaButton);
        return mails.size();
    }

    public void printNumberOfMails(){
        waitInvisible(expandedAriaButton);
        for (WebElement line: mails) {
            System.out.println(line);
        }
        System.out.println("Number of mails = " + mails.size());
    }

    public void clickReplyButton() {
        mails.get(0).click();
        waitVisible(replyInnerButton);
        wait.until(ExpectedConditions.elementToBeClickable(replyInnerButton)).click();
    }

    public void writeAnswer(int numberOfMails) {
        waitVisible(bodyOfMail);
        bodyOfMail.sendKeys("Пришло писем "
                + numberOfMails + "\n"
                + "Всего затрачено времени 47 часов.");
    }

    public void sendAnswer() {
        waitVisible(sendButton);
        sendButton.click();
    }

    public void waitForSendLetter() {
        waitVisible(letterWasSendMessage);
        wait.until(ExpectedConditions.textToBePresentInElement(letterWasSendMessage, "Письмо отправлено."));
    }

    public void writeNewLetter(String emailAddress) {
        waitVisible(newLetterButton);
        newLetterButton.click();
        waitVisible(emailInputField);
        emailInputField.sendKeys(emailAddress);
        subjectInputField.sendKeys("Тестовое задание. Майоров");
        textField.sendKeys("Всего прислано писем "
                + getNumberOfMails() + "\n"
                + "Всего затрачено времени 47 часов.");
        newLetterSendButton.click();
    }
}
