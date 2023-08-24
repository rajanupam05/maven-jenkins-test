package testing;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class arraymain 
{
	public static void main(String[] args) {
		arrayadd[] add=new arrayadd[2];
		
		add[0]=new arrayadd();
		add[1]=new arrayadd();
		
		add[0].setAdd1("asd");
		add[0].setAdd2("dsa");
		add[0].setLandmark("lamda");
		
		add[1].setAdd1("qwerty");
		add[1].setAdd2("ytrewq");
		add[1].setLandmark("land");
		
		arraybody b=new arraybody();
		b.setAddress(add);
		b.setName("suresh");
		b.setFav_shot("front foot");
		b.setId("football009");
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(b)
				.when()
				.post("http://localhost:3000/football");
		
		System.out.println(res.statusCode());
	}
}
