package specs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class PutSpecs {
    public static RequestSpecification putRequestSpec(){
        return new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/")
                .setBasePath("/api/users")
                .setContentType(ContentType.JSON)
                .setRelaxedHTTPSValidation()
                .log(LogDetail.ALL)
                .build();
    }

    public static ResponseSpecification putResponseSpec(){
        return new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectStatusCode(200)
                .log(LogDetail.ALL)
                .build();
    }


}
