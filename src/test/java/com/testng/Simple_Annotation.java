package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
	
@Test
private void women()
{
	System.out.println("Women");
}
@BeforeMethod
private void signin()
{
	System.out.println("sign in");
}


@AfterMethod
private void signout() {
	System.out.println("sign out");
}
@Test
private void child() {
System.out.println("child");
}
@BeforeClass
private void geturl() {
System.out.println("url");
}
@BeforeTest
private void browser_launch() {
System.out.println("browser launch");
}
@BeforeSuite
private void system_prop() {
System.out.println("system properties");
}
@AfterClass
private void verify_homepg() {
System.out.println("Assert");
}
@AfterTest
private void close() {
System.out.println("close");
}
@AfterSuite
private void deletecookies() {
System.out.println("delete all cookies");
}




}
