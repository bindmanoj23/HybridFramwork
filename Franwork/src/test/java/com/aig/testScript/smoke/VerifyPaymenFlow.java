package com.aig.testScript.smoke;

import java.lang.reflect.Method;
import java.net.SocketException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.dss.vtiger.utils.WebUtil;


public class VerifyPaymenFlow {
	private WebUtil wu;
	private ExtentReports extReport;
	private ExtentTest et;
	
	@BeforeSuite
	public void beforeSuitTestCase() {
		
	   extReport=new ExtentReports();
		ExtentSparkReporter extSpark =new ExtentSparkReporter("jumiaReport\\Report.html");
		extReport.attachReporter(extSpark);

	}
	@AfterSuite
	public void afterSuitTestCase() {
		
		extReport.flush();
	}	
	
	
	
	@BeforeMethod
	public void beforeTestCase(Method mt) {
		String tcName=mt.getName();
		 et=extReport.createTest(tcName);
		
		wu=new WebUtil(et);
		wu.launchBrowser("chrome",60);
		
	}
	
	@AfterSuite
	public void afterMethodCase() throws SocketException {
		wu.closeBrowser();
		
	}
	@Test
	public void jm001VerifyPaymentScenario() {
		
		
		wu.openURL("https://www.jumia.com.ng/");
		JumiaHomePage jhp=new JumiaHomePage(wu);
		jhp.searchProduct();
		
		
		
	}

	
	
}

  