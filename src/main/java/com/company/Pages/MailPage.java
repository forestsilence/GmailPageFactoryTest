package com.company.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MailPage extends Page {

    @FindBy(className = "adx")
    WebElement expandedAriaButton;

//    <div class="kv  " role="listitem"><div class="Bk"><div class="G3 G2"><div><div id=":7y"><div class="adf ads"><div class="aju"><div class="aCi"><img id=":62_5-c" name=":62" src="//ssl.gstatic.com/ui/v1/icons/mail/profile_mask2.png" class="ajn" style="background-color: #cccccc" jid="whitepeak@mail.ru" data-hovercard-id="whitepeak@mail.ru" data-name="Александр" aria-hidden="true"></div></div><div class="gs gt"><div class="gE hI"><table cellpadding="0" role="presentation" class="cf gJ"><tbody><tr><td class="gF gK" style="width:auto"><span email="whitepeak@mail.ru" data-hovercard-id="whitepeak@mail.ru" name="Александр" class="gD" role="gridcell" tabindex="-1">Александр</span></td><td class="gF gK"><table cellpadding="0" class="cf iB za "><tbody><tr><td><div class="iA g6">Письмо 01 С уважением, Александр whitepeak@mail.ru</div></td></tr></tbody></table></td><td class="gH bAk"><span></span><span id=":7z" class="g3" title="26 дек. 2019 г., 22:53" alt="26 дек. 2019 г., 22:53" role="gridcell" tabindex="-1">26 дек. 2019 г., 22:53 (8 дней назад)</span><div class="zd bi4" aria-label="Не помечено" title="Не помечено" tabindex="0" role="checkbox" aria-checked="false" style="outline:0" jslog="20511; u014N:cOuCgd,Kr2w4b;"><span class="T-KT"><img class="f T-KT-JX" src="images/cleardot.gif" alt=""></span></div></td></tr><tr><td class="gF gK" colspan="3"><table cellpadding="0" class="cf iB"><tbody><tr><td><div class="iA g6" role="gridcell" tabindex="-1">Письмо 01 С уважением, Александр whitepeak@mail.ru</div></td></tr></tbody></table></td></tr></tbody></table></div></div><div class="ajx"></div></div></div></div></div></div></div>
//    <div class="kv bg " role="listitem"><div class="Bk"><div class="G3 G2"><div class="aFg" style="display: none;"></div><div><div id=":84"><div class="adf ads"><div class="aju"><div class="aCi"><img id=":62_8-c" name=":62" src="//ssl.gstatic.com/ui/v1/icons/mail/profile_mask2.png" class="ajn" style="background-color: #cccccc" jid="whitepeak@mail.ru" data-hovercard-id="whitepeak@mail.ru" data-name="Александр" aria-hidden="true" data-hovercard-owner-id="140"></div></div><div class="gs gt"><div class="gE hI"><table cellpadding="0" role="presentation" class="cf gJ"><tbody><tr><td class="gF gK" style="width:auto"><span email="whitepeak@mail.ru" data-hovercard-id="whitepeak@mail.ru" name="Александр" class="gD" role="gridcell" tabindex="-1">Александр</span></td><td class="gF gK"><table cellpadding="0" class="cf iB za "><tbody><tr><td><div class="iA g6">Письмо 02 С уважением, Александр whitepeak@mail.ru</div></td></tr></tbody></table></td><td class="gH bAk"><span></span><span id=":9s" class="g3" title="26 дек. 2019 г., 22:53" alt="26 дек. 2019 г., 22:53" role="gridcell" tabindex="-1">26 дек. 2019 г., 22:53 (8 дней назад)</span><div class="zd bi4" aria-label="Не помечено" title="Не помечено" tabindex="0" role="checkbox" aria-checked="false" style="outline:0" jslog="20511; u014N:cOuCgd,Kr2w4b;"><span class="T-KT"><img class="f T-KT-JX" src="images/cleardot.gif" alt=""></span></div></td></tr><tr><td class="gF gK" colspan="3"><table cellpadding="0" class="cf iB"><tbody><tr><td><div class="iA g6" role="gridcell" tabindex="-1">Письмо 02 С уважением, Александр whitepeak@mail.ru</div></td></tr></tbody></table></td></tr></tbody></table></div></div><div class="ajx"></div></div></div></div></div></div></div>
//    <div class="iA g6" role="gridcell" tabindex="-1">Письмо 03 С уважением, Александр whitepeak@mail.ru</div>
    @FindBy(css = ".iA.g6")
    List<WebElement> mails;

    //    <div class="Bk"><div class="G3 G2"><div><div id=":8s"><div class="adf ads"><div class="aju"><div class="aCi"><img id=":62_5-c" name=":62" src="//ssl.gstatic.com/ui/v1/icons/mail/profile_mask2.png" class="ajn" style="background-color: #cccccc" jid="whitepeak@mail.ru" data-hovercard-id="whitepeak@mail.ru" data-name="Александр" aria-hidden="true"></div></div><div class="gs gt"><div class="gE hI"><table cellpadding="0" role="presentation" class="cf gJ"><tbody><tr><td class="gF gK" style="width:auto"><span email="whitepeak@mail.ru" data-hovercard-id="whitepeak@mail.ru" name="Александр" class="gD" role="gridcell" tabindex="-1" data-hovercard-owner-id="142">Александр</span></td><td class="gF gK"><table cellpadding="0" class="cf iB za "><tbody><tr><td><div class="iA g6">Письмо 01 С уважением, Александр whitepeak@mail.ru</div></td></tr></tbody></table></td><td class="gH bAk"><span></span><span id=":8t" class="g3" title="26 дек. 2019 г., 22:53" alt="26 дек. 2019 г., 22:53" role="gridcell" tabindex="-1">26 дек. 2019 г., 22:53</span><div class="zd bi4" aria-label="Не помечено" title="Не помечено" tabindex="0" role="checkbox" aria-checked="false" style="outline:0" jslog="20511; u014N:cOuCgd,Kr2w4b;"><span class="T-KT"><img class="f T-KT-JX" src="images/cleardot.gif" alt=""></span></div></td></tr><tr><td class="gF gK" colspan="3"><table cellpadding="0" class="cf iB"><tbody><tr><td><div class="iA g6" role="gridcell" tabindex="-1">Письмо 01 С уважением, Александр whitepeak@mail.ru</div></td></tr></tbody></table></td></tr></tbody></table></div></div><div class="ajx"></div></div></div></div></div></div>
    @FindBy(css = ".Bk")
    List<WebElement> lines;

//    #\:ah > div:nth-child(2) > div.adn.ads > div.gs > div.gE.iv.gt > table > tbody > tr:nth-child(1) > td.gH.acX.bAm >
//    div.T-I.J-J5-Ji.T-I-Js-IF.aaq.T-I-ax7.L3.T-I-JW
//    <div class="T-I J-J5-Ji T-I-Js-IF aaq T-I-ax7 L3" role="button" tabindex="0" data-tooltip="Ответить" aria-label="Ответить" style="user-select: none;"><img class="hB T-I-J3 " role="button" src="images/cleardot.gif" alt=""></div>
//    #\:8d > div:nth-child(2) > div.adn.ads > div.gs > div.gE.iv.gt > table > tbody > tr:nth-child(1) > td.gH.acX.bAm > div.T-I.J-J5-Ji.T-I-Js-IF.aaq.T-I-ax7.L3
//    //*[@id=":8d"]/div[2]/div[1]/div[2]/div[1]/table/tbody/tr[1]/td[4]/div[1]/img
//    //div[@role='main']//table/tbody/tr[./td//span[@email='email adress']]

//    @FindBy(xpath = "//div[@id=':8d']/div[2]/div[1]/div[2]/div[1]/table/tbody/tr[1]/td[4]/div[1]/img")
    @FindBy(css = "#\\:8d > div:nth-child(2) > div.adn.ads > div.gs > div.gE.iv.gt > table > tbody > tr:nth-child(1) > td.gH.acX.bAm > div.T-I.J-J5-Ji.T-I-Js-IF.aaq.T-I-ax7.L3 > img::after")
    WebElement replyRoundButton;

//    <a href="mailto:whitepeak@mail.ru" target="_blank">whitepeak@mail.ru</a>
//    #\:9l > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > a
//    //*[@id=":34"]/div[2]/div[3]/div[1]/div[1]/a
//    //a[contains(text(),'t')]
    @FindBy(xpath = "//*[@id=':34']/div[2]/div[3]/div[1]/div[1]/a[contains(text(),'whitepeak@mail.ru')]")
    WebElement mailTo;

//    //*[@id=":2y"]
//    span#:7q.arms.bkH
    @FindBy(id = ":7q")
    WebElement replyButton;

    @FindBy(id = ":bg")
    WebElement bodyOfMail;

    @FindBy(id = ":9q")
    WebElement sendButton;

//    //*[@id=":4l"]/div/div
    @FindBy(xpath = "//*[@id=':4l']")
    WebElement newLetterButton;

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
        wait.until(ExpectedConditions.invisibilityOf(expandedAriaButton));
        return lines.size();
    }

    public void printNumberOfMails(){
        wait.until(ExpectedConditions.invisibilityOf(expandedAriaButton));
        for (WebElement line: lines) {
            System.out.println(line);
        }
        System.out.println(lines.size());
    }

    public void clickReplyButton() {
//        lines.get(0).click();
//        replyButton.click();
//        mailTo.click();
//        waitVisible(By.id(":2y"));
        waitVisible(replyButton);
        wait.until(ExpectedConditions.elementToBeClickable(replyButton)).click();
//        replyButton.click();
    }

    public void writeAnswer() {
        waitVisible(bodyOfMail);
        bodyOfMail.click();
        bodyOfMail.sendKeys("Пришло " + getNumberOfMails() + "\n" + "Всего затрачено времени 77 часов.");
    }

    public void sendAnswer() {
        waitVisible(sendButton);
        sendButton.click();
    }

    public void writeNewLetter() {
        newLetterButton.click();
    }
}
