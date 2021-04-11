package serialization;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class AddPlace_SerializeTest {
	
	public static void main(String[] args)
	{
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		
		AddPlace_Serialization a=new AddPlace_Serialization();
		
		a.setAccuracy(50);
		a.setName("Frontline house");
		a.setPhone_number("(+91) 983 893 3937");
		a.setAddress("29, side layout, cohen 09");
		a.setWebsite("http://google.com");
		a.setLanguage("French-IN");
		List<String> myType=new ArrayList<String>();
		myType.add("shoe park");
		myType.add("shop");
		a.setTypes(myType);
		
		Location l=new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		a.setLocation(l);
		
		
		String response= given().log().all().header("Content-Type","application/json").queryParam("key", "qaclick123")
		.body(a).when().post("/maps/api/place/add/json").then().log().all().extract().response().asString();
		System.out.println(response);
	}

}
