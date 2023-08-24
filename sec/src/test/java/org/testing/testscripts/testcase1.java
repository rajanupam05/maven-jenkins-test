package org.testing.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.responsevalidation.responsedatavalidation;
import org.testing.teststeps.httpmethods;
import org.testing.utilities.jsonhandle;
import org.testing.utilities.jsonparsingforpost;
import org.testing.utilities.propertieshandle;
import org.testing.utilities.replacevalue;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class testcase1 
{
	static String returnidvalue;
	@Test
	public static void tc1() throws FileNotFoundException, IOException
	{
		Properties pr=propertieshandle.loadpropertieshandle("../sec/uri.properties");
		String responsedata=jsonhandle.loadjsonfile("../sec/src/test/java/org/testing/resources/request.payload.json");
		Random r=new Random();
		Integer input=r.nextInt();
		String requestbody=replacevalue.assignvalue(responsedata, "id", input.toString());
		httpmethods post=new httpmethods(pr);
		Response res=post.postmethod(requestbody, "uri2");
		responsedatavalidation.responsevalidate(res, "sessi", "name");
		returnidvalue=jsonparsingforpost.jsonparse(res.asString(), "id");
	}
}
