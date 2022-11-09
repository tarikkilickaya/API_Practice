package day04;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import org.testng.asserts.SoftAssert;
import pojos.CountryPost;
import utilities.GMIBankBaseURL;
import utilities.JsonUtil;

import static io.restassured.RestAssured.given;

public class PostRequest extends GMIBankBaseURL {


    // https://www.gmibank.com/api/tp-countries adresine yeni bir ülke ekleyin
    @Test
    public void post01() {

        // Set the URL
        spec01.pathParam("first", "tp-countries");

        // Set the expected data
        CountryPost countryPost = new CountryPost("Batch81");

        // Send the request and get the response
        Response response = given().contentType(ContentType.JSON).
                headers("Authorization", "Bearer " + generateToken()).
                spec(spec01).when().body(countryPost).
                post("{first}");

        response.prettyPrint();

        // Do Assertion
        CountryPost actualData = JsonUtil.convertJsonToJava(response.asString(), CountryPost.class);

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(countryPost.getName(), actualData.getName());

        softAssert.assertAll();

    }
}