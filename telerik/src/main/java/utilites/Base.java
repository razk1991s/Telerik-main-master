package utilites;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pageObjects.*;

public class Base {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Actions action;
    protected static SoftAssert softAssert;
    protected static String platform;
    protected static ChromeOptions ops = new ChromeOptions();

    //Page Objects
    protected static ManualCRUDOperationsPage manualCRUDOperations;
    protected static EntityFrameworkPage entityFrameworkPage;





}
