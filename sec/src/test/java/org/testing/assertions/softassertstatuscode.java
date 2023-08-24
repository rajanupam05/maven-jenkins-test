package org.testing.assertions;

import io.restassured.response.Response;

public class softassertstatuscode 
{
	public static Boolean responsevalidate(int expectedstatuscode, Response res)
	{
		if(res.statusCode()==expectedstatuscode)
		{
			System.out.println("code matched");
			return true;
		}
		else
		{
			System.out.println("code failed");
			return false;
		}
	}
}
