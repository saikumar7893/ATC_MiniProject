package PageObjects;

import BaseTest.BaseClass;
import Utilities.ReadPropertyFile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage extends BaseClass {

    String mailid= ReadPropertyFile.getProperty1("mail");
    String phonenum= ReadPropertyFile.getProperty1("mobile");

    String fname= ReadPropertyFile.getProperty1("name");

    String lname= ReadPropertyFile.getProperty1("surname");

    @FindBy(xpath = "//*[@autocomplete='email']")
    WebElement contactemail;

    @FindBy(xpath = "//*[@aria-label='Phone number']")
    WebElement phonenumber;

    @FindBy(xpath = "//*[@autocomplete='given-name']")
    WebElement firstname;

    @FindBy(xpath = "//*[@autocomplete='family-name']")
    WebElement lastname;


    @FindBy(xpath = "//select[@name='passengers.0.gender']/option[@value='male']")
    WebElement gender;

    @FindBy(xpath = "//*[@data-testid='checkout_extras_inner_next']")
    WebElement next;


    public ContactInformationPage() throws Exception {
        PageFactory.initElements(driver,this);
    }

    //Details Method contains all the input values for the ContactInformationPage
    public void Details()
    {
        contactemail.sendKeys(mailid);
        phonenumber.sendKeys(phonenum);
        firstname.sendKeys(fname);
        lastname.sendKeys(lname);
        gender.click();
        next.click();
    }
}
