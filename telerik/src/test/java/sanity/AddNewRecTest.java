package sanity;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilites.CommonOps;
import workFlows.ManualCRUDOperations.AddNewRecFlow;

@Listeners(utilites.Listeners.class)
public class AddNewRecTest extends CommonOps {
    @Test(description = "TEST 01 add new rec")
    public void test_01_add_new_rec(){
        AddNewRecFlow.test01_add_new_rec("new prod", "100","10");
    }

    @Test(description = "verify added successfuly")
    public void test_02_verify_added(){
        AddNewRecFlow.test_02_verify_added("new prod", "100","$10.00");
    }
}
