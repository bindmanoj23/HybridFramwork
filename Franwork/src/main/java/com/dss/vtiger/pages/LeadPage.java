package com.dss.vtiger.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.dss.vtiger.utils.WebUtil;

public class LeadPage extends BasePage{
	
	public WebUtil wu;
	public LeadPage(WebUtil wuObject) {
		super(wuObject);
		wu=wuObject;
		PageFactory.initElements(wu.getDriver(), this);
	}
	
	@FindBy(xpath="//img[@alt='Create Lead...']")
	private WebElement createLeadButton;
	
	public WebElement getCreateLeadButton() {
		return createLeadButton;
		
	}
	
	@FindBys(@FindBy(xpath="//a"))
	private List<WebElement> allLink;
	
	public List<WebElement> getAllLink() {
		return allLink;
	}
	
	@FindBys(@FindBy(xpath="input[@name='selected_id']"))
	private List<WebElement>tableCheakBox;
	
	public List<WebElement> getTableCheakBox(){
		return tableCheakBox;
	}
	
	//--------------------clickonCreateButton----------------------
	

	public void clickOnCreateLeadButton() {
		  
		   // create lead button
		   wu.click( createLeadButton,"leadCreateButton");

}
	
	public void fatchAllLinkTextOnLeadPage() {
		
		
	}
	
	public void searchLead() {
		
		
		
	}
}
