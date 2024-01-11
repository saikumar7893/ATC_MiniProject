package PageObjects;
import BaseTest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SeatSelection extends BaseClass {


    @FindBy(xpath = "//*[text()='Skip']")
    WebElement skip;
    public SeatSelection()
    {
        PageFactory.initElements(driver,this);
    }
    public void selecttickets()
    {
        skip.click();
    }
}
