package day04;

import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import pojos.Customer;
import utilities.GMIBankBaseURL;
import utilities.ReadText;
import utilities.WriteToText;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class GMIBank01 extends GMIBankBaseURL {

    /*
http://www.gmibank.com/api/tp-customers end point'ine
request gönderin
 1) Tüm Customer bilgilerini ekrana yazdırın.
 2) Tüm Customer SSN lerini ekrana yazdırın.
 3) Tüm Customer SSN lerini text dosyası olarak kaydedin
 4) Olusturduğunuz text dosyasından  SSNleri okuyarak
    "531-95-8437", "049-43-2360", "123-34-3434" SSNlerinin olduğunu doğrulayın
 */


    @Test
    public void test01() throws IOException {

        Customer[] customers;

        spec01.pathParam("bir", "tp-customers");

        Response response = given().spec(spec01).header("Authorization", "Bearer " + generateToken()).get("{bir}");

        //  1) Tüm Customer bilgilerini ekrana yazdırın.
        ObjectMapper obje = new ObjectMapper();
        customers = obje.readValue(response.asString(), Customer[].class);

        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }

        //  2) Tüm Customer SSN lerini ekrana yazdırın.
        for (int i = 0; i < customers.length; i++) {
            System.out.println("SSN'ler : " + customers[i].getSsn());
        }

        //  3) Tüm Customer SSN lerini text dosyası olarak kaydedin
        String fileName = "src/test/java/day04/SSNNumbers.txt";
        WriteToText.saveSSNData(fileName, customers);


        // 4) Olusturduğunuz text dosyasından SSNleri okuyarak "531-95-8437", "049-43-2360", "123-34-3434" SSNlerinin olduğunu doğrulayın
        List<String> expectedSSN = new ArrayList<>();
        expectedSSN.add("531-95-8437");
        expectedSSN.add("049-43-2360");
        expectedSSN.add("123-34-3434");

        List<String> actualSSN = ReadText.readCustomerSSNList(fileName);

        //assertTrue("SSN'ler eşleşmedi", actualSSN.containsAll(expectedSSN));

        String fileName1 = "src/test/java/day04/AllData.txt";
        WriteToText.saveCustomersData(fileName1, customers);

    }
}