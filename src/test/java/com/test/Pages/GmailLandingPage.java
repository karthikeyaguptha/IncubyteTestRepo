package com.test.Pages;

import com.test.Utils.ScreenShotUtil;
import com.test.Utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class GmailLandingPage extends TestBase {


    public static void gmailLogoVerification() throws IOException {
        //Verifying the Gmail Landing Logo

        WebElement gmailLogo = driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[1]/div[4]/div/a/img"));
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOf(gmailLogo));
        wait.until(ExpectedConditions.elementToBeClickable(gmailLogo));
        gmailLogo.isDisplayed();
        System.out.println("Gmail Logo is displayed");
        ScreenShotUtil.TAKESCRNSHT("Gmail Logo");
    }

    public static void clickOnComposeButton() {
        //Clicking on Compose Button

        WebElement composeButton = driver.findElement(By.xpath("//*[@class='T-I T-I-KE L3']"));
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOf(composeButton));
        wait.until(ExpectedConditions.elementToBeClickable(composeButton));
        composeButton.click();
    }

    public static void enteringToField(String ToAddressMailID) {
        //Entering To Email Address field

        WebElement ToAddress = driver.findElement(By.xpath("//*[@name='to']"));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(ToAddress));
        wait.until(ExpectedConditions.elementToBeClickable(ToAddress));
        ToAddress.click();
        ToAddress.sendKeys(ToAddressMailID);

    }

    public static void enteringSubjectField(String Subject) {
        //Entering Subject Field

        WebElement subject = driver.findElement(By.xpath("//*[@name='subjectbox']"));
        WebDriverWait wait = new WebDriverWait(driver, 1);
        wait.until(ExpectedConditions.visibilityOf(subject));
        wait.until(ExpectedConditions.elementToBeClickable(subject));
        subject.sendKeys(Subject);


    }

    public static void enteringBodyofMail(String BodyOfMail) {
        //Entering the Body of the Mail

        WebElement BoM = driver.findElement(By.xpath("//*[@class='Am Al editable LW-avf tS-tW']"));
        WebDriverWait wait = new WebDriverWait(driver, 1);
        wait.until(ExpectedConditions.visibilityOf(BoM));
        wait.until(ExpectedConditions.elementToBeClickable(BoM));
        BoM.sendKeys(BodyOfMail);
    }

    public static void clickOnSendButton() throws InterruptedException {
        //Clicking on Send Button

        WebElement sendButton = driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']"));
        WebDriverWait wait = new WebDriverWait(driver, 1);
        wait.until(ExpectedConditions.visibilityOf(sendButton));
        wait.until(ExpectedConditions.elementToBeClickable(sendButton));
        sendButton.click();
        Thread.sleep(4500);
    }


}
