package sanity;

import org.testng.annotations.Test;
import utilites.CommonOps;
import workFlows.EntityFramework.EntityFrameworkFlow;

public class EntityFrameworkTest extends CommonOps {

    @Test(description = "click and verify Entity Framework page exist")
    public void test_01_verify_Entity_Framework(){
        EntityFrameworkFlow.test01_go_to_entity_framework();
    }
}
