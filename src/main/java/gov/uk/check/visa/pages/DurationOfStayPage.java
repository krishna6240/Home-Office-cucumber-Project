package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DurationOfStayPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'6 months or less')]")
    WebElement lessThan6months;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'longer than 6 months')]")
    WebElement moreThan6months;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueAfterDuration;

    public void selectLengthOfStay(String moreOrLess) {
        moreOrLess = "more than 6 months";
        switch (moreOrLess) {
            case "more than 6 months":

                Reporter.log("Click on '" + moreThan6months + "' link <br>");
                clickOnElement(moreThan6months);
                break;
            case "6 months or less":

                Reporter.log("Click on '" + lessThan6months + "' link <br>");
                clickOnElement(lessThan6months);
                break;
            default:
                System.out.println("nothing selected");
               /* switch (moreOrLess) {
                    case "6 months or less":
                        selectStay.get(0).click();
                        break;
                    case "longer than 6 months":
                        selectStay.get(1).click();
                        break;
                }*/
        }
    }

    public void clickNextStep() {
       clickOnElement(continueAfterDuration);

        Reporter.log("ClicK on LOGOUT Link  " + "<br>");
    }
}

