package com.api.responsecode;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.Main_demo.Base_class;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Api_Automation extends Base_class {
	@Test
	public void data_validation() throws IOException {
		String uri=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Postman-Automation.xlsx", 1, 5);
		RestAssured.baseURI=uri;
		RequestSpecification request = RestAssured.given();
		String para1=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Postman-Automation.xlsx", 2, 5);
		Response response = request.get(para1);
		String string = response.toString();
		int statusCode = response.getStatusCode();
		System.out.println("status code: "+statusCode);
		String status=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Postman-Automation.xlsx", 1, 2);
		int expected = Integer.parseInt(status);
		Assert.assertEquals(expected, statusCode);
		
	}
		
		
	}
