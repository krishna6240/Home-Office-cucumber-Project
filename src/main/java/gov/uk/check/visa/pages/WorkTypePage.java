package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class WorkTypePage extends Utility {
    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextPage;


    public void selectJobType(String jobType) {
       /*   for (WebElement menu : jobType) {
            if (menu.getText().equals(job)) {
                clickOnElement(menu);
                CustomListeners.node.log(Status.PASS, "Select Job Type '" + job + "' tab");
                Reporter.log("Select Job type '" + job + "' tab <br>");
                break;
            }
        }*/
        clickOnElement(By.xpath("//label[contains(text(),'"+jobType+"')]"));
    }
    public void clickOnNextStep(){
        clickOnElement(nextPage);

        Reporter.log("Click on continue button " + "<br>");
    }

}
