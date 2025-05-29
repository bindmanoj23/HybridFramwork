package com.dss.vtiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.dss.vtiger.utils.WebUtil;

public class OrganizationsPage extends BasePage {
	private  WebUtil wu;
	public OrganizationsPage(WebUtil wuObject) {
		super(wuObject);
	wu=wuObject;
	
	PageFactory.initElements(wu.getDriver(), this);
	}
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement orgBT;
	
	public WebElement getOrgBT() {
		return orgBT;
	}
	
	public void click_on_Orgnization_Button() {
		wu.click(orgBT, "OrgnizationButton");
	}

}
