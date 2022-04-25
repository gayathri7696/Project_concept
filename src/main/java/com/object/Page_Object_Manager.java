package com.object;

import org.openqa.selenium.WebDriver;

import com.pom.Automation_addresscheckout;
import com.pom.Automation_addtocart;
import com.pom.Automation_cartcheckout;
import com.pom.Automation_conformoder;
import com.pom.Automation_dress;
import com.pom.Automation_evedress;
import com.pom.Automation_homepg;
import com.pom.Automation_loginpg;
import com.pom.Automation_logout;
import com.pom.Automation_payment;
import com.pom.Automation_shipping;
import com.pom.Automation_summarycheckout;
import com.pom.Automation_tshirt;
import com.pom.Automation_womenpg;

public class Page_Object_Manager {
	public static WebDriver driver;
	private Automation_homepg hp;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}
	public Automation_homepg get_Instance_Hp() {
		if(hp==null) {
		hp=new Automation_homepg(driver);
		}
		return hp; 
	 }
	private Automation_loginpg loginpg;
	public Automation_loginpg get_Instance_loginpg() {
		if(loginpg==null)
		{
			loginpg=new Automation_loginpg(driver);
		}
		return loginpg;
	}
	private Automation_womenpg womenpg;
	public  Automation_womenpg get_Instance_womenpg() {
	if(womenpg==null)	
	{
		womenpg=new Automation_womenpg(driver);
	}
	
	return womenpg;
	}
	private Automation_addtocart cart;
	public Automation_addtocart get_Instance_cart()
	{
		if(cart==null)
		{
			cart=new Automation_addtocart(driver);
		}
		return cart;	
	}
	private Automation_cartcheckout cc;
	public Automation_cartcheckout get_Instance_cc()
	{
		if(cc==null)
		{
			cc=new Automation_cartcheckout(driver);
		}
		return cc;
	}
	private Automation_summarycheckout sumcc;
	public Automation_summarycheckout get_Instance_sumcc()
	{
		if(sumcc==null)
		{
			sumcc=new Automation_summarycheckout(driver);
		}
		return sumcc;	
	}
	private Automation_addresscheckout addresscc;
	public Automation_addresscheckout get_Instance_addresscc()
	{
		if(addresscc==null)
		{
			addresscc=new Automation_addresscheckout(driver);
		}
		return addresscc;
	}
	private Automation_shipping shipping;
	public Automation_shipping get_Instance_shipping()
	{
		if(shipping ==null)
		{
			shipping=new Automation_shipping(driver);
		}
		return shipping;
	}
	private Automation_payment payment;
	public Automation_payment get_Instance_payment()
	{
		if(payment==null)
		{
			payment=new Automation_payment(driver);
		}
		return payment;
	}
	private Automation_conformoder order;
	public Automation_conformoder get_Instance_order()
	{
		if(order==null)
		{
			order=new Automation_conformoder(driver);
		}
		return order;	
	}
	
	private Automation_logout logout;
	public Automation_logout get_Instance_Logout()
	{
		if(logout==null)
		{
			logout=new Automation_logout(driver);
		}
		
		return logout;
	}
	private Automation_dress dress;
	public Automation_dress get_Instance_dress()
	{
		if(dress==null)
		{
			dress=new Automation_dress(driver);
		}
		return dress;
	}
	private Automation_evedress eve_dress;
	public Automation_evedress get_Instance_eve_dress()
	{
		if(eve_dress==null)
		{
			eve_dress=new Automation_evedress(driver);
		}
		return eve_dress;
	}
	private Automation_tshirt tshirtpg;
	public Automation_tshirt get_Instance_tshirtpg()
	{
		if(tshirtpg==null)
		{
			tshirtpg=new Automation_tshirt(driver);
		}
		return tshirtpg;
	}
	
	
	
	

}
