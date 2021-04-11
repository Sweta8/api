package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.TestDataBuilder;
import utilities.Utils;


public class StepDefinition extends Utils{
	
	RequestSpecification req,res;
	ResponseSpecification rep;
	
	Response response;
	
	TestDataBuilder data=new TestDataBuilder();
	@Given("Add Place Payload")
	public void add_Place_Payload() throws FileNotFoundException {
	    // Write code here that turns the phrase above into concrete actions
	    
		
		
		res= given().log().all().spec(requestSpecification()).body(data.addPlacePayload());
	}

	@When("user calls {string} using POST http request")
	public void user_calls_using_POST_http_request(String string) {
	    // Write code here that turns the phrase above into concrete actions
		rep= new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response=res.when().post("/maps/api/place/add/json").then().log().all().spec(rep).extract().response();
	    
	}

	@Then("API call is success with status code {int}")
	public void api_call_is_success_with_status_code(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(response.getStatusCode(), 200);
	}

	@Then("{string} in response body is {string}")
	public void status_in_response_body_is(String key,String expectedValue) {
	    // Write code here that turns the phrase above into concrete actions
	    String resp=response.asString();
	    JsonPath js=new JsonPath(resp);
	    String actaulStatus=js.getString(key);
	    assertEquals(expectedValue, actaulStatus);
	}




}
