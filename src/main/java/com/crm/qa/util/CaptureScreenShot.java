package com.crm.qa.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.crm.qa.base.BaseTest;

import org.apache.commons.io.FileUtils;

public class CaptureScreenShot extends BaseTest {
	
	public static void captureScreenshots() {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
	File sr=	ts.getScreenshotAs(OutputType.FILE);
	
	
	try {
		FileUtils.copyFile(sr,new File("D:\\Automation\\FreeCRMTest\\ScreenShots\\output.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
