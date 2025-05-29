package com.aig.testScript.smoke;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dss.vtiger.utils.WebUtil;

public class JumiaHomePage {
	
	private WebUtil wu;
	
	public JumiaHomePage(WebUtil webObject) {
		wu=webObject;
		PageFactory.initElements(wu.getDriver(), this);
	
	}
	
	@FindBy(xpath="//input[@id='fi-q']")
	private WebElement textBox;
	public WebElement getTextBox() {
		return textBox;
	}
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement searchButton;
	public WebElement getSearchBT() {
		return searchButton;
	}
	
	@FindBy(xpath="//span[@id='ci']")
     private WebElement cartButton;
     public WebElement getCartBT() {
    	 return cartButton;
     }
		
     @FindBy(xpath="//label[text()='Account']")
		private WebElement account;
		public WebElement getAccount() {
			return account;
		}
	
       public void searchProduct() {
    	   wu.type(getTextBox(), "iphone", "SearchBox");
    	   wu.click(getSearchBT(), "SearchButton");
       }
}
