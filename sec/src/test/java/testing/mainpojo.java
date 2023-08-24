package testing;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class mainpojo 
{
	public static void main(String[] args) {
		pojobasic po=new pojobasic();
		po.setName("sunil chetri");
		po.setFav_shot("nutmeg");
		po.setId("football007");
		
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(po)
				.when()
				.post("http://localhost:3000/football");
		
		System.out.println(res.statusCode());
		System.out.println(res.asString());
	}
}
