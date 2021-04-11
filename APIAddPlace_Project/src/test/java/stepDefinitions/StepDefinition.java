package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefinition extends Utils {
	
	
	RequestSpecification request;
	Response response;
	TestDataBuild data=new TestDataBuild();
	static String place_id;
	JsonPath js;
	@Given("Add Place PayLoad with {string} {string} {string}")
	public void add_Place_PayLoad_with(String name, String language, String address) throws IOException {
    // Write code here that turns the phrase above into concrete actions
	
	
	 request= given().spec(requestSpecification()).body(data.addPlacePayLoad(name,language,address));
	
    
}

@When("user calls {string} with {string} http request")
public void user_calls_with_Post_http_request(String resource,String httpMethod) {
    // Write code here that turns the phrase above into concrete actions
	
	APIResources resourceAPI=   APIResources.valueOf(resource);
	System.out.println(resourceAPI.getResource());
	 
	 
	  if(httpMethod.equalsIgnoreCase("POST"))
	  {
		  response=request.when().post(resourceAPI.getResource());
	  }
	  else if(httpMethod.equalsIgnoreCase("GET"))
	  {
		  response=request.when().get(resourceAPI.getResource());
	  }
	  else if(httpMethod.equalsIgnoreCase("POST"))
	  {
		  response=request.when().get(resourceAPI.getResource());
	  }
	 
	
}

@Then("verify the API call is success with status code {int}")
public void verify_the_API_call_is_success_with_status_code(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
   assertEquals(response.getStatusCode(), 200);
}

@Then("{string} in response is {string}")
public void in_response_is(String keyValue, String expectedValue) {
    // Write code here that turns the phrase above into concrete actions
	
	assertEquals(getJsonPath(response, keyValue),expectedValue );
	
}
	@Then("verify place_id created maps to {string} using {string}")
	public void verify_place_id_created_maps_to_using(String expectedName, String resource) throws IOException {
		
    // Write code here that turns the phrase above into concrete actions
		place_id= getJsonPath(response, "place_id");
		request=given().spec(requestSpecification()).queryParam("place_id", place_id);
		user_calls_with_Post_http_request(resource, "GET");
		String actualName=getJsonPath(response, "name");
		assertEquals(expectedName, actualName);
}


	@Given("DeletePlace Payload")
	public void deleteplace_Payload() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    
		request=  given().spec(requestSpecification()).body(data.deletePlacePayLoad(place_id));
	}

   



}
