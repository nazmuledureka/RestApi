package getEmployeeInfo;

import imployeeinfo.AllEmployeeResourcesApi;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetAllEmployeeProfile extends AllEmployeeResourcesApi {

    @Test
    public void getAllEmployee(){
        callAllEmployeeInfoWithValidRequest();
    }


}
