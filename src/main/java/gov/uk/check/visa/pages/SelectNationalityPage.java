package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {
    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueAfterNationality;
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList1;


    public void selectNationality(String nationality) {
        selectByValueFromDropDown(nationalityDropDownList, nationality);

        Reporter.log("Select nationality '" + nationality + "' tab <br>");
    }

    public void clickNextStepButton() {
        clickOnElement(continueAfterNationality);

        Reporter.log("Click on next step" + "<br>");
    }
    public void selectNationalitySelect(String nationality) {
        selectByValueFromDropDown(nationalityDropDownList1, nationality);

        Reporter.log("Select nationality '" + nationality + "' tab <br>");
    }


}
