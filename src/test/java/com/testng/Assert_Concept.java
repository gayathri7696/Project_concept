package com.testng;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {

@Test
private void method1() {
String actual="gayu";
String expected="gayathri";
Assert.assertEquals(actual, expected);

}
@Test
private void method2() {
	String actual="gayu";
	String expected="gayathri";
	Assert.assertNotEquals(actual, expected);
}
@Ignore
@Test
private void method3() {
	String actual="gayu";
	String expected="gayathri";
	Assert.assertSame(actual, expected);
}
@Ignore
@Test
private void method4() {
	String actual="gayu";
	String expected="gayathri";
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(actual, expected);
}















}
