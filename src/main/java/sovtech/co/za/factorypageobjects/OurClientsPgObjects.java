package sovtech.co.za.factorypageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurClientsPgObjects {

    private WebDriver driver;

    //Constructor, as every page needs a Webdriver to find elements
    @FindBy(xpath="//header/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]/span[1]")
    private WebElement drpClients;

    @FindBy(xpath="//h2[contains(text(),'Get Your Custom Software Quote')]")
    private WebElement softwareQuotes;

    @FindBy(xpath = "//input[@name='your_name']")
    private WebElement txtFullName;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement txtWorkEmail;

    @FindBy(xpath = "//input[@name='phone']")
    private WebElement txtcontactNumber;

    @FindBy(xpath = "//select[@name='numemployees']")
    private WebElement drpNoEmployees;

    @FindBy(xpath = "//option[@value='5-25']")
    private WebElement companySize_option2;

    @FindBy(xpath = "//select[@name='what_kind_of_problem_is_your_business_currently_facing_']")
    private WebElement howCanWeHelp;

    @FindBy(xpath = "//option[@value='Scale engineering with managed teams']")
    private WebElement scaleEngineeroption;

    @FindBy(xpath = "//textarea[@name='message']")
    private WebElement txtMessage;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement btnSubmit;


    public OurClientsPgObjects(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public boolean scrollDown(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", softwareQuotes);
        return true;
    }

    public boolean clickClient(){
        drpClients.isDisplayed();
        drpClients.click();
        return true;
    }

    public boolean enter_FullName(String fullName){
        txtFullName.isDisplayed();
        txtFullName.sendKeys(fullName);
        return true;
    }

    public boolean enter_WorkEmailAddress(String workEmailAddress){
        txtWorkEmail.isDisplayed();
        txtWorkEmail.sendKeys(workEmailAddress);
        return true;
    }

    public boolean enter_ContactNunber(String contactNumbet){
        txtcontactNumber.isDisplayed();
        txtcontactNumber.sendKeys(contactNumbet);
        return true;
    }

    public boolean selectCompanySize(){
        drpNoEmployees.isDisplayed();
        drpNoEmployees.click();
        companySize_option2.isDisplayed();
        companySize_option2.click();
        return true;
    }

    public boolean selectHowCanWeHelp(){
        howCanWeHelp.isDisplayed();
        howCanWeHelp.click();
        scaleEngineeroption.isDisplayed();
        scaleEngineeroption.click();
        return true;
    }

    public boolean enter_Message(String message){
        txtMessage.isDisplayed();
        txtMessage.sendKeys(message);
        return true;
    }

    public boolean clickSubmit(){
        btnSubmit.isDisplayed();
        btnSubmit.click();
        return true;
    }
}
