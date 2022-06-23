package workFlows.ManualCRUDOperations;

import com.google.common.util.concurrent.Uninterruptibles;
import extenstions.UIActions;
import extenstions.Verification;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.ManualCRUDOperationsPage;
import utilites.CommonOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddNewRecFlow extends CommonOps {
    @Step("add new rec")
    public static void test01_add_new_rec(String productName, String unitInPrice, String price){


        if (manualCRUDOperations.btn_accept_cookies.isDisplayed()){
            Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
            UIActions.click(manualCRUDOperations.btn_accept_cookies);
        }
        UIActions.click(manualCRUDOperations.btn_add_new_rec);
        UIActions.updateText(manualCRUDOperations.txt_Product_Name, productName);
        UIActions.updateText(manualCRUDOperations.txt_Unit_In_Stock, unitInPrice);
        UIActions.updateText(manualCRUDOperations.txt_price, price);
        UIActions.click(manualCRUDOperations.btn_confirm);
    }

    @Step("verify added success")
    public static void test_02_verify_added(String productName, String unitInPrice, String price){
        ops.addArguments("--disable-notifications");
        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
        UIActions.click(manualCRUDOperations.btn_last_page);
        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);

//        List<WebElement> lastProdName = driver.findElements(By.xpath("//tr[@class= \"rgRow\" or @class=\"rgAltRow\"]/td[3]"));
//        List <WebElement> realLastProdName = null;
//
//        for(int i=1; i>=10;i++){
//            if(lastProdName.get(i).isDisplayed()){
//                realLastProdName =lastProdName;
//            }
//        }
//        Verification.verifyTextInElement((WebElement) realLastProdName,productName);


        Verification.verifyTextInElement(VerifyManualCRUDOperationsFlow.manualCRUDOperations.ver_new_product_name, productName);
        Verification.verifyTextInElement(VerifyManualCRUDOperationsFlow.manualCRUDOperations.ver_new_unit_in_stock, unitInPrice);
        Verification.verifyTextInElement(VerifyManualCRUDOperationsFlow.manualCRUDOperations.ver_new_price, price);
    }
}
