package org.testing.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.httpmethods;
import org.testing.utilities.jsonhandle;
import org.testing.utilities.propertieshandle;
import org.testng.annotations.Test;

public class testcase4 
{
	@Test
	public static void tc4() throws FileNotFoundException, IOException
	{
		Properties pr=propertieshandle.loadpropertieshandle("../sec/uri.properties");
		String responsedata=jsonhandle.loadjsonfile("../sec/src/test/java/org/testing/resources/request.payload.json");
		httpmethods put=new httpmethods(pr);
		put.putmethod(responsedata,"uri2", "football004");
	}
}
