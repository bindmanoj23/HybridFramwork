package com.vtiget.testScript;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.dss.vtiger.pages.HomePage;
import com.dss.vtiger.pages.LoginPage;
import com.dss.vtiger.utils.WebUtil;

public class TicketsTestScript {
	
	private WebUtil wu;
	private ExtentReports report;
	private ExtentTest et;
	
	@BeforeSuite
	public void beforeSuit() {
		report=new ExtentReports();
		ExtentSparkReporter sparkreport=new ExtentSparkReporter("report//VTReport.html");
		report.attachReporter(sparkreport);
	}
	@AfterSuite
	public void afterSuit() {
		report.flush();
	}
	@BeforeMethod
	public void beforeTestCase(Method m) {
		String tcName=m.getName();
		et=report.createTest(tcName);
		wu=new WebUtil(et);
		wu.launchBrowser("chrome", 60);
	}
	@AfterMethod
	public void afterTestCase() {
		wu.closeBrowser();
	}
	@Test
	
	public void tt001CreateNewTicket() {
		wu.openURL("http://localhost:8888/");
		LoginPage lp=new  LoginPage(wu);
		lp.validLogin();
		
		HomePage hp=new HomePage(wu);
		hp.clickOnTicketsLink();
		
		
		
	}
	

}
