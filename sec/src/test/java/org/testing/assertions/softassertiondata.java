package org.testing.assertions;

public class softassertiondata {
	public static Boolean responsevalidate(String actualdata, String expectedata)
	{
		if(actualdata.equals(expectedata))
		{
			System.out.println("data matched");
			return true;
		}
		else
		{
			return false;
		}
	}
}
