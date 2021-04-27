package com.test.Utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotUtil extends TestBase {

    public static void TAKESCRNSHT(String SCRNSHT) throws IOException {
        TakesScreenshot TS = (TakesScreenshot) driver;
        File SRC = TS.getScreenshotAs(OutputType.FILE);
        File TRG = new File(ProjectPath + "/target/ScreenShots/" + SCRNSHT + SCRNSHTDATEANDTIMESTAMP() + ".png");
        FileHandler.copy(SRC, TRG);

    }

    public static void TAKESIMPLESCRNSHT() throws IOException {
        TakesScreenshot TS = (TakesScreenshot) driver;
        File SRC = TS.getScreenshotAs(OutputType.FILE);
        File TRG = new File(ProjectPath + "/target/ScreenShots/" + SCRNSHTDATEANDTIMESTAMP() + ".png");
        FileHandler.copy(SRC, TRG);

    }


    public static String SCRNSHTDATEANDTIMESTAMP() {
        return new SimpleDateFormat("_dd-MM-yyyy_HH_mm_ss").format(new Date());
    }

}
