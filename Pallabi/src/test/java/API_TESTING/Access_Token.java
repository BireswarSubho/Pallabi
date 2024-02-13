package API_TESTING;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Access_Token {
	
	
	public static String finalKey;
	@Test
	public void create_Token()
	{
	String url="https://restful-booker.herokuapp.com/auth";
	
	
	RequestSpecification http_req=RestAssured.given()
			.header("Content-Type","application/json")
			.body("{\r\n"
					+ "    \"username\" : \"admin\",\r\n"
					+ "    \"password\" : \"password123\"\r\n"
					+ "}");
	
	Response response=http_req.post(url);
	int status_code=response.getStatusCode();
	String response_body=response.asString();
	
	System.out.println("status code is : "+status_code);
	System.out.println("response is : "+response_body);
	
	String xxx=response_body.toString();
	String key=xxx.split(":")[1].split("}")[0];
	 finalKey=key.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(finalKey);
	
	}
	
	

}
