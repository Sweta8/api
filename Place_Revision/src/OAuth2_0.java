import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import pojo.API;
import pojo.GetCourses;
import pojo.WebAutomation;

public class OAuth2_0 {
	
	public static void main(String[] args)
	{
		int i;
		String a[]= {"Selenium Webdriver Java","Cypress","Protractor"};
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\swetas\\Documents\\Java_Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php");
		WebElement email=driver.findElement(By.cssSelector("input[type='email']"));
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("swetacjc",Keys.ENTER);
		//driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Roche@1234567",Keys.ENTER);
		 * String url=driver.getCurrentUrl();
		 * 
*/		
		//Get the code
		String url="https://rahulshettyacademy.com/getCourse.php?code=4%2F0AY0e-g6hmSK9qc0ass356NXVOvR9oz_ppTAa_zckNCINEhmhfnkCYQvjzbuXgkz_qKXJwA&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=none";
		String partialURL=url.split("code=")[1];
		String code=partialURL.split("&scope")[0];
		System.out.println(code);
		
		//Get access token from the code
		String accessTokeResponse=given().urlEncodingEnabled(false)
		.queryParam("code", code)
		.queryParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		.queryParam("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
		.queryParam("grant_type", "authorization_code")
		.when().post("https://www.googleapis.com/oauth2/v4/token")
		.then().log().all().extract().response().asString();
		
		JsonPath js=new JsonPath(accessTokeResponse);
		String accessToken=js.getString("access_token");
		

		//Get response from the access token generated
		
		/*String response= given().log().all().queryParam("access_token", accessToken)
		.when().get("https://rahulshettyacademy.com/getCourse.php").then().log().all().extract().response().asString();
		System.out.println(response);*/
		
		//Get response and load values of the parameters using POJO Classes
		
		GetCourses gc=given().log().all().queryParam("access_token", accessToken).expect().defaultParser(Parser.JSON)
				.when().get("https://rahulshettyacademy.com/getCourse.php").then().log().all().extract().response().as(GetCourses.class);
		
		System.out.println(gc.getLinkedIn());
		System.out.println(gc.getUrl());
		
		// API Course price of SOAPUI Webservices
		List<API> apiCourses=gc.getCourses().getApi();
		for( i=0;i<apiCourses.size();i++)
		{
			if(apiCourses.get(i).getCourseTitle().equalsIgnoreCase("SoapUI Webservices testing"))
					{
				System.out.println(gc.getCourses().getApi().get(i).getPrice());
					}
		}
		
		//Get All courses of WebAutomation
		List<WebAutomation> webAutomationCourses=gc.getCourses().getWebAutomation();
		for(i=0;i<webAutomationCourses.size();i++)
		{
			System.out.println(webAutomationCourses.get(i).getCourseTitle());
		}
		
		//Validate Courses of webautomation is equal to expected
		
		ArrayList<String> a1=new ArrayList<>();
		for(i=0;i<webAutomationCourses.size();i++)
		{
			a1.add(webAutomationCourses.get(i).getCourseTitle());
		}
		List<String> expectedCourses=Arrays.asList(a);
		
		Assert.assertTrue(a1.equals(expectedCourses));
	}

}
