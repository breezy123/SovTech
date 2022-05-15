package sovtech.co.za.Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
        monochrome = true,
        //dryRun = false,
        features = {"src/test/java/sovtech/co/za/Feature/JoinTeam"},
        tags={"@Regression"},
        glue = {"sovtech.co.za.StepDefinition"},
        plugin = {"pretty",
                "html:target/cucumber-htmlreport",
                "json:target/cucumber-reportJoinTeam.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReportJoinTeam.html"})
@Test
public class RunJoinOurTeam extends AbstractTestNGCucumberTests{
}
