package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Optional_Concept {
	@Test
	@Parameters({"username","password"})
	private void data(@Optional("gayathrii")  String username,@Optional("gayuu") String password) {
		System.out.println("username : "+username);
		System.out.println("password : "+password);
		
	}

}
