package org.testing.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.httpmethods;
import org.testing.utilities.jsonhandle;
import org.testing.utilities.propertieshandle;
import org.testng.annotations.Test;

public class testcase3 
{
	@Test
	public static void tc3() throws FileNotFoundException, IOException
	{
		Properties pr=propertieshandle.loadpropertieshandle("../sec/uri.properties");
		httpmethods getpart=new httpmethods(pr);
		getpart.getparticular("uri2", "football004");
	}
}
