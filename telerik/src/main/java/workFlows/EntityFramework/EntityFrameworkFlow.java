package workFlows.EntityFramework;

import extenstions.UIActions;
import extenstions.Verification;
import io.qameta.allure.Step;
import utilites.CommonOps;

public class EntityFrameworkFlow extends CommonOps {

    @Step("click and verify Entity Framework page exist")
    public static void test01_go_to_entity_framework(){
        UIActions.click(manualCRUDOperations.btn_Entity_Framework_title);
        Verification.verifyTextInElement(entityFrameworkPage.ver_Entity_Framework_title, "Entity Framework - Binding and CRUD Operations");
    }
}
