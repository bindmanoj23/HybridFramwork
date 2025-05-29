package com.dss.vtiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.dss.vtiger.utils.WebUtil;

public class CreateNewOrgnization extends BasePage {
	
	private WebUtil wu;
	public CreateNewOrgnization(WebUtil wuObject) {
		
		super(wuObject);
		wu=wuObject;
		PageFactory.initElements(wu.getDriver(), this);
		
	}
  
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgnizationName;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement website;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBT;
	
	
	
	public void createOrgnization() {
	    wu.type(orgnizationName, "Expert  View Automation", "Orgnization");
	    
	    wu.type(website, "expertviewautomation.com", "Website");
	   
}
}
