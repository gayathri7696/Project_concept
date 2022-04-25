package com.api.responsecode;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Request;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Api_Demo {
@Test
public void data_validation() {
	
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification request = RestAssured.given();
	Response response = request.get("api/users/2");
	String string = response.toString();
	int statusCode = response.getStatusCode();
	System.out.println("status code: "+statusCode);
	Assert.assertEquals(200, statusCode);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*RestAssured.baseURI="http://adactinhotelapp.com/";
	RequestSpecification request1 = RestAssured.given();
	Response response1 = request1.get("SearchHotel.php");
	String string1 = response1.toString();
	int statusCode1 = response1.getStatusCode();
	System.out.println("status code: "+statusCode1);
	Assert.assertEquals(200, statusCode1);
	
	
	RequestSpecification request2 = RestAssured.given();
	Response response2 = request2.get("SelectHotel.php");
	String string2 = response2.toString();
	int statusCode2 = response2.getStatusCode();
	System.out.println("status code: "+statusCode2);
	Assert.assertEquals(200, statusCode2);
	*/
	
	
	
	
	
	
}
}
