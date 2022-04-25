package com.test_demo;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Main_demo.Base_class;
import com.logger_demo.Property_Configuration;
import com.object.Page_Object_Manager;
import com.pom.Automation_dress;
import com.pom.Automation_evedress;
import com.pom.Automation_logout;
import com.property.reader.File_Reader_Manager;

public class Automation_Runner2 extends Base_class  {
	public static WebDriver driver=browser_configuration("chrome");
	
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	public static Logger log=Logger.getLogger(Property_Configuration.class);
	
	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		//geturl("http://automationpractice.com/index.php");
		String url=File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_config_url();
		geturl(url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		log.info("Automation Url launch");
		wait(10,TimeUnit.SECONDS);
		pom.get_Instance_Hp().getSignin_btn();
		click(pom.get_Instance_Hp().getSignin_btn());
		pom.get_Instance_loginpg().getEmail();
		//String username=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Automation test case.xlsx", 2, 5);
		String username=File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Instance_email();
		sendkeys(pom.get_Instance_loginpg().getEmail(),username);
		pom.get_Instance_loginpg().getPassword();
		//String password=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Automation test case.xlsx", 8, 5);
		String password=File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Instance_password();
		sendkeys(pom.get_Instance_loginpg().getPassword(), password);
		pom.get_Instance_loginpg().getSignin_btn();
		click(pom.get_Instance_loginpg().getSignin_btn());
		pom.get_Instance_Hp().getWomen();
		click(pom.get_Instance_Hp().getWomen());
		pom.get_Instance_womenpg().getComposition();
		scroll(pom.get_Instance_womenpg().getComposition());
		pom.get_Instance_womenpg().getImage();
		click(pom.get_Instance_womenpg().getImage());
		pom.get_Instance_cart().getAddtocart();
		click(pom.get_Instance_cart().getAddtocart());
		pom.get_Instance_cc().getCheckout();
		Thread.sleep(3000);
		click(pom.get_Instance_cc().getCheckout());
		pom.get_Instance_sumcc().getSummaryckot();
		click(pom.get_Instance_sumcc().getSummaryckot());
		pom.get_Instance_addresscc().getAddresschout();
		click(pom.get_Instance_addresscc().getAddresschout());
		pom.get_Instance_shipping().getTerms();
		click(pom.get_Instance_shipping().getTerms());
		pom.get_Instance_shipping().getShipping_checkout();
		click(pom.get_Instance_shipping().getShipping_checkout());
		pom.get_Instance_payment().getPaybybank();
		click(pom.get_Instance_payment().getPaybybank());
		pom.get_Instance_order().getOder();
		click(pom.get_Instance_order().getOder());
		javascript();
		screenshot("img1.png");
		log.info("oder is booked for automation");
		//logout
		click(pom.get_Instance_Logout().getLogout());
		driver.navigate().to("http://automationpractice.com/index.php");
		
		//purchase 2	
		pom.get_Instance_Hp().getSignin_btn();
		click(pom.get_Instance_Hp().getSignin_btn());
		pom.get_Instance_loginpg().getEmail();
		sendkeys(pom.get_Instance_loginpg().getEmail(),username);
		pom.get_Instance_loginpg().getPassword();
		sendkeys(pom.get_Instance_loginpg().getPassword(), password);
		pom.get_Instance_loginpg().getSignin_btn();
		click(pom.get_Instance_loginpg().getSignin_btn());
		click(pom.get_Instance_Hp().getDress());
		click(pom.get_Instance_dress().getEve_dress());		
		javascript();
		click(pom.get_Instance_eve_dress().getImg());
		javascript();
		frame_in(0);
		pom.get_Instance_cart().getAddtocart();
		Thread.sleep(10000);
		click(pom.get_Instance_cart().getAddtocart());
		frame_out();
		pom.get_Instance_cc().getCheckout();
		Thread.sleep(3000);
		click(pom.get_Instance_cc().getCheckout());
		pom.get_Instance_sumcc().getSummaryckot();
		click(pom.get_Instance_sumcc().getSummaryckot());
		pom.get_Instance_addresscc().getAddresschout();
		click(pom.get_Instance_addresscc().getAddresschout());
		pom.get_Instance_shipping().getTerms();
		click(pom.get_Instance_shipping().getTerms());
		pom.get_Instance_shipping().getShipping_checkout();
		click(pom.get_Instance_shipping().getShipping_checkout());
		pom.get_Instance_payment().getPaybybank();
		click(pom.get_Instance_payment().getPaybybank());
		pom.get_Instance_order().getOder();
		click(pom.get_Instance_order().getOder());
		javascript();
		screenshot("img2.png");
		log.info("2nd oder is booked for automation");
		click(pom.get_Instance_Logout().getLogout());
		driver.navigate().to("http://automationpractice.com/index.php");
		
		//purchase 3
		pom.get_Instance_Hp().getSignin_btn();
		click(pom.get_Instance_Hp().getSignin_btn());
		pom.get_Instance_loginpg().getEmail();
		sendkeys(pom.get_Instance_loginpg().getEmail(),username);
		pom.get_Instance_loginpg().getPassword();
		sendkeys(pom.get_Instance_loginpg().getPassword(), password);
		pom.get_Instance_loginpg().getSignin_btn();
		click(pom.get_Instance_loginpg().getSignin_btn());
		click(pom.get_Instance_Hp().getTshirt());
		javascript();
		pom.get_Instance_tshirtpg().getTshirt_img();
		click(pom.get_Instance_tshirtpg().getTshirt_img());
		frame_in(0);
		pom.get_Instance_cart().getAddtocart();
		click(pom.get_Instance_cart().getAddtocart());
		frame_out();
		pom.get_Instance_cc().getCheckout();
		Thread.sleep(3000);
		click(pom.get_Instance_cc().getCheckout());
		pom.get_Instance_sumcc().getSummaryckot();
		click(pom.get_Instance_sumcc().getSummaryckot());
		pom.get_Instance_addresscc().getAddresschout();
		click(pom.get_Instance_addresscc().getAddresschout());
		pom.get_Instance_shipping().getTerms();
		click(pom.get_Instance_shipping().getTerms());
		pom.get_Instance_shipping().getShipping_checkout();
		click(pom.get_Instance_shipping().getShipping_checkout());
		pom.get_Instance_payment().getPaybybank();
		click(pom.get_Instance_payment().getPaybybank());
		pom.get_Instance_order().getOder();
		click(pom.get_Instance_order().getOder());
		javascript();
		screenshot("img3.png");
		log.info("3rd oder is booked for automation");
		click(pom.get_Instance_Logout().getLogout());
		quit();

	
	}
}
