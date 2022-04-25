package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Iretry_Runner {
	@Test(priority = -1)
	private void username() {
		String expected= "gayathri";
		String actual = "gayathri";
		Assert.assertEquals(actual, expected);
		
	}
	@Test(retryAnalyzer = Iretry_Class.class)
	private void password() {
		String expected= "gayu";
		String actual = "gayathri";
		Assert.assertEquals(actual, expected);
	}
}


