package org.testing.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.assertions.softassertstatuscode;
import org.testing.responsevalidation.responsedatavalidation;
import org.testing.responsevalidation.statuscodevalidation;
import org.testing.teststeps.httpmethods;
import org.testing.utilities.jsonhandle;
import org.testing.utilities.jsonparsingusingorgjson;
import org.testing.utilities.propertieshandle;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class testcase2 
{
	@Test
	public static void tc2() throws FileNotFoundException, IOException
	{
		Properties pr=propertieshandle.loadpropertieshandle("../sec/uri.properties");
////		String json=jsonhandle.loadjsonfile("../sec/src/test/java/org/testing/resources/request.payload.json")
		httpmethods get=new httpmethods(pr);
		Response res=get.getmethod("uri2");
		Boolean response=softassertstatuscode.responsevalidate(200, res);
		
		Assert.assertTrue(response);
		jsonparsingusingorgjson.jsonparse(res.asString(), "id");
	}
}
