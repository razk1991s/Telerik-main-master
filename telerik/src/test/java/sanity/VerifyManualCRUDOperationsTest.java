package sanity;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilites.CommonOps;
import workFlows.ManualCRUDOperations.VerifyManualCRUDOperationsFlow;


@Listeners(utilites.Listeners.class)
public class VerifyManualCRUDOperationsTest extends CommonOps {

    @Test(description = "TEST 01 verify where in Manual CRUD Operations page")

    public void test01_Verify_Manual_CRUD_Operations(){
        VerifyManualCRUDOperationsFlow.verify_Manual_CRUD_Operations_page();
    }

}
