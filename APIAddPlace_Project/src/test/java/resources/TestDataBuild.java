package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {
	
	public AddPlace addPlacePayLoad(String name,String language,String address)
	{
		AddPlace a=new AddPlace();
		a.setAccuracy(50);
		a.setName(name);
		a.setPhone_number("(+91) 983 893 3937");
		a.setAddress(address);
		a.setWebsite("http://google.com");
		a.setLanguage(language);
		Location l=new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		a.setLocation(l);
		List<String> myTypes=new ArrayList<String>();
		myTypes.add("shoe park");
		myTypes.add("shop");
		a.setTypes(myTypes);
		return a;
	}
	
	public String deletePlacePayLoad(String placeId)
	{
		return "{\r\n    \"place_id\":\""+placeId+"\"\r\n}\r\n}";

}
}