package API_TESTING;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Update_Booking {
	
	
	@Test
	public void updateBooking()
	{
		
		Create_Booking cb=new Create_Booking();
		Access_Token a=new Access_Token();
		System.out.println("Booking id is : "+cb.bookingID);
		
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		given().log().all().header("Content-Type","application/json")
    	.header("accept","application/json")
    	.header("token",a.finalKey)
    	.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
    	.body("{\r\n"
    			+ "    \"firstname\" : \"Pallabi\",\r\n"
    			+ "    \"lastname\" : \"Halder\",\r\n"
    			+ "    \"totalprice\" : 10000,\r\n"
    			+ "    \"depositpaid\" : true,\r\n"
    			+ "    \"bookingdates\" : {\r\n"
    			+ "        \"checkin\" : \"01-03-2024\",\r\n"
    			+ "        \"checkout\" : \"10-03-2024\"\r\n"
    			+ "    },\r\n"
    			+ "    \"additionalneeds\" : \"Dinner\"\r\n"
    			+ "}").when().put("/booking/"+cb.bookingID).then().log().all().assertThat().statusCode(200);
		
		
		System.out.println("Booking has been successfully updated");
	}

}
