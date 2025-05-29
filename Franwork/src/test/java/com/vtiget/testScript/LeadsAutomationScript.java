package com.vtiget.testScript;

import java.lang.reflect.Method;
import java.net.SocketException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.dss.vtiger.pages.CreateLeadPage;
import com.dss.vtiger.pages.HomePage;
import com.dss.vtiger.pages.LeadInformationPage;
import com.dss.vtiger.pages.LeadPage;
import com.dss.vtiger.pages.LoginPage;
import com.dss.vtiger.utils.WebUtil;

public class LeadsAutomationScript {
	
	private WebUtil wu;
	private ExtentReports extReport;
	private ExtentTest et;
	
	@BeforeSuite
	public void beforeSuitTestCase() {
		
	   extReport=new ExtentReports();
		ExtentSparkReporter extSpark =new ExtentSparkReporter("report\\VTigerReport.html");
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
	@AfterMethod
	public void afterTestCase() throws SocketException {
	   wu.closeBrowser();
	}

	

	@Test(groups = {"smoke","Regression"})
	public void vt001createLeadWithRequriedFild()  {
		
		wu.openURL("http://localhost:8888/");
		LoginPage login=new LoginPage(wu);
		login.validLogin();
		
		HomePage hp=new HomePage(wu);
		hp.clickOnLeadsLink();
		
		LeadPage lp=new LeadPage(wu);
		lp.clickOnCreateLeadButton();
		lp.fatchAllLinkTextOnLeadPage();
		
		CreateLeadPage clp=	new CreateLeadPage(wu);
		clp.fillupRequired();
		clp.saveButton();
		
		LeadInformationPage info=new LeadInformationPage(wu);
		info.leadInfo();
	}
	
	// Test Cae - vt002
     @Test(groups = { "Regression","smoke"} , priority = -1)
	public void vt002createLeadCancel() {
    	 wu.openURL("http://localhost:8888/");
		 LoginPage login=new LoginPage(wu);
	   	login.validLogin();
		
		 HomePage hp=new HomePage(wu);
		 hp.clickOnLeadsLink();
		
		LeadPage lp=new LeadPage(wu);
		lp.clickOnCreateLeadButton();
		
		CreateLeadPage clp=	new CreateLeadPage(wu);
		clp.fillupRequired();
		clp.cancelButton();
		
	}
	
	// Test Cae - vt003
      @Test(groups = "Regression")
    public void vt003creatLeadWithoutRequredFild() {
		 
    	  wu.openURL("http://localhost:8888/");
          LoginPage login=new LoginPage(wu);
          login.validLogin();
          
          HomePage hp=  new HomePage(wu);
          hp.clickOnLeadsLink();
          
          LeadPage leads= new LeadPage(wu);
          leads.clickOnCreateLeadButton();
          
          CreateLeadPage clp=  new CreateLeadPage(wu);
          clp.saveButton();
       
          
           
          
		
	}
	// Test Cae - vt004
     @Test(groups = "Regression")
	public void vt004testLeadCreateWithAllFilds() {
    	 wu.openURL("http://localhost:8888/");
    	 LoginPage login=new LoginPage(wu);
 		login.validLogin();
 		
 		HomePage hp=new HomePage(wu);
 		hp.clickOnLeadsLink();
 		
 		LeadPage lp=new LeadPage(wu);
 		lp.clickOnCreateLeadButton();
 		
 	
     }
     @Test
  public void vt005leadsLinkPresentOrNot() {
	  wu.openURL("http://localhost:8888/");
	  LoginPage lp=  new LoginPage(wu);
	  lp.validLogin();
	  HomePage hp=new HomePage(wu);
	  hp.leadLinksPresentOrNotOnHomePage();
	  
  }
     




}
