package com.testng;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DAta_Provider1 {
	@Test(dataProvider = "test_data")
	private void credential(String username,int password) {
		
		System.out.println("username: "+username);
		System.out.println("password: "+password);
	}
	@DataProvider
	private Object[][] test_data() {
		return new Object[][] {
			
			{ "gayu", 123},
			{"gayathri", 256},
		};
	}

}
