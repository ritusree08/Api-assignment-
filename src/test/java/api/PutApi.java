package api;

import io.restassured.response.Response;
import pojos.PutRequest;
import specs.PutSpecs;

import static io.restassured.RestAssured.given;

public class PutApi {
    public static Response putApiCall(PutRequest putRequestPayload, String path){
        return  given().spec(PutSpecs.putRequestSpec())
                .body(putRequestPayload)
                .when()
                .put(path)
                .then().spec(PutSpecs.putResponseSpec())
                .extract().response();
    }
}
