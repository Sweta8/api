package files;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

public class JiraTest {
	
	public static void main(String[] args)
	{
		
		
		RestAssured.baseURI="http://localhost:8080/";
		
		//Login Scenario and get sessionid
		SessionFilter session=new SessionFilter();
		
		String response=given().log().all().header("Content-Type","application/json")
		.body("{ \"username\": \"swetacjc\", \"password\": \"8603189299\" }")
		.log().all().filter(session).when().post("rest/auth/1/session").then().log().all().extract().response().asString();
		
		/*JsonPath js=new JsonPath(response);
		String value=js.getString("session.value");*/
		
		String expected_Message;
		// Add comment
		expected_Message="Hi I am donw";
		String response1=given().log().all().pathParam("id", "10103").header("Content-Type","application/json")
		.body("{\r\n" + 
				"    \"body\": \""+expected_Message+"\",\r\n" + 
				"    \"visibility\": {\r\n" + 
				"        \"type\": \"role\",\r\n" + 
				"        \"value\": \"Administrators\"\r\n" + 
				"    }\r\n" + 
				"}").log().all().filter(session).when().post("rest/api/2/issue/{id}/comment").then().log().all().assertThat().statusCode(201).extract().response().asString();
		
		JsonPath js=new JsonPath(response1);
		String id_comment=js.getString("id");
		
		
		//Add attachment
		
		given().log().all().pathParam("id", "10103").header("X-Atlassian-Token","no-check").header("Content-Type","multipart/form-data")
		.multiPart("file",new File("jira.txt")).filter(session).when().log().all().post("rest/api/2/issue/{id}/attachments").then().log().all().assertThat().statusCode(200);
		
		
		// get issue fields
		
		String response2=given().log().all().pathParam("id", "10103").header("Content-Type","application/json")
		.queryParam("fields", "comment").filter(session).when().log().all().get("rest/api/2/issue/{id}").then().log().all().extract().response().asString();
		
		JsonPath js2=new JsonPath(response2);
		int comments_size =js2.getInt("fields.comment.comments.size()");
		System.out.println(comments_size);
		
	for(int i=0;i<comments_size;i++)
	{
		String comment_id=js2.getString("fields.comment.comments["+i+"].id");
		System.out.println(comment_id);
		if(comment_id.equalsIgnoreCase(id_comment))
		{
			String actual_message=js2.getString("fields.comment.comments["+i+"].body");
			System.out.println(actual_message);
			Assert.assertEquals(expected_Message, actual_message);
		}
	}
	}
	
	

}
