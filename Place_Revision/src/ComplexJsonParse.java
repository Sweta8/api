import org.springframework.http.codec.multipart.SynchronossPartHttpMessageReader;
import org.testng.Assert;

import files.PayLoad;
import files.ReusableMethods;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JsonPath js=ReusableMethods.JsonResponse(PayLoad.coursePrice());
		
		//Print no of courses
		
		int no_Of_Courses=js.getInt("courses.size()");
		System.out.println(no_Of_Courses);
		
		//Print purchase amount
		
		int Purchase_Amount=js.getInt("dashboard.purchaseAmount");
		System.out.println(Purchase_Amount);

		//Print title of first course
		
		System.out.println(js.getString("courses[0].title"));
		
		//Print all courses and their respective prices
		
		int total_courses=js.getInt("courses.size()");
		for(int i=0;i<total_courses;i++)
		{
			System.out.println(js.getString("courses["+i+"].title"));
		    System.out.println(js.getInt("courses["+i+"].price"));
					
		}
		
		//Print no of Copies sold by RPA
		
		for(int i=0;i<total_courses;i++)
		{
			String courseTitle=js.getString("courses["+i+"].title");
			if(courseTitle.equalsIgnoreCase("RPA"))
			{
				System.out.println(js.getInt("courses["+i+"].price"));
				break;
			}
		}
		
		//Verify if Sum of all Course prices matches with Purchase Amount
				int s=0;
				for(int k=0;k<total_courses;k++)
				{
					 s=s+js.getInt("courses["+k+"].price")*js.getInt("courses["+k+"].copies") ;
				}
				System.out.println(s);
				Assert.assertEquals(s,js.getInt("dashboard.purchaseAmount"));
	}

}
