package com.test.TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(

        features = "src/test/resources/com.test.featureFiles",
        glue = "com.test.StepDefs",
        monochrome = true,
        strict = true,
        stepNotifications = true,
        plugin = {"pretty",
                "html:target/cucumber.html",
                "json:target/cucumber_json.json",
                "junit:target/cucumber_xml.xml",
                "rerun:target/cucumber_rerun.txt",
        },
        tags = {"@TestGmailLogin"})

@RunWith(Cucumber.class)
public class TestRunner {


}
