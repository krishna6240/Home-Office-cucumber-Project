package gov.uk.check.visa.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uk.check.visa.pages.*;

public class HomeOfficeSteps {


    @Given("^I am on the Check UK visa website$")
    public void iAmOnTheCheckUKVisaWebsite() {

    }


    @Then("^I will be informed 'You will not need a visa to come to the UK'$")
    public void iWillBeInformedYouWillNotNeedAVisaToComeToTheUK() {
        new ResultPage().confirmResultMessage("You will not need a visa to come to the UK");
    }




    @And("^I state I am intending to stay for 'more' than (\\d+) months$")
    public void iStateIAmIntendingToStayForMoreThanMonths(int moreOrless) {
        new DurationOfStayPage().selectLengthOfStay("moreOrLess");
    }

    @And("^I state I have planning to work 'health' types of job$")
    public void iStateIHavePlanningToWorkHealthTypesOfJob() {
        new WorkTypePage().selectJobType("Health and care professional");

    }


    @Then("^I will be informed 'You need a visa to work in health and care'$")
    public void iWillBeInformedYouNeedAVisaToWorkInHealthAndCare() {
        new ResultPage().confirmResultMessage("You need a visa to work in health and care");
    }



    @And("^I select reason 'family'$")
    public void iSelectReasonFamily() {
        new ReasonForTravelPage().selectReasonForVisit("Join partner or family for a long stay");

    }

    @And("^I state My partner or family member have uk immigration status 'yes'$")
    public void iStateMyPartnerOrFamilyMemberHaveUkImmigrationStatusYes() {
        new FamilyImmigrationStatusPage().selectImmigrationStatus("yes");

    }

    @Then("^I will be informed 'You’ll need a visa to join your family or partner in the UK'$")
    public void iWillBeInformedYouLlNeedAVisaToJoinYourFamilyOrPartnerInTheUK() {
        new ResultPage().confirmResultMessage("You’ll need a visa to join your family or partner in the UK");
    }

    @And("^I click on next button$")
    public void iClickOnNextButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new ReasonForTravelPage().clickOnNextStepButton();
    }

    @When("^I select a nationality of 'australia'$")
    public void iSelectANationalityOfAustralia() {
        new SelectNationalityPage().selectNationality("australia");
    }

    @And("^I select reason 'tourism'$")
    public void iSelectReasonTourism() {
        new ReasonForTravelPage().selectReasonForTravel();
    }

    @And("^I start visa check$")
    public void iStartVisaCheck() {
      new StartPage().clickStartNow();
    }

    @And("^I select a nationality of 'chile'$")
    public void iSelectANationalityOfChile() {
        new SelectNationalityPage().selectNationality("chile");
    }

    @And("^I select reason 'Work, academic visit or business'$")
    public void iSelectReasonWorkAcademicVisitOrBusiness() {
        new ReasonForTravelPage().clickReasonForTravel();

    }

    @And("^I select a nationality  of 'colombia'$")
    public void iSelectANationalityOfColombia() {
        new SelectNationalityPage().selectNationalitySelect("colombia");
    }
}
