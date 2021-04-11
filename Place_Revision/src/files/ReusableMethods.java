package files;

import io.restassured.path.json.JsonPath;

public class ReusableMethods {
	
	public static JsonPath JsonResponse(String response)
	{
		JsonPath js=new JsonPath(response);
		return js;
	}

}
