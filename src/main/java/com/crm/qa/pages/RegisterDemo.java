package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.BaseTest;
import com.crm.qa.util.monthConvert;

public class RegisterDemo extends BaseTest {
	
	public RegisterDemo(WebDriver driver)
	{
		logger.info("in Register Demo constructor");
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")
	WebElement fname;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")
	WebElement lname;
	
	@FindBy(xpath="//*[@id=\"eid\"]/input")
	WebElement email_id;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")
	WebElement phone;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")
	WebElement gender;
	
	@FindBy(id="countries")
	WebElement country;
	
	@FindBy(id="yearbox")
	WebElement year;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")
	WebElement month;
	
	@FindBy(id="daybox")
	WebElement day;
	
	@FindBy(xpath="//*[@id=\"firstpassword\"]")
	WebElement pwd;
	
	@FindBy(xpath="//*[@id=\"secondpassword\"]")
	WebElement cpwd;
	
	@FindBy(id="submitbtn")
	WebElement submitbtn;
	
	public void registeration(String Fname,String Lname,String email,String Phone,String Gender,String Country,String DOB,String Pwd) throws InterruptedException
	{
		fname.sendKeys(Fname);
		lname.sendKeys(Lname);
		email_id.sendKeys(email);
		Thread.sleep(30);
		phone.sendKeys(Phone);
		gender.click();
	
		Select oSelect =new Select(country);
		oSelect.selectByValue(Country);
		
				    logger.info("in date");
				    System.out.println(DOB);
				    
				    String yr = DOB.substring(0, 4);
				    String mn = DOB.substring(5, 7);
				    String dt = DOB.substring(8, 10);
				
				    
				    
		Select oSelectyr =new Select(year);
		oSelectyr.selectByValue(yr);
	    String mon=	monthConvert.mmtoMonth(mn);
		Select oSelectmn =new Select(month);
		oSelectmn.selectByValue(mon);
		Select oSelectdt =new Select(day);
		oSelectdt.selectByValue(dt);
		pwd.sendKeys(Pwd);
		cpwd.sendKeys(Pwd);
	    submitbtn.click();

	   
	}

	
	
	
	
	
	

}
