package utilites;

import org.openqa.selenium.support.PageFactory;
import pageObjects.*;


public class ManagePages extends Base {
    public static void initManualCRUDOperations(){
        manualCRUDOperations = PageFactory.initElements(driver, ManualCRUDOperationsPage.class);
        entityFrameworkPage = PageFactory.initElements(driver, EntityFrameworkPage.class);

    }
}
