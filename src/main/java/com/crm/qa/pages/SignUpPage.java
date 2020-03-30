package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseTest;

public class SignUpPage extends BaseTest{
	
	@FindBy(id="email")
	WebElement email_id;
	
	@FindBy(id="enterimg")
	WebElement entering;
	

	public SignUpPage(WebDriver driver) {
	
		logger.info("in constructor");
		PageFactory.initElements(driver, this);
	}

	public void Signup(String eml)
	{
		System.out.println(eml);
		email_id.sendKeys(eml);
		entering.click();
	
	}

}
