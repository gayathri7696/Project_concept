package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Concept {
	@Test
	@Parameters({"username","password"})
	
	private void credentials(String  username,String password) {
		System.out.println("username: "+username);
		System.out.println("password: "+password);
		
	}

}
