import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest01 {
    @Test
    public void test01() {

        String url = "https://restful-booker.herokuapp.com/booking";

        Response response = given().when().get(url);

        System.out.println(response.statusCode());
        System.out.println(response.statusLine());
        System.out.println(response.contentType());

        Assert.assertEquals(200, response.getStatusCode());
        Assert.assertEquals("HTTP/1.1 200 OK", response.getStatusLine());
        Assert.assertEquals("application/json; charset=utf-8", response.getContentType());

        response.then().assertThat().statusCode(200).statusLine("HTTP/1.1 200 OK").contentType(ContentType.JSON);
    }
}