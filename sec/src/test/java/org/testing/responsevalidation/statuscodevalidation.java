package org.testing.responsevalidation;

import org.testng.Assert;

import io.restassured.response.Response;

public class statuscodevalidation 
{
	public static void responsevalidate(int expected, Response res)
	{
		Assert.assertEquals(res.statusCode(), expected, "status code failed");
		System.out.println("code validate sucessfully");
	}
}
