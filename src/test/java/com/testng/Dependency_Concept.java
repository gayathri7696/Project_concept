package com.testng;

import org.testng.annotations.Test;

public class Dependency_Concept {
	@Test(dependsOnMethods = "parent")
	private void child() {
System.out.println("child");
	}
	@Test
	private void parent() {
System.out.println("parent");
	}
	@Test
	private void friends() {
		System.out.println("friends");
	}

}
