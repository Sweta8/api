import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.PayLoad;
import files.ReusableMethods;

public class Basics {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(PayLoad.generateStringFromSource("C:\\Users\\swetas\\Documents\\API Automation\\addJson.json")).when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP")).extract().response().asString();
		
		System.out.println(response);
		
		JsonPath js=ReusableMethods.rawToJson(response);
		String placeId =js.getString("place_id");
		System.out.println(placeId);

		
		//put http method
		
		String expectedAddress="sonari,jamshedpur";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n" + 
				"\"place_id\":\""+placeId+"\",\r\n" + 
				"\"address\":\""+expectedAddress+"\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}\r\n" + 
				"").when().put("/maps/api/place/update/json")
					.then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		//get http method
		
		String actualAddress;
		String responseGet= given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
		.when().get("/maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js1=  ReusableMethods.rawToJson(responseGet);
		actualAddress= js1.getString("address");
		System.out.println(actualAddress);
		
		Assert.assertEquals(actualAddress, expectedAddress);
		
	}

}
