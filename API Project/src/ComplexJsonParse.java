import org.testng.Assert;

import files.PayLoad;
import files.ReusableMethods;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
	
	public static void main(String[] args)
	{
		
		JsonPath js=ReusableMethods.rawToJson(PayLoad.coursePrice());
		
		//Print No of Courses returned by API
		
		System.out.println(js.get("courses.size()").toString());
		
		//Print Purchase Amount
		
		System.out.println(js.getInt("dashboard.purchaseAmount"));
		
		//Print Title of first COurse
		
		System.out.println(js.getString("courses[0].title"));
		
		//Print All Course titles and their respective prices
		
		int count=js.getInt("courses.size()");
		for(int i=0;i<count;i++)
		{
			System.out.println(js.getString("courses["+i+"].title"));
			System.out.println(js.getInt("courses["+i+"].price"));
		}
		
		//Print no of copies sold by RPA
		
		for(int j=0;j<count;j++)
		{
			String title=js.getString("courses["+j+"].title");
			if(title.equalsIgnoreCase("RPA"))
			{
				System.out.println(js.getInt("courses["+j+"].copies"));
				break;
			}
			
		}
		//Verify if Sum of all Course prices matches with Purchase Amount
		int s=0;
		for(int k=0;k<count;k++)
		{
			 s=s+js.getInt("courses["+k+"].price")*js.getInt("courses["+k+"].copies") ;
		}
		System.out.println(s);
		Assert.assertEquals(s,js.getInt("dashboard.purchaseAmount"));
		
	}

}
