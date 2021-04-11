package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuilder {
	
	public AddPlace addPlacePayload()
	{
		AddPlace a=new AddPlace();
		a.setAccuracy(50);
		a.setName("Frontline house");
		a.setPhone_number("(+91) 983 893 3937");
		a.setAddress("29, side layout, cohen 09");
		a.setWebsite("http://google.com");
		a.setLanguage("French-IN");
		List<String> myType=new ArrayList<String>();
		myType.add("shoe park");
		myType.add("shop");
		a.setTypes(myType);
		
		Location l=new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		a.setLocation(l);
		return a;
	}

}
