package com.test.StepDefs;

import com.test.Pages.GmailLandingPage;
import com.test.Utils.CommonPage;
import com.test.Utils.ExtentReporting;
import com.test.Utils.ScreenShotUtil;
import com.test.Utils.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class MailSendingStepDef extends TestBase {


    @Given("I login to Gmail application with {string} and {string}")
    public void i_login_to_Gmail_application_with_and(String MailId, String Password) throws Throwable {
        TestBase.SetBrowser_SetURL();
        ExtentReporting.ExtentReport("Gmail Mail Sending");
        CommonPage.login(MailId, Password);

    }

    @Then("Verifying the Gmail Landing Page")
    public void verifyingTheGmailLandingPage() throws IOException {
        GmailLandingPage.gmailLogoVerification();
    }

    @And("I Click on Compose Button in Gmail Landing Page")
    public void iClickOnComposeButtonInGmailLandingPage() {
        GmailLandingPage.clickOnComposeButton();
    }

    @Then("I enter the {string} and {string} and {string}")
    public void iEnterTheAndAnd(String ToAdd, String Sub, String Body) throws IOException {
        GmailLandingPage.enteringToField(ToAdd);
        GmailLandingPage.enteringSubjectField(Sub);
        GmailLandingPage.enteringBodyofMail(Body);
        ScreenShotUtil.TAKESIMPLESCRNSHT();

    }

    @And("I Click On Send Button")
    public void iClickOnSendButton() throws IOException {
        GmailLandingPage.clickOnSendButton();
        ScreenShotUtil.TAKESIMPLESCRNSHT();
    }

    @Then("I close the Browser")
    public void iCloseTheBrowser() {
        CommonPage.closeBrowser();
    }
}
