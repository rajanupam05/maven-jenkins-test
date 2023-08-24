package testing;

import java.awt.event.FocusEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class jsonfile 
{
	public static void main(String[] args) throws JSONException, FileNotFoundException {
		File f=new File("../sec/requestpayload.json");
		JSONObject js=new JSONObject(new JSONTokener(new FileInputStream(f)));
		String data=js.toString();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the id: ");
		String input=sc.next();
		data=data.replaceAll(Pattern.quote("{{"+"id"+"}}"), input.toString());
		
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(data.toString())
				.when()
				.post("http://localhost:3000/football");
		
		System.out.println(res.statusCode());
		System.out.println(res.asString());
	}

}
