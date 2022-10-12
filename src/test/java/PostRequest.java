import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pojos.CreateUserRequest;

import static io.restassured.RestAssured.given;

public class PostRequest {
    @BeforeClass
    public void baseURI()
    {
        RestAssured.baseURI="https://simpleemployeerestapi.azurewebsites.net/api/login";
    }
    @Test
    public void postNegEmail()
    {
        CreateUserRequest requestbody= new CreateUserRequest();
        requestbody.setEmail("ritusree.mandaal@gds.ey.com");
        requestbody.setPassword("12345678");
        given()
                .relaxedHTTPSValidation().header("Content-type","application/json")
                .log().all()
                .body(requestbody)
                .when().post().then()
                .statusCode(401)
                .log().all();
    }
    @Test
    public void postNegPass()
    {
        CreateUserRequest requestbody= new CreateUserRequest();
        requestbody.setEmail("ritusree.mandal@gds.ey.com");
        requestbody.setPassword("123456789");
        given()
                .relaxedHTTPSValidation().header("Content-type","application/json")
                .log().all()
                .body(requestbody)
                .when().post().then()
                .statusCode(401)
                .log().all();
    }

    @Test
    public void createUserFromPojo()
    {
        //RestAssured.baseURI="https://simpleemployeerestapi.azurewebsites.net/api/login";

        CreateUserRequest requestbody= new CreateUserRequest();
        requestbody.setEmail("ritusree.mandal@gds.ey.com");
        requestbody.setPassword("12345678");

        given()
                .relaxedHTTPSValidation().header("Content-type","application/json")
                .log().all()
                .body(requestbody)
                .when().post().then()
                .statusCode(200)
                .log().all();
    }

}