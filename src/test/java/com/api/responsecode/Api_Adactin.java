package com.api.responsecode;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Main_demo.Base_class;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Api_Adactin extends Base_class {
	public static RequestSpecification request;
	public static Response response;
	public static String expected_result;
	int expected;
	
	@BeforeMethod
	private void Base_uri() throws Throwable {
		String uri=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Postman_Adactin.xlsx", 1, 5);
		RestAssured.baseURI=uri;
		request = RestAssured.given();
	}
@Test(priority = -1)
private void search_hotel() throws IOException {
	String parameter=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Postman_Adactin.xlsx", 2, 5);
	response = request.get(parameter);
	expected_result=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Postman_Adactin.xlsx", 1, 2);
	expected=Integer.parseInt(expected_result);
}
@AfterMethod
private void status_code() {
String string = response.asString();
int statusCode = response.getStatusCode();
System.out.println("status code: "+statusCode);
Assert.assertEquals(expected, statusCode);	
}
@Test
private void select_hotel() throws IOException {
	String parameter=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Postman_Adactin.xlsx", 3, 5);
	response = request.get(parameter);
	expected_result=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Postman_Adactin.xlsx", 2, 2);
	expected=Integer.parseInt(expected_result);
}
@Test(priority = 1)
private void book_hotel() throws IOException {
	String parameter=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Postman_Adactin.xlsx", 4, 5);
	response = request.get(parameter);
	expected_result=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Postman_Adactin.xlsx", 3, 2);
	expected=Integer.parseInt(expected_result);
}
@Test(priority = 2)
private void booking_conformation() throws IOException {
	String parameter=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Postman_Adactin.xlsx", 5, 5);
	response = request.get(parameter);
	expected_result=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Postman_Adactin.xlsx", 4, 2);
	expected=Integer.parseInt(expected_result);
}
@Test(priority = 3)
private void logout() throws IOException {
	String parameter=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Postman_Adactin.xlsx", 6, 5);
	response = request.get(parameter);
	expected_result=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Postman_Adactin.xlsx", 5, 2);
	expected=Integer.parseInt(expected_result);
}
}
