package com.dss.vtiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dss.vtiger.utils.WebUtil;

public class CreateContactPage {
	private WebUtil wu;
	
	public CreateContactPage(WebUtil wu) {
		this.wu=wu;
		
		PageFactory.initElements(wu.getDriver(), this);
	}
	
	@FindBy(xpath="//span[text()='Creating New Contact']")
	 public WebElement contactHeader;
	
	
	public void verifyContactHeader() {
		wu.validateInnerText(contactHeader, "Creating New Contact","Contact Header");
		
	}

}
