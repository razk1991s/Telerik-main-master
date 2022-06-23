package sanity;

import org.testng.annotations.Test;
import utilites.CommonOps;
import workFlows.ManualCRUDOperations.EditFirstProductFlow;

public class EditFirstProductTest extends CommonOps {
    @Test(description = "TEST 01 edit first product")
    public void test_01_edit_first_product(){
        EditFirstProductFlow.test01_edit_first_product("Raz","50","20");

    }

    @Test(description = "TEST 02 verify edit successful")
    public void test_02_verify_edit_successful(){
        EditFirstProductFlow.test02_verify_edit_successful("Raz","50","$20.00");
    }

}
