package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends Utility {
    public StartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reject additional cookies']")
    WebElement rejectCookies;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNow;

    public void clickOnRejectCookies(){
        /*CustomListeners.node.log(Status.PASS, "Click on reject cookies : " + rejectCookies.getText());
        Reporter.log("Clicking on " + rejectCookies.getText() + "<br>");*/
        clickOnElement(rejectCookies);
    }

    public void clickStartNow(){
        clickOnElement(startNow);
        /*clickOnElement(cookies);
        clickOnElement(startButton);
        CustomListeners.node.log(Status.PASS, "Click on Start Now ");
        Reporter.log("Click on Start Now " + "<br>");*/
    }

}