package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_evedress {
	public  static WebDriver driver;
	@FindBy (xpath="(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement img;

	public Automation_evedress(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getImg() {
		return img;
	}
	
	
	
	

}
