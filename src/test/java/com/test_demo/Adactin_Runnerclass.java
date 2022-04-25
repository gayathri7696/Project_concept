package com.test_demo;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.Main_demo.Base_class;
import com.object.Page_obj_manager_adactin;
import com.pom_adactin.Adactin_bookhotel;
import com.pom_adactin.Adactin_homepg;
import com.pom_adactin.Adactin_itinerary;
import com.pom_adactin.Adactin_search_hotel;
import com.pom_adactin.Adactin_selectpg;
import com.property.reader.Adactin_Filereader_Manager;

public class Adactin_Runnerclass extends Base_class {
	public static WebDriver driver=browser_configuration("chrome");
	public static Page_obj_manager_adactin pomad=new Page_obj_manager_adactin(driver);
	public static Logger log=Logger.getLogger(Adactin_Runnerclass.class);
	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		//geturl("http://adactinhotelapp.com/");
		String url=Adactin_Filereader_Manager.get_Instance_AFRM().get_Instance_ACR().get_Instance_url();
		geturl(url);
		log.info("adactin url launched");
		pomad.get_instance_hp().getUsername();
		//String username=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Adactin-test case.xlsx", 2, 5);
		String username=Adactin_Filereader_Manager.get_Instance_AFRM().get_Instance_ACR().get_Instance_username();
		
		sendkeys(pomad.get_instance_hp().getUsername(), username);
		pomad.get_instance_hp().getPassword();
		//String password=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Adactin-test case.xlsx", 3, 5);
		String password=Adactin_Filereader_Manager.get_Instance_AFRM().get_Instance_ACR().get_Instance_password();
		sendkeys(pomad.get_instance_hp().getPassword(), password);
		pomad.get_instance_hp().getLogin();
		click(pomad.get_instance_hp().getLogin());
		pomad.get_Instance_search().getLocation();
		dropdown("ByIndex", pomad.get_Instance_search().getLocation(), "5");
		pomad.get_Instance_search().getHotel();
		dropdown("ByValue", pomad.get_Instance_search().getHotel(), "Hotel Sunshine");
		pomad.get_Instance_search().getRoom_type();
		dropdown("byindex",pomad.get_Instance_search().getRoom_type(),"4");
		pomad.get_Instance_search().getRoom_no();
		dropdown("byindex",pomad.get_Instance_search().getRoom_no(),"1");
		pomad.get_Instance_search().getCheckin();
		clear(pomad.get_Instance_search().getCheckin());
		//String checkin=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Adactin-test case.xlsx", 17, 5);
		String checkin=Adactin_Filereader_Manager.get_Instance_AFRM().get_Instance_ACR().get_Instance_checkin();
		sendkeys(pomad.get_Instance_search().getCheckin(),checkin);
		pomad.get_Instance_search().getCheckout();
		clear(pomad.get_Instance_search().getCheckout());
		//String checkout=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Adactin-test case.xlsx", 18, 5);
		String checkout=Adactin_Filereader_Manager.get_Instance_AFRM().get_Instance_ACR().get_Instance_checkout();
		sendkeys(pomad.get_Instance_search().getCheckout(), checkout);
		pomad.get_Instance_search().getSubmit();
		click(pomad.get_Instance_search().getSubmit());
		pomad.get_Instance_selpg().getRadio_btn();
		click(pomad.get_Instance_selpg().getRadio_btn());
		pomad.get_Instance_selpg().getCont();
		click(pomad.get_Instance_selpg().getCont());
		pomad.get_Instance_bk().getFirst_name();
		//String first_name=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Adactin-test case.xlsx", 22, 5);
		String first_name=Adactin_Filereader_Manager.get_Instance_AFRM().get_Instance_ACR().get_Instance_firstname();
		sendkeys(pomad.get_Instance_bk().getFirst_name(), first_name);
		pomad.get_Instance_bk().getLast_name();
		//sendkeys(pomad.get_Instance_bk().getLast_name(), particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Adactin-test case.xlsx", 23, 5));
		//String last_name=particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Adactin-test case.xlsx", 23, 5);
		String last_name=Adactin_Filereader_Manager.get_Instance_AFRM().get_Instance_ACR().get_Instance_lastname();
		sendkeys(pomad.get_Instance_bk().getLast_name(),last_name );
		
		pomad.get_Instance_bk().getAddress();
		//sendkeys(pomad.get_Instance_bk().getAddress(),particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Adactin-test case.xlsx", 24, 5));
		String address=Adactin_Filereader_Manager.get_Instance_AFRM().get_Instance_ACR().get_Instance_address();
		sendkeys(pomad.get_Instance_bk().getAddress(), address);
		pomad.get_Instance_bk().getCredit_card();
		//sendkeys(pomad.get_Instance_bk().getCredit_card(), particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Adactin-test case.xlsx", 25, 5));
		String credit_card=Adactin_Filereader_Manager.get_Instance_AFRM().get_Instance_ACR().get_Instance_creditcard();
		sendkeys(pomad.get_Instance_bk().getCredit_card(), credit_card);
		pomad.get_Instance_bk().getCard_type();
		dropdown("byvalue", pomad.get_Instance_bk().getCard_type(),"VISA");
		pomad.get_Instance_bk().getEx_month();
		dropdown("byindex", pomad.get_Instance_bk().getEx_month(),"6");
		pomad.get_Instance_bk().getEx_yr();
		dropdown("byvalue", pomad.get_Instance_bk().getEx_yr(), "2022");
		pomad.get_Instance_bk().getCvv();
		//sendkeys(pomad.get_Instance_bk().getCvv(),particular_celldata("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Adactin-test case.xlsx", 28, 5));
		String cvv=Adactin_Filereader_Manager.get_Instance_AFRM().get_Instance_ACR().get_Instance_cvv();
		sendkeys(pomad.get_Instance_bk().getCvv(), cvv);
		pomad.get_Instance_bk().getBook();
		click(pomad.get_Instance_bk().getBook());
		navigate("http://adactinhotelapp.com/BookedItinerary.php");
		screenshot("img.png");
		pomad.get_Instance_it().getLogout();
		click(pomad.get_Instance_it().getLogout());	
		log.info("hotel booked");
		quit();
		
	}

}
