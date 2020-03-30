package com.crm.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class ReadUtil {

	public static Properties prop = new Properties();
	
	public ReadUtil() {
	
		try {
				FileInputStream ip = new FileInputStream("D:\\Automation\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
				try {
					prop.load(ip);
					} catch (IOException e) {
		// TODO Auto-generated catch block
						e.printStackTrace();
					}
					} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
						e.printStackTrace();
					}
		}
	
	public String getemail()
	{
		String  eml= prop.getProperty("email");
		return eml;
	}
	public String geturl()
	{
		String  url= prop.getProperty("url");
		return url;
	}
	public String getpwd()
	{
		String  pwd= prop.getProperty("password");
		return pwd;
	}
	
	public String getbrowser()
	{
		String  browser= prop.getProperty("browser");
		return browser;
	}
}


