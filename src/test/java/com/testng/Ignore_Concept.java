package com.testng;


import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	@Test(enabled = false)
	private void books() {
System.out.println("books");
	}
	@Test(priority = 1)
	private void instagram() {
System.out.println("isntagram");
	}
	@Ignore
	@Test(priority = 2)
	private void whatsapp() {
System.out.println("whatsapp");
	}
	@Test(priority =- 1)
	private void spotify() {
System.out.println("spotify");
	}
	@Test()
	private void wynkMusic() {
System.out.println("Wynk Music");
	}

}
