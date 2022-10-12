import api.PutApi;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojos.PutRequest;
import pojos.PutResponse;

public class PutOperation {

    @Test
    public void triggerPut()
    {
        PutRequest putRequestPayload=new PutRequest();
        putRequestPayload.setJob("zion resident");
        putRequestPayload.setName("morpheus");

        Response putResponse= PutApi.putApiCall(putRequestPayload,"2");
        PutResponse putResponseBody= putResponse.as(PutResponse.class);

        Assert.assertEquals(putResponseBody.getJob(),putRequestPayload.getJob());
        Assert.assertEquals(putResponseBody.getName(),putRequestPayload.getName());
    }

}
