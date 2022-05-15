package sovtech.co.za.StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

import static sovtech.co.za.core.BaseClass.ourClientsPgObjects;

public class SoftwareQouteStepDef {

    @And("^User clicks on Clients dropdown$")
    public void userClicksOnClientsDropdown() {
        ourClientsPgObjects.clickClient();
    }

    @And("^User scrolls down to Software Quote$")
    public void userScrollsDownToSoftwareQuote() {
        ourClientsPgObjects.scrollDown();
    }

    @And("^User enters Full Names \"([^\"]*)\"$")
    public void userEntersFullNames(String fullName) {
        ourClientsPgObjects.enter_FullName(fullName);
    }

    @And("^User enters Work Email Address \"([^\"]*)\"$")
    public void userEntersWorkEmailAddress(String emailAddress) {
        ourClientsPgObjects.enter_WorkEmailAddress(emailAddress);
    }

    @And("^User enters Mobile Number \"([^\"]*)\"$")
    public void userEntersMobileNumber(String contactNumber) {
        ourClientsPgObjects.enter_ContactNunber(contactNumber);
    }

    @And("^User selects second option for Company Size$")
    public void userSelectsSecondOptionForCompanySize() {
        ourClientsPgObjects.selectCompanySize();
    }


    @And("^User selects third option for How can we help you$")
    public void userSelectsThirdOptionForHowCanWeHelpYou() {
        ourClientsPgObjects.selectHowCanWeHelp();
    }

    @And("^User user enters a message \"([^\"]*)\"$")
    public void userUserEntersAMessage(String message) {
        ourClientsPgObjects.enter_Message(message);
    }

    @And("^User clicks button Submit$")
    public void userClicksButtonSubmit() {
        ourClientsPgObjects.clickSubmit();
    }
}
