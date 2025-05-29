package com.dss.vtiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.dss.vtiger.utils.WebUtil;

public class HomePage extends BasePage {
	
	public WebUtil wu;
	public HomePage(WebUtil wuObject) {// cunstructor
		super(wuObject);
		wu=wuObject;
		
		PageFactory.initElements(wu.getDriver(), this);
		
	}
	@FindBy(xpath="//a[text()='Products']")
	private WebElement productsLink;
	
	public  WebElement getProduct() {
		return productsLink;
	}
	
	@FindBy(xpath="//a[text()='Leads']")
	private WebElement leadLink;
	public WebElement getLeadLink() {
		return leadLink;
	}
	@FindBy(xpath="")
	private WebElement searchButton;
	public WebElement getSearchButton() {
		return  searchButton;
	}
	
    @FindBy(xpath="//a[text()='Organizations']")
	private WebElement orgnization;
    public WebElement getOrgnization() {
		return  orgnization;
	}
    @FindBy(xpath="//a[text()='Contact']")
      private WebElement contact;
      public WebElement getContact() {
    	  return contact;
      }
      @FindBy(xpath="//a[text()='Tickets']")
      private WebElement tickets;
      
      public WebElement getTickets() {
    	  return tickets;
      }
      
	public void clickOnLeadsLink() {// Lead Link
	    wu.click(leadLink,"lead");
	}
	
	
	public void clickOnOrganizationsLink() {
	    wu.click(orgnization, "Orgnization");
	}
	
	public void links() {
	 wu.getAllElementsText("//a");
		
	}
   
	public void contactClik() {
		
	}
	public void clickOnProductsLink() {
		wu.click(getProduct(), "ProductsLink");
		
	}

	public void leadLinksPresentOrNotOnHomePage() {
		wu.validateElementIsDisabled(getLeadLink());
		wu.validateInnerText(getLeadLink(), "lead", "Leads Link");
		
	}
	
	public void clickOnTicketsLink() {
		wu.click(getTickets(), "Tickets Link");
	}
}
