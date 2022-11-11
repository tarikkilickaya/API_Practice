package day04;

import io.restassured.response.Response;
import org.junit.Test;
import org.testng.asserts.SoftAssert;
import pojos.Country;
import pojos.Customer;
import pojos.User;
import utilities.GMIBankBaseURL;
import utilities.JsonUtil;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class GetRequest09 extends GMIBankBaseURL {

    /*
http://www.gmibank.com/api/tp-customers/110452
 */

    @Test
    public void get08() {

        // Set the URL
        spec01.pathParams("bir", "tp-customers", "iki", 110452);


        // Set the expected data
        User user = new User(110016, "leopoldo.reinger", "Jasmine", "Stehr",
                "marni.zboncak@yahoo.com", true, "en", null, null);
        Country country = new Country(3, "USA", null);
        Customer expectedData = new Customer(110452, "Jasmine", "Stehr", "V", "marni.zboncak@yahoo.com",
                "463-609-2097", "1-112-497-0270", "16525", "14387 Al Ridge5343 Bert Burgs", "Waltermouth",
                "761-59-2911", "2021-11-28T21:00:00Z", false, country, "California", user);

        // Send the request and get the response
        Response response = given().spec(spec01).header("Authorization", "Bearer " + generateToken()).get("{bir}/{iki}");

        // Do Assertion
        Customer actualData = response.as(Customer.class);

        SoftAssert softAssert = new SoftAssert();
/*
        assertEquals(200, response.getStatusCode());



        softAssert.assertEquals(actualData.getId(), expectedData.getId());
        softAssert.assertEquals(actualData.getFirstName(), expectedData.getFirstName());
        softAssert.assertEquals(actualData.getLastName(), expectedData.getLastName());
        softAssert.assertEquals(actualData.getMiddleInitial(), expectedData.getMiddleInitial());
        softAssert.assertEquals(actualData.getEmail(), expectedData.getEmail());
        softAssert.assertEquals(actualData.getMobilePhoneNumber(), expectedData.getMobilePhoneNumber());
        softAssert.assertEquals(actualData.getPhoneNumber(), expectedData.getPhoneNumber());
        softAssert.assertEquals(actualData.getZipCode(), expectedData.getZipCode());
        softAssert.assertEquals(actualData.getAddress(), expectedData.getAddress());
        softAssert.assertEquals(actualData.getSsn(), expectedData.getSsn());
        softAssert.assertEquals(actualData.getCreateDate(), expectedData.getCreateDate());
        softAssert.assertEquals(actualData.getZelleEnrolled(), expectedData.getZelleEnrolled());
        softAssert.assertEquals(actualData.getCountry().getId(), expectedData.getCountry().getId());
        softAssert.assertEquals(actualData.getCountry().getName(), expectedData.getCountry().getName());
        softAssert.assertEquals(actualData.getCountry().getStates(), expectedData.getCountry().getStates());
        softAssert.assertEquals(actualData.getState(), expectedData.getState());
        softAssert.assertEquals(actualData.getUser().getId(), expectedData.getUser().getId());
        softAssert.assertEquals(actualData.getUser().getLogin(), expectedData.getUser().getLogin());
        softAssert.assertEquals(actualData.getUser().getFirstName(), expectedData.getUser().getFirstName());
        softAssert.assertEquals(actualData.getUser().getLastName(), expectedData.getUser().getLastName());
        softAssert.assertEquals(actualData.getUser().getEmail(), expectedData.getUser().getEmail());
        softAssert.assertEquals(actualData.getUser().getActivated(), expectedData.getUser().getActivated());
        softAssert.assertEquals(actualData.getUser().getLangKey(), expectedData.getUser().getLangKey());
        softAssert.assertEquals(actualData.getUser().getImageUrl(), expectedData.getUser().getImageUrl());
        softAssert.assertEquals(actualData.getUser().getResetDate(), expectedData.getUser().getResetDate());

        softAssert.assertAll();

 */

        // ObjectMapper ile doğrulama

        Customer actualData2 = JsonUtil.convertJsonToJava(response.asString(), Customer.class);

        softAssert.assertEquals(actualData2.getId(), expectedData.getId());
        softAssert.assertEquals(actualData2.getFirstName(), expectedData.getFirstName());
        softAssert.assertEquals(actualData2.getLastName(), expectedData.getLastName());
        softAssert.assertEquals(actualData2.getMiddleInitial(), expectedData.getMiddleInitial());
        softAssert.assertEquals(actualData2.getEmail(), expectedData.getEmail());
        softAssert.assertEquals(actualData2.getMobilePhoneNumber(), expectedData.getMobilePhoneNumber());
        softAssert.assertEquals(actualData2.getPhoneNumber(), expectedData.getPhoneNumber());
        softAssert.assertEquals(actualData2.getZipCode(), expectedData.getZipCode());
        softAssert.assertEquals(actualData2.getAddress(), expectedData.getAddress());
        softAssert.assertEquals(actualData2.getSsn(), expectedData.getSsn());
        softAssert.assertEquals(actualData2.getCreateDate(), expectedData.getCreateDate());
        softAssert.assertEquals(actualData2.getZelleEnrolled(), expectedData.getZelleEnrolled());
        softAssert.assertEquals(actualData2.getCountry().getId(), expectedData.getCountry().getId());
        softAssert.assertEquals(actualData2.getCountry().getName(), expectedData.getCountry().getName());
        softAssert.assertEquals(actualData2.getCountry().getStates(), expectedData.getCountry().getStates());
        softAssert.assertEquals(actualData2.getState(), expectedData.getState());
        softAssert.assertEquals(actualData2.getUser().getId(), expectedData.getUser().getId());
        softAssert.assertEquals(actualData2.getUser().getLogin(), expectedData.getUser().getLogin());
        softAssert.assertEquals(actualData2.getUser().getFirstName(), expectedData.getUser().getFirstName());
        softAssert.assertEquals(actualData2.getUser().getLastName(), expectedData.getUser().getLastName());
        softAssert.assertEquals(actualData2.getUser().getEmail(), expectedData.getUser().getEmail());
        softAssert.assertEquals(actualData2.getUser().getActivated(), expectedData.getUser().getActivated());
        softAssert.assertEquals(actualData2.getUser().getLangKey(), expectedData.getUser().getLangKey());
        softAssert.assertEquals(actualData2.getUser().getImageUrl(), expectedData.getUser().getImageUrl());
        softAssert.assertEquals(actualData2.getUser().getResetDate(), expectedData.getUser().getResetDate());

        softAssert.assertAll();
    }
}