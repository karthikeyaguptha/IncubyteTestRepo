package com.test.StepDefs;

import com.test.Utils.TestBase;
import io.cucumber.java.en.Given;

public class MailSendingStepDef extends TestBase {


    @Given("I login to Gmail application with {string} and {string}")
    public void i_login_to_Gmail_application_with_and(String MailId, String Password) throws Throwable {
        TestBase.SetBrowser_SetURL(MailId, Password);
    }

}
