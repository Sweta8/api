package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.APIResources;
import resources.TestDataBuilder;
import resources.Utils;

public class StepDefinition extends Utils{
	
	TestDataBuilder data=new TestDataBuilder();
	RequestSpecification request;
	Response response;
	String place_id;
	@Given("Add Place Payload with {String} {String} {String} {string} {string} {string} {string} {string} {string} {string}\"")
	public void add_Place_Payload_with(String latitude, String longitude, String accuracy, String name, String phone_number, String address, String types1, String types2, String website, String language) throws NumberFormatException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		
		request=given().spec(requestSpecification()).body(data.addPlacePayload(Double.parseDouble(latitude), Double.parseDouble(longitude), Integer.parseInt(accuracy), name, phone_number, address, types1, types2, website, language));
			
	}

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String httpMethod) {
	    // Write code here that turns the phrase above into concrete actions
	    
		APIResources resourceAPI=APIResources.valueOf(resource);
		System.out.println(resourceAPI.getResource());
		
		if(httpMethod.equalsIgnoreCase("POST"))
		{
			response=request.when().post(resourceAPI.getResource());
		}
		else if(httpMethod.equalsIgnoreCase("GET"))
		{
			response=request.when().get(resourceAPI.getResource());
		}
		else if(httpMethod.equalsIgnoreCase("DELETE"))
		{
			 response=request.when().delete(resourceAPI.getResource());
		}
		
	}

	@Then("verify API call is successful with status code {int}")
	public void verify_API_call_is_successful_with_status_code(Integer statusCode) {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(response.statusCode(), 200);
	}

	@Then("{string} in response is {string}")
	public void in_response_is(String keyValue, String expectedValue) {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(jsonPath(response, keyValue), expectedValue);
	}

	@Then("verify place id created maps to {string} using {string}")
	public void verify_place_id_created_maps_to_using(String expectedName, String resource) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    
		place_id=jsonPath(response, "place_id");
		request=given().spec(requestSpecification()).queryParam("place_id", place_id);
		user_calls_with_http_request(resource,"GET");
		String actualName=jsonPath(response, "name");
		assertEquals(expectedName, actualName);
	}



}
