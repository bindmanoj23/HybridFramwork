package com.aig.testScript.smoke;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dss.vtiger.utils.WebUtil;

public class SmartPhonePage {
	private WebUtil wu;
	public SmartPhonePage(WebUtil wuObject) {
		wu=wuObject;
		PageFactory.initElements(wu.getDriver(), this);
	}
     
	@FindBy(xpath="//h2[text()='Top Deals']")
	private WebElement topDeals;
	public WebElement getTopDeals() {
		return topDeals;
	}
}
