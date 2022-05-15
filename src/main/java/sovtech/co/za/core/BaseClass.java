package sovtech.co.za.core;

import org.openqa.selenium.WebDriver;
import sovtech.co.za.factorypageobjects.FillinFormPgObject;
import sovtech.co.za.factorypageobjects.JoinOurTeam;
import sovtech.co.za.factorypageobjects.OurClientsPgObjects;
import sovtech.co.za.tools.SeleniumDriverUtility;

public class BaseClass {

    private static WebDriver driver;
    private static SeleniumDriverUtility SeleniumDriverInstance;
    private static SeleniumDriverUtility.BrowserType browser;
    public static FillinFormPgObject fillFrmPgObj;
    public static OurClientsPgObjects ourClientsPgObjects;
    public static JoinOurTeam joinOurteampgObject;

    public static void setUpSeleniumDriver(){

        browser = SeleniumDriverUtility.BrowserType.CHROME;
        SeleniumDriverInstance = new SeleniumDriverUtility(browser);
    }

    public static void initializePageObjects(){

        driver = SeleniumDriverInstance.getDriver();
        fillFrmPgObj = new FillinFormPgObject(driver);
        ourClientsPgObjects = new OurClientsPgObjects(driver);
        joinOurteampgObject = new JoinOurTeam(driver);
    }

    public static void navigateTosite(String url){
        driver.navigate().to(url);
    }

    public static void closeBrowser(){
        driver.quit();
        driver=null;
    }
}
