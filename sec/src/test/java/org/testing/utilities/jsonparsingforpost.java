package org.testing.utilities;

import org.json.JSONObject;

public class jsonparsingforpost 
{
	public static String jsonparse(String responsedata, String keyname)
	{
		JSONObject j=new JSONObject(responsedata);
		String responseid=j.getString(keyname);
		return responseid;
		
	}
}
