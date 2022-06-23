package workFlows.ManualCRUDOperations;

import extenstions.Verification;
import io.qameta.allure.Step;
import utilites.CommonOps;

public class VerifyManualCRUDOperationsFlow extends CommonOps {
    @Step("verify title Manual CRUD Operations exists ")
    public static void verify_Manual_CRUD_Operations_page(){
        Verification.verifyTextInElement(manualCRUDOperations.ver_title, "Manual CRUD Operations");
    }

}
