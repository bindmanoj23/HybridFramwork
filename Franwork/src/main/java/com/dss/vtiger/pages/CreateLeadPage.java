package com.dss.vtiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.dss.vtiger.utils.WebUtil;

public class CreateLeadPage extends BasePage {
	
	public WebUtil wu;// non static vatiable
	public CreateLeadPage(WebUtil wuObject) {// constructor
		super(wuObject);
		wu=wuObject;
		
	 PageFactory.initElements(wu.getDriver(), this);
	
	}
	
	// Anotation
	@FindBy(xpath="//select[@name='salutationtype']")
	private WebElement salutation;
	
	public WebElement getSalutation() {
		return salutation;
	}
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;
	
	public WebElement getLastName() {
		return lastName;
	}
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement companyName;
	
	public WebElement getCompanyName() {
		return companyName;
	}
	
	
	
	
	
	
	// method create lead
	public void fillupRequired() {
      
		wu.selectTextFromListBox(salutation, "Mr.","salutation");
        wu.type( lastName, "Prajapti","lastName");
		wu.type(companyName, "Exper View Automation", "CompanySm");
		 
	}
	
	
}
