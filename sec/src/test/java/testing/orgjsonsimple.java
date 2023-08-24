package testing;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class orgjsonsimple 
{
	public static void main(String[] args) {
		/*JSONObject js=new JSONObject();
		js.put("address type", "primary");
		js.put("address1", "n y city");
		js.put("landmark", "mount olive school");
		
		JSONObject js1=new JSONObject();
		js1.put("address type", "secondary");
		js1.put("address1", "standford");
		js1.put("landmark", "london firebrigde");
		
		JSONArray array=new JSONArray();
		array.put(js);
		array.put(js1);
		
		JSONObject j=new JSONObject();
		j.put("name", "messi");
		j.put("id", "football001");
		j.put("fav shot", "nutmeg");
		j.put("address", array);*/
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				////.body(j.toString())
				.when()
				.get("http://localhost:3000/football");
		
		System.out.println(res.statusCode());
		System.out.println(res.asString());
	}
}
