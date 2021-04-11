package serialization;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class AddPlace_SerializeTest_SpecBuilder {
	
	public static void main(String[] args)
	{
		//RestAssured.baseURI;
		
		
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
		
		
		RequestSpecification req=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123")
				.setContentType(ContentType.JSON).build();
		
		ResponseSpecification rep= new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		RequestSpecification res= given().spec(req).body(a);
		
		String response= res.when().post("/maps/api/place/add/json").then().spec(rep).extract().asString();
		System.out.println(response);
	}

}
