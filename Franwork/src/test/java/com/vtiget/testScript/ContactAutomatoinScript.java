package com.vtiget.testScript;

import com.aventstack.extentreports.ExtentTest;
import com.dss.vtiger.pages.HomePage;
import com.dss.vtiger.pages.LoginPage;
import com.dss.vtiger.utils.WebUtil;

public class ContactAutomatoinScript {
	private WebUtil wu;
	private ExtentTest et;
	
	public void beforeTestCase() {
		
	}
	
	public void vt01CteateContactWithValidData() {
	//login-click on contact-click on  plus button- fillupAllRequredFild-save	
		
		 wu=new WebUtil(et);
		 wu.launchBrowser("http://localhost:8888/", 60);
		 LoginPage lp= new LoginPage(wu);
		 lp.validLogin();
		 
		 HomePage hp=new HomePage(wu);
		
		
		
		
	}
	
	

}
