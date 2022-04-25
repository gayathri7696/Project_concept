package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_dress {
	public static WebDriver driver;
@FindBy(xpath="(//a[@href='http://automationpractice.com/index.php?id_category=10&controller=category'])[5]")
private WebElement eve_dress;
public Automation_dress(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
}
public WebElement getEve_dress() {
	return eve_dress;
}






}

























