package com.dss.vtiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dss.vtiger.utils.WebUtil;

public class LeadInformationPage extends BasePage{
	
	private WebUtil wu;
	public LeadInformationPage(WebUtil wuObject) {
		super(wuObject);
		wu=wuObject;
		
		PageFactory.initElements(wu.getDriver(), this);
	}
	// anotation
	@FindBy(xpath="//span[contains(text(),'Lead Information')]")
	private WebElement leadInfo;
	
    public WebElement getLeadInfo() {
    	return leadInfo;
    }
   
	//method
	 public void leadInfo() {
       wu.getInnerText(leadInfo,"LeadInformation");
     }
}
