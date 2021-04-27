package com.test.Utils;

import org.junit.Assert;
import org.openqa.selenium.By;

public class CommonPage extends TestBase {


    public static void login(String MailId, String Password) throws InterruptedException {

        //Entering Email Id and Clicking on Next Button
        driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(MailId); //Email or Phone Field
        driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']")).click(); //Next Button
        Thread.sleep(5000);

        // Entering the Password and Click on Next Button
        String ShowPassText = driver.findElement(By.xpath("//*[@id='selectionc0']")).getText();
        Assert.assertEquals("Show password", ShowPassText);
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys(Password);
        driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']")).click();
        Thread.sleep(5000);
    }

    public static void closeBrowser() {
        ExtentReporting.endReport();
        driver.quit();

    }
}
