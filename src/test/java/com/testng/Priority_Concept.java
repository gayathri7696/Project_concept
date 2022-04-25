package com.testng;

import org.testng.annotations.Test;

public class Priority_Concept {

@Test(priority = 0)
private void username() {
	System.out.println("username");
}
@Test(priority = 1)
private void password() {
System.out.println("password");
}
@Test(priority = -1)
private void url() {
System.out.println("url");
}















}
