import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.AuthoritiesPojo;
import pojos.ResponseBody;
import utilities.MedunnaBaseUrl;

import static io.restassured.RestAssured.*;

public class Deneme extends MedunnaBaseUrl {

    /*
    {
  "activated": true,
  "authorities": [
    "string"
  ],
  "email": "trkklckyaaaaa@gmail.com",
  "firstName": "tarik",
  "imageUrl": "https://i.ytimg.com/vi/wUN6Ffli33U/maxresdefault.jpg",
  "langKey": "tarik",
  "lastModifiedBy": "tarik",
  "lastName": "kilickaya",
  "login": "tarik10",
  "ssn": "123-12-3856"
}
     */


    @Test
    public void name() {
        spec01.pathParam("pp1", "users");

        AuthoritiesPojo authorities = new AuthoritiesPojo("string");

        ResponseBody exData = new ResponseBody(true, authorities, "tarik123@gmail.com", "tarik123@gmail.com",
                "https://i.ytimg.com/vi/wUN6Ffli33U/maxresdefault.jpg", "string",
                "tarik", "kilickaya", "tarik11", "178-96-9874");

        Response response = given().contentType(ContentType.JSON)
                .headers("Authorization", "Bearer " + generateToken())
                .spec(spec01).when().body(exData)
                .post();

        response.prettyPrint();

        System.out.println(response.getStatusCode());
    }
}