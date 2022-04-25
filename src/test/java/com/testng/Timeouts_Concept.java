package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timeouts_Concept {
	@Test(timeOut = 20000)//if we give 2000 thread timeout exception
	private void browser_launch() throws Throwable {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\March22\\Drivers\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  //driver.get("https://www.google.com/");
driver.navigate().to("http://adactinhotelapp.com/");
driver.findElement(By.id("username")).sendKeys("Gayathri7696");
driver.findElement(By.id("password")).sendKeys("SD95CF");
driver.findElement(By.id("login")).click();
driver.quit();
	}





}

