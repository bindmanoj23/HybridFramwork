package com.dss.vtiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.dss.vtiger.utils.WebUtil;

public class LoginPage extends BasePage{
	
	private WebUtil wu;
	
	public LoginPage(WebUtil wuObject) {// parameterized-constructor
	super(wuObject);	
		wu=wuObject;
		
		PageFactory.initElements(wu.getDriver(), this);
	}
	@FindBy(xpath="//input[@name='username']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement loginButton;
	
	public void validLogin() {// login method
	  
	  wu.type( userName, "admin","userName admin");
		
      wu.type( password, "admin","password admin");
      
	  wu.click(loginButton,"LoginButton");
	  System.out.println("login testcase ended");
}

}
