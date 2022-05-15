package sovtech.co.za.StepDefinition;

import com.cucumber.listener.Reporter;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;

import static sovtech.co.za.core.BaseClass.*;

public class StartProjectStepDef {

    @Before(order = 1)
    public void BeforeStep() throws Exception {
        Reporter.assignAuthor("SovTech-QA");
        setUpSeleniumDriver();
    }

    @Before(order = 2)
    public void BeforeStep1() throws Exception {
        initializePageObjects();
    }

    @Given("^User navigates to sovtech website \"([^\"]*)\"$")
    public void userNavigatesToSovtechWebsite(String url) throws Throwable {
        navigateTosite(url);
    }

    @And("^User needs to be on sovtech home_page$")
    public void userNeedsToBeOnSovtechHome_page() throws Exception {
        fillFrmPgObj.waitForProjectStartButton();
    }

    @And("^User clicks on start_a_project button$")
    public void userClicksOnStart_a_projectButton() throws Exception {
        fillFrmPgObj.clickProjectStartButton();
    }

    @And("^User validates page heading Start a project$")
    public void userValidatesPageHeadingStartAProject() {
        fillFrmPgObj.waitForStartaProjectHeading();
    }

    @And("^User enters Full Name \"([^\"]*)\"$")
    public void userEntersFullName(String fullName) throws Throwable {
//        Thread.sleep(5000);
        fillFrmPgObj.enterFullName(fullName);
        System.out.print("Name is "+fullName);

    }

    @And("^User enters Work Email \"([^\"]*)\"$")
    public void userEntersWorkEmail(String arg0) throws Throwable {

    }

    @And("^User enters Contact Number \"([^\"]*)\"$")
    public void userEntersContactNumber(String arg0) throws Throwable {

    }

    @And("^User selects Company Size \"([^\"]*)\"$")
    public void userSelectsCompanySize(String arg0) throws Throwable {

    }

    @And("^User gives more details about the project \"([^\"]*)\"$")
    public void userGivesMoreDetailsAboutTheProject(String arg0) throws Throwable {

    }

    @And("^User clicks Submit button$")
    public void userClicksSubmitButton() throws Exception{
        Thread.sleep(5000);
        fillFrmPgObj.clickPButtonSubmit();
    }

    @Then("^User closes browser$")
    public void userClosesBrowser()throws Exception {
//        Thread.sleep(2000);
//        closeBrowser();
    }
}
