package com.property.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	public Configuration_Reader() throws IOException
	{
		File f=new File("C:\\Users\\Gayathri\\eclipse-workspace\\March22\\src\\main\\java\\com\\testdata\\property\\Configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		 p=new Properties();
		p.load(fis);	
	}
	public String get_config_url()
	{
	String url=p.getProperty("url");
	return url;
	}
	public String get_Instance_email()
	{
		String email=p.getProperty("email");
		return email;
	}
	public String get_Instance_password()
	{
		String password=p.getProperty("password");
		return password;
	}

}
