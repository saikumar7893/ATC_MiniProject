package PageObjects;

import BaseTest.BaseClass;
import Utilities.ReadPropertyFile;
import org.apache.poi.ss.formula.functions.WeekNum;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

import static BaseTest.BaseClass.driver;

public class HomePage extends BaseClass {
    String place= ReadPropertyFile.getProperty1("Destination");
    String from= ReadPropertyFile.getProperty1("FromLocation");

    //for clicking the fromlocation
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

    @FindBy(xpath = "//*[@data-ui-name='button_date_segment_0']")
    WebElement selectDates;

    @FindBy(xpath = "//*[@data-date='2024-02-05']")
    WebElement boardingdate;

    @FindBy(xpath = "//*[@data-date='2024-03-05']")
    WebElement returndate;

    @FindBy(xpath = "//*[@data-ui-name='button_search_submit']")
    WebElement searchFlights;
    public HomePage() throws Exception {
        PageFactory.initElements(driver,this);
    }

    public void EnterDetails() throws AWTException, InterruptedException {
        fromclick.click();
        fromcancle.click();
        fromsearch.sendKeys(from);
        Thread.sleep(5000);
        Robot robot = new Robot();

        // Simulate pressing the down arrow key
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        destination.click();
        writedestination.sendKeys(place);
        selectDestination.click();
        selectDates.click();
        boardingdate.click();
        returndate.click();
        searchFlights.click();


    }
}
