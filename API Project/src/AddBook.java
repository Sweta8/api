

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.PayLoad;
import files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class AddBook {
	
	@Test(dataProvider="getData")
	public void addBook(String isbn, String asile)
	{
		
		RestAssured.baseURI="http://216.10.245.166";
		String response= given().log().all()
		.body(PayLoad.addBook(isbn,asile)).when().post("Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js=ReusableMethods.rawToJson(response);
		String Book_id=js.getString("ID");
		System.out.println(Book_id);
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		/*Object[][] data=new Object[3][2];*/
		
		/*data[0][0]="fgd";
		data[0][1]="987";
		data[1][0]="ghf";
		data[1][1]="897";
		data[2][0]="hj";
		data[2][1]="897";*/
		return new Object[][] {{"lkl","908"},{"iou","890"}};
	}

}
