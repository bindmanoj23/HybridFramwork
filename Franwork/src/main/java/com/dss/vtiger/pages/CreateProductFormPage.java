package com.dss.vtiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dss.vtiger.utils.WebUtil;

public class CreateProductFormPage extends BasePage {
	
	private WebUtil wu;
	public CreateProductFormPage(WebUtil wu) {
		super(wu);
		this.wu=wu;
		PageFactory.initElements(wu.getDriver(), this);
		
		
	}
	@FindBy(xpath="//input[@name='productname']")
	private WebElement productName;
	
	@FindBy(xpath="//i[@class='icon-calendar'][1]]")
	private WebElement salesdateCalender;
	
	@FindBy(xpath="//input[@name='productcode']")
    private WebElement partNumber;
	
//	@FindBy(xpath="//img[@title='Select']")
//	private WebElement VendorName;
	
	@FindBy(xpath="lvtColData")
	private WebElement vender;
	
	public WebElement getVendore() {
		return vender;
	}
//	
//	public WebElement getVendorName() {
//		return VendorName;
//	}
	
	public WebElement getPartumber() {
     return  partNumber;
	}
	
	public WebElement getSalesCalender() {
		return salesdateCalender;
	}
	public WebElement getProductName() {
		return productName;
	}
	public void productFillupForm() {
		
		wu.type(getProductName(), "Ramakrishna", "ProductName");
		wu.type(getPartumber(), "345678", "PartNumber");
		//wu.click(getVendorName(), "VendoreName");
		//wu.switchToWindowByURL("http://localhost:8888/index.php?module=Vendors&action=Popup&html=Popup_picker&popuptype=specific&form=EditView&fromlink=");
	    //wu.click(getVendore(), "VendoreName Marry");
	   
	}
	

}
