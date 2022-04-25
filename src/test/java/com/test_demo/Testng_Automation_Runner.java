package com.test_demo;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Main_demo.Base_class;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.logger_demo.Property_Configuration;
import com.object.Page_Object_Manager;
import com.property.reader.File_Reader_Manager;

public class Testng_Automation_Runner extends Base_class {
public static WebDriver driver=browser_configuration("chrome");	
public static Page_Object_Manager pom=new Page_Object_Manager(driver);
public static Logger log=Logger.getLogger(Property_Configuration.class);
public static ExtentReports reports;
public static ExtentTest test;
public static ExtentSparkReporter spark_Reporter;
@BeforeTest
private void report_Generation() {

	spark_Reporter=new ExtentSparkReporter("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Reports-project\\Extent_Report.html");
	reports=new ExtentReports();
	reports.attachReporter(spark_Reporter);
}
@AfterTest
private void flush() {
reports.flush();
}

@BeforeClass
private void browser_launch() throws Throwable {
	PropertyConfigurator.configure("log4j.properties");
	String url=File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_config_url();
	geturl(url);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	log.info("Automation Url launch");
}
@BeforeMethod
private void signin() throws Throwable {
	pom.get_Instance_Hp().getSignin_btn();
	click(pom.get_Instance_Hp().getSignin_btn());
	pom.get_Instance_loginpg().getEmail();
	String username=File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Instance_email();
	sendkeys(pom.get_Instance_loginpg().getEmail(),username);
	pom.get_Instance_loginpg().getPassword();
	String password=File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Instance_password();
	sendkeys(pom.get_Instance_loginpg().getPassword(), password);
	pom.get_Instance_loginpg().getSignin_btn();
	click(pom.get_Instance_loginpg().getSignin_btn());
}
@AfterMethod
private void signout() {
	click(pom.get_Instance_Logout().getLogout());
	driver.navigate().to("http://automationpractice.com/index.php");
}
@Test
private void women() throws Throwable {
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
}

@AfterClass
private void Close() {
System.out.println("...........Thank you.....shop again......");
quit();
}
@Test(priority = -1)
private void dress() throws Throwable {
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
}
@Test(priority = 1)
private void tshirt() throws Throwable {
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


}




















}
