package org.testing.responsevalidation;

import org.testing.assertions.softassertiondata;
import org.testing.utilities.jsonparsingusingjsonpath;

import io.restassured.response.Response;
import junit.framework.Assert;

public class responsedatavalidation 
{
	public static void responsevalidate(Response res, String expectedata, String jsonpath)
	{
		String actualdata=jsonparsingusingjsonpath.jsonparse(jsonpath, res);
		Boolean response=softassertiondata.responsevalidate(actualdata, expectedata);
		Assert.assertTrue(response);
	}
}
