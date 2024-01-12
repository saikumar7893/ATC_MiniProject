package Utilities;

import BaseTest.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

import static org.openqa.selenium.OutputType.FILE;

public class Utility extends BaseClass {

    public static void takingScreenshott(String screenshot) throws IOException {
            // File screenshortFile= ((TakesScreenshot)driver).getScreenshotAs(FILE);
            // FileUtils.copyFile(screenshortFile,new File("./Screenshots/"+screenshot+".png"));
                Date currentdate = new Date();
        String screenShotFileName = currentdate.toString().replace(" ","-").replace(":","-");
        System.out.println(screenShotFileName);
        File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile,new File("./ScreenShots/"+screenShotFileName+".png"));
        System.out.println("Successfully taken screenshot");
    }
}
