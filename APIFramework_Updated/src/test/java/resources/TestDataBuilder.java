package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuilder {
	
	public AddPlace addPlacePayload(double latitude,double longitude, int accuracy, String name,String phone_number,
									String address,String types1,String types2,String website,String language)
	
	{
		AddPlace a=new AddPlace();
		Location l=new Location();
		l.setLat(latitude);
		l.setLng(longitude);
		a.setLocation(l);
		a.setAccuracy(accuracy);
		a.setName(name);
		a.setPhone_number(phone_number);
		a.setAddress(address);
		a.setWebsite(website);
		a.setLanguage(language);
		List<String> mytypes=new ArrayList<String>();
		mytypes.add(types1);
		mytypes.add(types2);
		a.setTypes(mytypes);
		return a;
	}

}
