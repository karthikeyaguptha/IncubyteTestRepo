package com.test.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.util.Properties;

import static com.test.Utils.ExtentReporting.setExtent;

public class TestBase {



    public static WebDriver driver;
    public static String ProjectPath = System.getProperty("user.dir");
    public static Properties prop;
    public static FileInputStream FIP;
    public static String Browser;
    public static String  GMAILSIGNIN_URL;

    public static void SetBrowser_SetURL() throws Throwable {
        FIP = new FileInputStream("src/test/java/com/test/Config/Config.properties");
        prop = new Properties();
        prop.load(FIP);
        Browser = prop.getProperty("Browser");


        if (Browser.equalsIgnoreCase("Chrome")) {
            setExtent();
            CHROME();
            setURL();

        }
        else if (Browser.equalsIgnoreCase("Firefox"))
        {
            setExtent();
            FIREFOX();
            setURL();


        }
        else if(Browser.equalsIgnoreCase("IE"))
        {
            setExtent();
            IE();
            setURL();


        }
        else if (Browser.equalsIgnoreCase(""))
        {
            System.out.println("Please set the Environment.....");
        }
    }

    public static void CHROME()
    {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();

    }
    public static void FIREFOX()
    {
        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
        driver = new FirefoxDriver();
    }
    public static void IE()
    {
        System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
        driver = new InternetExplorerDriver();
    }

    public static void setURL() throws Throwable {
        FIP = new FileInputStream("src/test/java/com/test/Config/Config.properties");
        prop = new Properties();
        prop.load(FIP);

        GMAILSIGNIN_URL();

    }

    public static void GMAILSIGNIN_URL()
    {
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    }



}
