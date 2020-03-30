package com.crm.qa.lisener;

import java.awt.Color;
import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.crm.qa.util.CaptureScreenShot;

public class Listener extends TestListenerAdapter {
	
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	public void onStart(ITestContext testContext) {
		
		htmlreporter = new ExtentHtmlReporter("D:\\Automation\\FreeCRMTest\\Reports\\extent.html");
		htmlreporter.loadXMLConfig("D:\\Automation\\FreeCRMTest\\extent-config.xml");
		
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		extent.setSystemInfo("host","Local" );
		extent.setSystemInfo("tester","Priya" );
		extent.setSystemInfo("environment","SIT" );
		
		htmlreporter.config().setDocumentTitle("Over All test report");
		htmlreporter.config().setReportName("DEMOQA Report");
		
		
		
	}
	
	public void 	onTestSuccess(ITestResult tr) {
		
	  test=extent.createTest(tr.getName());
	  System.out.println(tr.getName());

	  test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
	  CaptureScreenShot.captureScreenshots();
	
	}
	
    public void 	onTestFailure(ITestResult tr) {
      test=extent.createTest(tr.getName());
  	  test.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
  	  
  	
    }
    public void 	onTestSkip(ITestResult tr) {
		
  	  test=extent.createTest(tr.getName());
  	  test.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.AMBER));
  
  	
  	}
    public void 		onFinish(ITestContext testContext) {
		
    
    	extent.flush();
    	
    	}
    
}
