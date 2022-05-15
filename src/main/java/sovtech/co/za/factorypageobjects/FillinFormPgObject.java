package sovtech.co.za.factorypageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import sovtech.co.za.tools.SeleniumDriverUtility;

public class FillinFormPgObject {

    WebDriver driver;

    //Constructor, as every page needs a Webdriver to find elements

    //locating the Name
    @FindBy(xpath="//a[@class='saspot-btn saspot-small-btn']")
    private WebElement btn_StartProject;

    @FindBy(xpath="//h1[contains(text(),'Start a project')]")
    private WebElement lbl_StartaProject;

    @FindBy(xpath="/html[1]/body[1]/div[1]/form[1]/fieldset[1]/div[1]/legend[1]")
    private WebElement txt_FullName;

    @FindBy(xpath = "//input[@value='Submit']")
    private WebElement btn_Submit;


    public FillinFormPgObject(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(this.driver,this);
    }

    public boolean waitForProjectStartButton() throws Exception {
        btn_StartProject.isDisplayed();
        return true;
    }

    public boolean waitForStartaProjectHeading(){
        lbl_StartaProject.isDisplayed();
        lbl_StartaProject.click();
        return true;
    }

    public boolean clickProjectStartButton() throws Exception {
        btn_StartProject.click();
        return true;
    }

    public boolean enterFullName(String fullName){

            txt_FullName.click();
            txt_FullName.sendKeys(fullName);
            return true;
    }

    public boolean clickPButtonSubmit(){
        btn_Submit.isDisplayed();
        btn_Submit.click();
        return true;
    }

}
