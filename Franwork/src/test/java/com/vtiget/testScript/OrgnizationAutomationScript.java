package com.vtiget.testScript;

import com.aventstack.extentreports.ExtentTest;
import com.dss.vtiger.pages.CreateNewOrgnization;
import com.dss.vtiger.pages.HomePage;
import com.dss.vtiger.pages.LoginPage;
import com.dss.vtiger.pages.OrganizationsPage;
import com.dss.vtiger.utils.WebUtil;

public class OrgnizationAutomationScript {
	ExtentTest et;
	public void createOrgnizationWithRequriedFilds() {
		
		WebUtil wu=new WebUtil(et);
		wu.launchBrowser("chrome" ,60);
		wu.openURL("http://localhost:8888/");
		
		LoginPage login=new LoginPage(wu);
		login.validLogin();
		
		HomePage hp=new HomePage(wu);
		hp.clickOnOrganizationsLink();
		
		OrganizationsPage org=new OrganizationsPage(wu);
		org.click_on_Orgnization_Button();
		
		CreateNewOrgnization createorg=new CreateNewOrgnization(wu);
		createorg.cancelButton();
		createorg.saveButton();
		
		}

	
}
