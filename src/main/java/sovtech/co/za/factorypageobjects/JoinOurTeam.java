package sovtech.co.za.factorypageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JoinOurTeam {

    WebDriver driver;

    @FindBy(xpath="//header/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[4]/a[1]/span[1]")
    private WebElement dprAboutUs;

    @FindBy(xpath="//span[contains(text(),'Join our team')]")
    private WebElement btn_JoinOurTeam;

    @FindBy(xpath="//span[contains(text(),'Apply Below')]")
    private WebElement btnApplyBelow;

    @FindBy(xpath="//span[contains(text(),'Quality Assurance Tester')]")
    private WebElement linkQualityAssurance;

    @FindBy(xpath="//span[contains(text(),'Quality Assurance Tester')]")
    private WebElement lblQualityAssuranceTestheading;

    @FindBy(xpath="//span[contains(text(),'Apply for this position')]")
    private WebElement btn_ApplyforThiPosition;

    public JoinOurTeam(WebDriver driver){
        this.driver=driver;
    }

    public boolean clickAboutUs(){

        try{
            dprAboutUs.isDisplayed();
            dprAboutUs.click();
            return true;
        }
        catch(Exception ex)
        {
            System.out.print("[ERROR] "+ex.getMessage());
            return false;
        }


    }

    public boolean scrollDowntoJointOurTeamBtn(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", btn_JoinOurTeam);
        return true;
    }

    public boolean clickJoinOurTeam(){

        btn_JoinOurTeam.isDisplayed();
        btn_JoinOurTeam.click();
        return true;
    }

}
