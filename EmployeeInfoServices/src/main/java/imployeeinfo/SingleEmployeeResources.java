package imployeeinfo;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SingleEmployeeResources {
    String baseUrl = "http://info.venturepulse.org:8080/service-webapp";


    public void callSingleEmployeeWithValidRequest() {
        Response response = given().when().get(baseUrl + "/api/SingleEmployeeResources/590a4acd35522970c7956cdf").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.statusCode();
        String body = response.getBody().prettyPrint();
        System.out.println(statusLine);
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);

    }

    public void callSingleEmployeeWithInvalidRequest() {
        Response response = given().when().get(baseUrl + "/api/NoSingleEmployeeResources/590a4acd35522970c7956cdf").then().statusCode(404).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.statusCode();
        String body = response.getBody().prettyPrint();
        System.out.println(statusLine);
        Assert.assertEquals(statusLine, "HTTP/1.1 404 Not Found");
        Assert.assertEquals(statusCode, 404);

    }
}
