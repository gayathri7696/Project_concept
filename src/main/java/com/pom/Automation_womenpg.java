package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_womenpg {
	public static WebDriver driver;
	@FindBy(className="layered_subtitle")
	private WebElement composition;
	public Automation_womenpg(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getComposition() {
		return composition;
	}
	public WebElement getImage() {
		return image;
	}
	@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[3]")
	private WebElement image;

}
