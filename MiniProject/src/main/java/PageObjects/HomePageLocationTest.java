package PageObjects;

import BaseTest.BaseClass;
import Utilities.ReadPropertyFile;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class HomePageLocationTest extends BaseClass {



    String tolocate= ReadPropertyFile.getProperty1("testfromlocation");
    String destin= ReadPropertyFile.getProperty1("testtodestination");
    public  static String value1;
    public  static String value2;


    @FindBy(xpath = "//*[@data-ui-name='input_location_from_segment_0']")
    WebElement fromclick;

    //to cancle the initial location
    @FindBy(xpath = "//*[@class='Text-module__root--variant-body_2___-DHx6 css-1cjosny']")
    WebElement fromcancle;

    //To search the location
    @FindBy(xpath = "//*[@data-ui-name='input_text_autocomplete']")
    WebElement fromsearch;


    @FindBy(xpath = "//*[@data-ui-name='input_location_to_segment_0']")
    WebElement destination;

    @FindBy(xpath = "//*[@data-ui-name='input_text_autocomplete']")
    WebElement writedestination;

    @FindBy(xpath = "//*[@data-ui-name='locations_list_item']")
    WebElement selectDestination;

    @FindBy(xpath = "//*[@data-ui-name='button_search_submit']")
    WebElement searchFlights;
    public HomePageLocationTest() throws Exception {
        PageFactory.initElements(driver,this);
    }

    //checkLocations Methods contains the to and from Locations details
    public void checklocations() throws InterruptedException, AWTException {
        value1=tolocate;
        value2=destin;
        fromclick.click();
        fromcancle.click();
        fromsearch.sendKeys(tolocate);
        Thread.sleep(5000);
        Robot robot = new Robot();

        // Simulate pressing the down arrow key
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        destination.click();
        writedestination.sendKeys(destin);
        selectDestination.click();
        searchFlights.click();


    }
}
