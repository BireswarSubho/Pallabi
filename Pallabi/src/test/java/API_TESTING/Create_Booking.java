package API_TESTING;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Create_Booking {
	

	public static String bookingID;;

    @Test
	public void createBooking()
	{
    	
    	
    	Access_Token a= new Access_Token();
    	
    System.out.println("it is : "+a.finalKey);
    	RestAssured.baseURI="https://restful-booker.herokuapp.com";
    	Response response=given().header("Content-Type","application/json")
    	.header("accept","application/json")
    	.header("token",a.finalKey)
    	.body("{\r\n"
    			+ "    \"firstname\" : \"Bireswar\",\r\n"
    			+ "    \"lastname\" : \"Adhikary\",\r\n"
    			+ "    \"totalprice\" : 10000,\r\n"
    			+ "    \"depositpaid\" : true,\r\n"
    			+ "    \"bookingdates\" : {\r\n"
    			+ "        \"checkin\" : \"01-03-2024\",\r\n"
    			+ "        \"checkout\" : \"10-03-2024\"\r\n"
    			+ "    },\r\n"
    			+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
    			+ "}").when().post("/booking");
    	
    	String bID=response.asString();
    	System.out.println("BookingID is : "+bID);
    	
    	
    	 bookingID=bID.split(",")[0].split(":")[1];
    	
    	System.out.println("Final booking ID is : "+bookingID);
    	
    	response.then().log().all().assertThat().statusCode(200);
    	
    	
    	
    	
    	
	}

}
