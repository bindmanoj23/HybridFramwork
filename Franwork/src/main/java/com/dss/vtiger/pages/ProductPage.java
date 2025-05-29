package com.dss.vtiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dss.vtiger.utils.WebUtil;

public class ProductPage extends BasePage {
	
	private WebUtil wu;
	public ProductPage(WebUtil wu) {
		super(wu);
		this.wu=wu;
		PageFactory.initElements(wu.getDriver(), this);
	}
    @FindBy(xpath="//strong[text()='Add Product']")
	private WebElement createPruduct;
    
    public WebElement getcreatProduct() {
    	return createPruduct;
    	
    }
	public void clickCreateProductBT() {
		
		wu.click(getcreatProduct(), "ProductLinks");
		
	}
	
	
	
	
	
	
	
	
}
