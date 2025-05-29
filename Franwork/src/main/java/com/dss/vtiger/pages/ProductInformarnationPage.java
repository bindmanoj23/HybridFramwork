package com.dss.vtiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dss.vtiger.utils.WebUtil;

public class ProductInformarnationPage  extends BasePage{
	
	private WebUtil wu;
	public ProductInformarnationPage(WebUtil wu) {
		super(wu);
		this.wu=wu;
		PageFactory.initElements(wu.getDriver(),this);
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Product Information')]")
	private WebElement infoHeader;
	public WebElement getProductInfo() {
		return infoHeader;
	}
	
	public void productInfo() {
		wu.validateInnerText(getProductInfo(), "Product Information","ProductInformation Page");
	}

}
