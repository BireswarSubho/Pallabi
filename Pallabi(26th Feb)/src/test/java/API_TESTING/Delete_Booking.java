package API_TESTING;


import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class Delete_Booking {
	
	public void deleteBooking()
	{
		Create_Booking cb=new Create_Booking();
		Access_Token a=new Access_Token();
		
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		given().log().all().header("Content-Type","application/json")
		.header("token",a.finalKey)
		.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.when().delete("/booking/"+cb.bookingID).then().log().all().assertThat().statusCode(200);
		
		System.out.println("Booking has been deleted successfully");
	}
	
	

}
