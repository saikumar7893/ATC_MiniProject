package PageObjects;
import BaseTest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class FlightsSelect extends BaseClass {

    @FindBy(xpath = "//*[@aria-describedby='flight-card-1']")
    WebElement flightdetails;

    @FindBy(xpath = "//*[text()='1 cabin bag']")
    WebElement cabinbag;

    @FindBy(xpath = "//*[text()='1 checked bag']")
    WebElement checkbag;

    @FindBy(xpath = "//*[@data-testid='flight_details_inner_modal_select_button']")
    WebElement selectTickets;

    @FindBy(xpath = "//*[@data-testid='checkout_ticket_type_inner_next']")
    WebElement standardticket;

    public FlightsSelect()
    {
        PageFactory.initElements(driver,this);

    }
    public static String cabinBag;
    public static String checkBag;

    //SearchFlight Method contains the selection of flights and baggageDetails
    public void searchflight() throws InterruptedException {
        flightdetails.click();
        Thread.sleep(5000);
        cabinBag=cabinbag.getText();
        checkBag=checkbag.getText();
        selectTickets.click();
        standardticket.click();
    }
}
