package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utility {
    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='current-question']//div[@class='gem-c-radio govuk-radios__item']/input[@id='response-0']")
    WebElement yesRB;
    @CacheLookup
    @FindBy(css = "#response-1")
    WebElement noRB;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement next;

    public void selectImmigrationStatus(String status) {
        switch (status) {
            case "yes":

                Reporter.log("Click on yes'" + "' link <br>");
                clickOnElement(yesRB);
                break;
            case "no":

                Reporter.log("Click on no'"  + "' link <br>");
                clickOnElement(noRB);
                break;
            default:
               /* System.out.println("Please select an option");
                for (WebElement menu : immigrationStatus) {
                    if (menu.getText().equals(status)) {
                        clickOnElement(menu);
                        CustomListeners.node.log(Status.PASS, "Select immiguration status: '" + status + "' radio button");
                        Reporter.log("Select immiguration status '" + status + "' radio button <br>");
                        break;
                    }
                }*/
        }
    }
    public void clickOnContinue(){

        Reporter.log("Click on next step" + "<br>");
        clickOnElement(next);
    }
}