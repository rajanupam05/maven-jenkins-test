package testing;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class complexpojomain 
{
	public static void main(String[] args) {
		complexpojoAd ad=new complexpojoAd();
		ad.setAdd1("xyz");
		ad.setAdd2("abc");
		ad.setLandmark("landmark");
		
		complexpojobasic b=new complexpojobasic();
		b.setName("ramesh");
		b.setId("football008");
		b.setAddress(ad);
		b.setFav_shot("nutmeg");
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(b)
				.when()
				.post("http://localhost:3000/football");
		
		System.out.println(res.statusCode());
		System.out.println(res.asString());
	}
}
