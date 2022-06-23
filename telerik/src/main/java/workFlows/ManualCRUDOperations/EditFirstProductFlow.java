package workFlows.ManualCRUDOperations;

import com.google.common.util.concurrent.Uninterruptibles;
import extenstions.UIActions;
import extenstions.Verification;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilites.CommonOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EditFirstProductFlow extends CommonOps {
    @Step("edit first product")
    public static void test01_edit_first_product(String productName, String unitInPrice, String price) {

        if (manualCRUDOperations.btn_accept_cookies.isDisplayed()){
            Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
            UIActions.click(manualCRUDOperations.btn_accept_cookies);
        }
        UIActions.click(manualCRUDOperations.edit_first);
        UIActions.clear(manualCRUDOperations.txt_Product_Name);
        UIActions.updateText(manualCRUDOperations.txt_Product_Name, productName);
        UIActions.clear(manualCRUDOperations.txt_Unit_In_Stock);
        UIActions.updateText(VerifyManualCRUDOperationsFlow.manualCRUDOperations.txt_Unit_In_Stock, unitInPrice);
        UIActions.clear(manualCRUDOperations.txt_price);
        UIActions.updateText(VerifyManualCRUDOperationsFlow.manualCRUDOperations.txt_price, price);
        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
        UIActions.click(manualCRUDOperations.btn_confirm);
        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
    }

    public static void test02_verify_edit_successful(String productName, String unitInPrice, String price) {

        List<WebElement> lastProdName = driver.findElements(By.xpath("//tr[@class='rgRow' or @class='rgAltRow']/td[3]"));
//        Verification.verifyTextInElement(lastProdName.get(lastProdName.size()-1).getText(),productName);


//
//        List <WebElement> realLastProdName = null;
//
//        for(int i=1; i>=10;i++){
//            if(lastProdName.get(i).isDisplayed()){
//                realLastProdName =lastProdName;
//            }
//        }
//        Verification.verifyTextInElement((WebElement) realLastProdName, productName);



        Verification.verifyTextInElement(manualCRUDOperations.ver_edit_product_name, productName);
        Verification.verifyTextInElement(manualCRUDOperations.ver_edit_unit_in_stock, unitInPrice);
        Verification.verifyTextInElement(manualCRUDOperations.ver_edit_price, price);
    }


}
