package test.api.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class APITestRestAssured {

	@Test
	public void getweatherDeatils() {
		// TODO Auto-generated method stub
		RestAssured.baseURI ="http://restapi.demoqa.com/utilities/weather/city/Hyderabad";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/Hyderabad");
		String responsebdy = response.getBody().asString();
		System.out.println("Response Body "+responsebdy);
		int statusCode =response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);
		String statusLine = response.getStatusLine();
		System.out.println();
		Assert.assertEquals(statusLine, "HTTP/1.1   OK");
		
		
		
	}

}
