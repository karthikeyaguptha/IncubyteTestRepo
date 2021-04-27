package com.test.Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReporting extends TestBase {

    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extentReports;
    public static ExtentTest extentTest;

    public static String BRW() {
        System.out.println(Browser);
        return Browser;
    }

    public static void OS() {
        String Key = "os.name";
        System.out.println(System.getProperty(Key));
    }

    public static String ENV() {
        return GMAILSIGNIN_URL;
    }

    public static void setExtent() {
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/target/ExtentReport/ExtentReport" + ExtentDateTimeStamp() + ".html");
        htmlReporter.config().setDocumentTitle("Automation Report");
        htmlReporter.config().setReportName("Functional Testing - Gmail Mail Sending");
        htmlReporter.config().setTheme(Theme.DARK);


        extentReports = new ExtentReports();
        extentReports.attachReporter(htmlReporter);
        extentReports.setSystemInfo("Tester Name", "Karthik Guptha");
        extentReports.setSystemInfo("OS", System.getProperty("os.name"));
        extentReports.setSystemInfo("Browser", BRW());
        extentReports.setSystemInfo("Environment", ENV());
    }

    public static String ExtentDateTimeStamp() {
        return new SimpleDateFormat("_dd-MM-yyyy_HH_mm_ss").format(new Date());
    }

    public static void ExtentReport(String ScenarioName) {
        extentTest = extentReports.createTest(ScenarioName);
    }


    public static void endReport() {
        extentReports.flush();
    }
}
