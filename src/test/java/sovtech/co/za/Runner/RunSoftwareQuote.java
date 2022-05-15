package sovtech.co.za.Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
        monochrome = true,
        //dryRun = false,
        features = {"src/test/java/sovtech/co/za/Feature/SoftwareQuote"},
        tags={"@Regression"},
        glue = {"sovtech.co.za.StepDefinition"},
        plugin = {"pretty",
                "html:target/cucumber-htmlreport",
                "json:target/cucumber-reportSoftwareQuote.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReportSoftwareQuote.html"})
@Test
public class RunSoftwareQuote extends AbstractTestNGCucumberTests{
}
