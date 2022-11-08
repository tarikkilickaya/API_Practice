package day01;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class GetRequest03 {

    /*
     {
           "id": 2,
           "email": "janet.weaver@reqres.in",
           "first_name": "Janet",
           "last_name": "Weaver",
           "avatar": "https://reqres.in/img/faces/2-image.jpg"
       },

     */
    String url="https://reqres.in/api/users";



    @Test
    public void test01() {

        Response response= given().when().get(url);

        response.then().body("data[1].id",equalTo(2));
        response.then().body("data[1].email",equalTo("janet.weaver@reqres.in"));
        response.then().body("data[1].first_name",equalTo("Janet"));
        response.then().body("data[1].last_name",equalTo("Weaver"));
        response.then().body("data[1].avatar",equalTo("https://reqres.in/img/faces/2-image.jpg"));

        response.then().body("support.url",equalTo("https://reqres.in/#support-heading"),
                "support.text",equalTo("To keep ReqRes free, contributions towards server costs are appreciated!"));





    }

    @Test
    public void test02() {

        /*
         {
            "id": 3,
            "email": "emma.wong@reqres.in",
            "first_name": "Emma",
            "last_name": "Wong",
            "avatar": "https://reqres.in/img/faces/3-image.jpg"
        },
         */
        Response response=given().when().get(url);

        response.then().body("data[2].id",equalTo(3));
        response.then().body("data[2].email",equalTo("emma.wong@reqres.in"));
        response.then().body("data[2].first_name",equalTo("Emma"));
        response.then().body("data[2].last_name",equalTo("Wong"));
        response.then().body("data[2].avatar",equalTo("https://reqres.in/img/faces/3-image.jpg"));
        response.then().body("support.url",equalTo("https://reqres.in/#support-heading"),
                "support.text",equalTo("To keep ReqRes free, contributions towards server costs are appreciated!"));



    }
    @Test
    public void test03(){
        /*
         {
            "id": 4,
            "email": "eve.holt@reqres.in",
            "first_name": "Eve",
            "last_name": "Holt",
            "avatar": "https://reqres.in/img/faces/4-image.jpg"
        },
         */
        Response response=given().when().get(url);

        response.then().body("data[3].id",equalTo(4));
        response.then().body("data[3].email",equalTo("eve.holt@reqres.in"));
        response.then().body("data[3].first_name",equalTo("Eve"));
        response.then().body("data[3].last_name",equalTo("Holt"));
        response.then().body("data[3].avatar",equalTo("https://reqres.in/img/faces/4-image.jpg"));
        response.then().body("support.url",equalTo("https://reqres.in/#support-heading"),
                "support.text",equalTo("To keep ReqRes free, contributions towards server costs are appreciated!"));


    }

    @Test
    public void test04() {
        /*
         {
            "id": 5,
            "email": "charles.morris@reqres.in",
            "first_name": "Charles",
            "last_name": "Morris",
            "avatar": "https://reqres.in/img/faces/5-image.jpg"
        },
         */
        Response response=given().when().get(url);
        response.then().body("data[4].id",equalTo(5));
        response.then().body("data[4].email",equalTo("charles.morris@reqres.in"));
        response.then().body("data[4].first_name",equalTo("Charles"));
        response.then().body("data[4].last_name",equalTo("Morris"));
        response.then().body("data[4].avatar",equalTo("https://reqres.in/img/faces/5-image.jpg"));
        response.then().body("support.url",equalTo("https://reqres.in/#support-heading"),
                "support.text",equalTo("To keep ReqRes free, contributions towards server costs are appreciated!"));
    }

    @Test
    public void test05() {
        /*
         {
            "id": 6,
            "email": "tracey.ramos@reqres.in",
            "first_name": "Tracey",
            "last_name": "Ramos",
            "avatar": "https://reqres.in/img/faces/6-image.jpg"
        }
         */
        Response response=given().when().get(url);
        response.then().body("data[5].id",equalTo(6));
        response.then().body("data[5].email",equalTo("tracey.ramos@reqres.in"));
        response.then().body("data[5].first_name",equalTo("Tracey"));
        response.then().body("data[5].last_name",equalTo("Ramos"));
        response.then().body("data[5].avatar",equalTo("https://reqres.in/img/faces/6-image.jpg"));

    }
}