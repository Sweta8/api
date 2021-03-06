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
		
		//Add Place using Post Method
		
		String response= given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(PayLoad.addPlace()).when().log().all().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP")).extract()
				.response().asString();
		 
		JsonPath js=ReusableMethods.rawtoJson(response);
		String placeId=js.getString("place_id");
		System.out.println(placeId);
		
		
		//Put Place to update Address
		
		String expectedAddress="sonari,jamshedpur";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(PayLoad.putPlace(placeId, expectedAddress)).when().log().all().put("maps/api/place/update/json").then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		
		//Get Place to get address of updated place
		
		String response1= given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").queryParam("place_id",placeId)
		.when().log().all().get("maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js1=ReusableMethods.rawtoJson(response1);
		String actualAddress=js1.getString("address");
		Assert.assertEquals(actualAddress, expectedAddress);
		
		
		
		
		
		
	}

}
