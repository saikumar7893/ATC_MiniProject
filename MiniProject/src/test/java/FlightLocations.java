import BaseTest.BaseClass;
import PageObjects.HomePageLocationTest;
//import Utilities.Utility;
import Utilities.ReadPropertyFile;
import Utilities.Utility;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class FlightLocations extends BaseClass {


    @BeforeMethod
    public void startbrowser() throws Exception {
        launchBrowser();
    }

    @Test
    public void processingTestCase() throws Exception {

        HomePageLocationTest hplt=new HomePageLocationTest();
        hplt.checklocations();
        Assert.assertEquals(HomePageLocationTest.value1,HomePageLocationTest.value2);
    }

    @AfterMethod

    public void aftermethod(ITestResult result) throws IOException {

        //ITestResult is an Interface.

        if(ITestResult.SUCCESS==result.getStatus())
        {
            Utility.takingScreenshott("LatestError");
        }


    }
}
