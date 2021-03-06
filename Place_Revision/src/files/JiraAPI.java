package files;

import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

public class JiraAPI {
	
	public static void main(String[] args)
	{
		RestAssured.baseURI="http://localhost:8080";
		
		SessionFilter filter=new SessionFilter();
		
		//Creation session id
		
		given().log().all().header("Content-Type","application/json").
		body("{ \"username\": \"swetas\", \"password\": \"8603189299\" }").filter(filter)
		.when().post("/rest/auth/1/session").then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		
		
		//Add comment in issue
		
		String m=given().log().all().pathParam("key", "10022").header("Content-Type","application/json")
		.body("{\r\n" + 
				"    \"body\": \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eget venenatis elit. Duis eu justo eget augue iaculis fermentum. Sed semper quam laoreet nisi egestas at posuere augue semper.\",\r\n" + 
				"    \"visibility\": {\r\n" + 
				"        \"type\": \"role\",\r\n" + 
				"        \"value\": \"Administrators\"\r\n" + 
				"    }\r\n" + 
				"}").filter(filter).when().post("/rest/api/2/issue/{key}/comment")
		.then().log().all().assertThat().statusCode(201).extract().response().asString();
		
		JsonPath js1=new JsonPath(m);
		String id_comment=js1.getString("id");
		
		
		//Add attachment
		
		given().log().all().pathParam("key", "10022").header("X-Atlassian-Token","no-check").header("Content-Type","multipart/form-data").filter(filter).multiPart("file",new File("File.txt"))
		.when().log().all().post("/rest/api/2/issue/{key}/attachments").then().log().all().assertThat().statusCode(200);
		
		//get issue
		
		String response2=given().log().all().pathParam("id", "10022").header("Content-Type","application/json")
				.queryParam("fields", "comment").filter(filter).when().log().all().get("rest/api/2/issue/{id}").then().log().all().extract().response().asString();
				
		
		
		
		
		
	}

}
