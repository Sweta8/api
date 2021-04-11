import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;

import files.PayLoad;
import files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Basics {
	
	public static void main(String[] args)
	{
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		//Add Place Id
		String response= given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").body(PayLoad.addPlace())
		.when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP")).extract().response().asString();
		
		//Get the place ID
		JsonPath js=new JsonPath(response);
		String place_ID=js.getString("place_id");
		
		
		//Update Place API
		String expected_address="Jamshedpur";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body("{\r\n" + 
				"\"place_id\":\""+place_ID+"\",\r\n" + 
				"\"address\":\""+expected_address+"\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}\r\n" + 
				"")
		.when().log().all().put("/maps/api/place/update/json").then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		//Get Place API
		
		String response1=given().log().all().queryParam("key", "qaclick123").queryParam("place_id", place_ID).header("Content-Type","application/json")
				.when().log().all().get("/maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js1=ReusableMethods.JsonResponse(response1);
		String actualAddress=js1.getString("address");
		Assert.assertEquals(actualAddress, expected_address);
	}
	

}
