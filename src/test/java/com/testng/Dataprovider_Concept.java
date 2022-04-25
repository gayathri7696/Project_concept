package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Concept {
	@Test(dataProvider = "test_data")
	private void data(String username,int password) {
		System.out.println("username : "+username);
		System.out.println("password : "+password);
	}
	@DataProvider
	private Object[][] test_data() {
		return new Object[][] {
			{"gayathri",123},
			{ "gayu" ,456}		
		
	};
	}
}
