package getEmployeeInfo;

import imployeeinfo.SingleEmployeeResources;
import org.testng.annotations.Test;

public class GetSingleEmployeeProfile extends SingleEmployeeResources {

    @Test
    public void getSingleEmployeeWithValidRequest(){
        callSingleEmployeeWithValidRequest();
    }

    @Test
    public void getSingleEmployeeWithInvalidRequest(){
    callSingleEmployeeWithInvalidRequest();
    }
}
