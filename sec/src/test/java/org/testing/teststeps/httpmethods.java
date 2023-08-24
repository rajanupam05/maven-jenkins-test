package org.testing.teststeps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class httpmethods 
{
	static Properties pr;
	public httpmethods(Properties pr)
	{
		this.pr=pr;
	}
	public static Response postmethod(String responsedata, String urikeyname)
	{
		String urivalue=pr.getProperty(urikeyname);
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(responsedata)
				.when()
				.post(urivalue);
		
		System.out.print("status code: "+res.statusCode());
		System.out.println(res.asString());
		return res;
	}
	public static Response getmethod(String urikeyname)
	{
		String urivalue=pr.getProperty(urikeyname);
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(urivalue);
		
		
		System.out.println(res.statusCode());
		System.out.println(res.asString());
		return res;
	}
	public static void getparticular(String urikeyname, String endpoint)
	{
		String urivalue=pr.getProperty(urikeyname)+"/"+endpoint;
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(urivalue);
		
		System.out.println(res.asString());
	}
	public static void putmethod(String requestbody,String urikeyname, String endpoint)
	{
		String urivalue=pr.getProperty(urikeyname)+"/"+endpoint;
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(requestbody)
				.when()
				.put(urivalue);
		
		System.out.println(res.statusCode());
		System.out.println(res.asString());
	}
}
