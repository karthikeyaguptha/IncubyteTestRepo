package com.test.Utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPage extends TestBase {


    public static void login(String MailId, String Password) throws InterruptedException {

        //Entering Email Id and Clicking on Next Button
        WebDriverWait wait = new WebDriverWait(driver, 5);

        WebElement Email = driver.findElement(By.xpath("//*[@id='identifierId']"));//Email or Phone Field
        wait.until(ExpectedConditions.visibilityOf(Email));
        wait.until(ExpectedConditions.elementToBeClickable(Email));
        Email.sendKeys(MailId);


        WebElement nextButton = driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']"));
        wait.until(ExpectedConditions.visibilityOf(nextButton));
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));//Next Button
        nextButton.click();
        Thread.sleep(5000);


        // Entering the Password and Click on Next Button
        WebElement ShowPassText = driver.findElement(By.xpath("//*[@id='selectionc0']"));
        wait.until(ExpectedConditions.visibilityOf(ShowPassText));
        String ShowPasswordText = ShowPassText.getText();
        Assert.assertEquals("Show password", ShowPasswordText);


        WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(Password);

        WebElement nextButton1 = driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']"));
        wait.until(ExpectedConditions.visibilityOf(nextButton1));
        wait.until(ExpectedConditions.elementToBeClickable(nextButton1));//Next Button
        nextButton1.click();
        Thread.sleep(5000);
    }

    public static void closeBrowser() {
        ExtentReporting.endReport();
        driver.quit();

    }
}
