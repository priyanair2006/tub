package com.crm.qa.test;



import org.testng.annotations.Test;

import com.crm.qa.base.BaseTest;
import com.crm.qa.pages.RegisterDemo;
import com.crm.qa.pages.SignUpPage;




public class SignUpTest extends BaseTest {
	
	public RegisterDemo register;
	
	
	@Test (priority = 1)
	public void testSignup() throws InterruptedException
	{
		SignUpPage signup = new SignUpPage(driver);
	
		
		String str= rd.getemail();
		System.out.print(str);
		signup.Signup(str);
		logger.info("testcase passed");
		
	
	
	}

	
   
}
