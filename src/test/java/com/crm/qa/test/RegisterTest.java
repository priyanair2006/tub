package com.crm.qa.test;

import java.io.IOException;
import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseTest;
import com.crm.qa.pages.RegisterDemo;

import com.crm.qa.util.XlUtils;

public class RegisterTest extends BaseTest{

	@Test(dataProvider ="Register")
	public void registerTest(String Fname,String Lname,String email,String Phone,String Gender,String Country,String DOB,String Pwd)
	{
		RegisterDemo regis = new RegisterDemo(driver);
		try {
			regis.registeration(Fname,Lname,email,Phone,Gender,Country,DOB,Pwd);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("testcase passed");
	}
	
	
	@DataProvider(name="Register")
	public String[][]readXl() throws IOException
	{
		String Path ="D:\\Automation\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\testdata\\Book1.xlsx";
		int row= XlUtils.getRowcount(Path, "Sheet1");
		int col = XlUtils.getCellCount(Path, "Sheet1", 1);
		String regisdata[][] = new String [row][col];
		
		for(int i= 1;i< row;i++)
		{
			for(int j=0;j<col;j++)
			{
				regisdata[i-1][j]=XlUtils.getCellData(Path, "Sheet1", i, j);
			}
		}
			
		
		return regisdata;
	}
}
