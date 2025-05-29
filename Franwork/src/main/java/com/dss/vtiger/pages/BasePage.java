package com.dss.vtiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.dss.vtiger.utils.WebUtil;

     public class BasePage {
    	 
    	 private WebUtil wu;
    	 
    	 public BasePage(WebUtil wuObject) {
    		 
    		 wu=wuObject;
    		 PageFactory.initElements(wu.getDriver(), this);
    	 }
	
     @FindBy(xpath="//input[@name='search_text']")
     private WebElement searchButton;
     
     public WebElement getSearchButton() {
    	 return searchButton;
     }
    
     @FindBy(xpath="")
     private WebElement searchTextBox;
     
     @FindBy(xpath="")
     private WebElement searchDropDown;
     
     @FindBy(xpath="")
     private WebElement deleteButton;
   
     @FindBy(xpath="")
     private WebElement sendMailButton;
     
     @FindBy(xpath="")
     private WebElement massEditButton;
    
     @FindBy(xpath="")
     private WebElement editButton;
    
     @FindBy(xpath="//strong[text()='Save']")
 	private WebElement saveButton;
 	
 	public WebElement getSaveButton() {
 		return saveButton;
 	}
     

	@FindBy(xpath="//a[text()='Cancel']")
	private WebElement cancelButton;
	
	public WebElement getCancelButton() {
		return cancelButton;
	}
    //--------------------Use Method--------------------------
 	//----------------------------------------------------------
 	
 	public void cancelButton() {// cencel button
     wu.click(cancelButton, "cancelButton"); 
     
	}
	public void saveButton() {// save button
	     wu.click(saveButton, "SaveButton");
	   
		}
	
	public void searchBT() {// seaechButton
    	wu.click(searchButton, "SearchButton");
    	 }
     
	

}
