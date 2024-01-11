import BaseTest.BaseClass;
import PageObjects.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class BookingFlight extends BaseClass {

    @BeforeMethod
    public void LaunchingBrowser() throws Exception {
        launchBrowser();
    }

    @Test
    public void Login() throws Exception
    {
    //HomePage Object
    HomePage home=new HomePage();
    home.EnterDetails();

    //FlightSelect Object
    FlightsSelect flights=new FlightsSelect();
    flights.searchflight();

    //ContactInfo PageObject
    ContactInformationPage info=new ContactInformationPage();
    info.Details();

    //SeatSelection Object
    SeatSelection seat=new SeatSelection();
    seat.selecttickets();

    }

    @AfterMethod
    public void Finalevaluation() throws Exception {

        //Evaluating or Asserting in the DetailsVerification PageObjects
        DetailsVerification evaluate=new DetailsVerification();
        evaluate.verify();
        System.out.println("Token: Success");

    }
}
