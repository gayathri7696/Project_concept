package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_tshirt {
	public static WebDriver driver;
@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
private WebElement tshirt_img;

public WebElement getTshirt_img() {
	return tshirt_img;
}
public Automation_tshirt(WebDriver driver2)
{
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
}
