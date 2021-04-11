package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {
	
	private static RequestSpecification res;
	
	public RequestSpecification requestSpecification() throws IOException
	{
		if(res==null)
		{
			PrintStream log=new PrintStream(new FileOutputStream("logging.txt"));
			res=new RequestSpecBuilder().setBaseUri(getGlobalValue("baseUrl")).addQueryParam("key", "qaclick123")
					.addFilter(RequestLoggingFilter.logRequestTo(log))
					.addFilter(ResponseLoggingFilter.logResponseTo(log))
					.setContentType(ContentType.JSON).build();
			
			return res;
		}
		return res;
	}
	
	
	public static String getGlobalValue(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"src\\test\\java\\resources\\globalvalues");
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}
	
	public String jsonPath(Response response,String key)
	{
		String resp=response.asString();
		JsonPath js=new JsonPath(resp);
		return js.getString(key);
	}
	
	

}
