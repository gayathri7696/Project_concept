package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_homepg {
	public WebDriver driver;
@FindBy(className="login")
private WebElement Signin_btn;
@FindBy(className="sf-with-ul")
private WebElement women;
public WebElement getWomen() {
	return women;
}
@FindBy(xpath="(//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category'])[2]")
private WebElement dress;
public WebElement getDress() {
	return dress;
}
public Automation_homepg(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
}

public WebElement getSignin_btn() {
	return Signin_btn;
}
	@FindBy(xpath="(//a[@href='http://automationpractice.com/index.php?id_category=5&controller=category'])[2]")
	private WebElement tshirt;
	public WebElement getTshirt() {
		return tshirt;
	}

}

