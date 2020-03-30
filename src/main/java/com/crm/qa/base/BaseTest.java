package com.crm.qa.base;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.crm.qa.util.ReadUtil;

public class BaseTest {
	
	public static WebDriver driver;
	
	public static Logger logger;
	public static ReadUtil rd;
	@Parameters("browser")	
	@BeforeTest
   
	public static void initialization(String browsername)
	{
		logger =Logger.getLogger("Demo QA");
	    DOMConfigurator.configure("Log4j.xml");
	    rd  = new ReadUtil();
	//    String browser = rd.getbrowser();
	//	if(browser.contains("browser"))
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
		driver.get(rd.geturl());
		logger.info("Browser opened");
		
		
	}
   
   @AfterTest
   public void tearDown()
   {
	  driver.quit();
	   logger.info("browser quit");
   }
  

}
