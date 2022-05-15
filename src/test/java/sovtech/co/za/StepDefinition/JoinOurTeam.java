package sovtech.co.za.StepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static sovtech.co.za.core.BaseClass.joinOurteampgObject;

public class JoinOurTeam {
    @And("^User clicks About Us$")
    public void userClicksAboutUs() throws Exception{
        Thread.sleep(5000);
        joinOurteampgObject.clickAboutUs();
    }

    @And("^User User scrolls down to Join out team$")
    public void userUserScrollsDownToJoinOutTeam() {
        joinOurteampgObject.scrollDowntoJointOurTeamBtn();
    }

    @And("^User clicks Join our team button$")
    public void userClicksJoinOurTeamButton() {
        joinOurteampgObject.clickJoinOurTeam();
    }

    @Then("^User validates Join our team page$")
    public void userValidatesJoinOurTeamPage() {
    }

    @And("^User clicks Apply Below button$")
    public void userClicksApplyBelowButton() {
    }

    @And("^User selcts Qaulity Assurance Tester option$")
    public void userSelctsQaulityAssuranceTesterOption() {
    }

    @Then("^User scroll down to Apply for this position button$")
    public void userScrollDownToApplyForThisPositionButton() {
    }

    @And("^User clicks button Apply for this position$")
    public void userClicksButtonApplyForThisPosition() {
    }
}
