package workFlows.EntityFramework;

import com.google.common.util.concurrent.Uninterruptibles;
import extenstions.UIActions;
import extenstions.Verification;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import utilites.CommonOps;

import java.util.concurrent.TimeUnit;

public class EntityFrameworkFlow extends CommonOps {

    @Step("click and verify Entity Framework page exist")
    public static void test01_go_to_entity_framework(){
        if (manualCRUDOperations.btn_accept_cookies.isDisplayed()){
            Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
            UIActions.click(manualCRUDOperations.btn_accept_cookies);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)", "");
        UIActions.click(manualCRUDOperations.btn_Entity_Framework_title);
        Verification.verifyTextInElement(entityFrameworkPage.ver_Entity_Framework_title, "Entity Framework - Binding and CRUD Operations");
    }
}
