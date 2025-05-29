package com.vtiget.testScript;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;
import com.dss.vtiger.utils.WebUtil;

public class TestOpportunitieseScript  {
	ExtentTest et;

public void testCreateOpportunitieseFuncitionslity(ExtentTest extTest) throws InterruptedException {
	WebUtil wu= new WebUtil(et);
	 WebElement oper=wu.searchElement("//a[text()='Opportunities']","oppertunity");
	  wu.click( oper, "opertunity");
	  
	  WebElement createOper=wu.searchElement("//img[@title='Create Opportunity...']","createOpertunity");
	  wu.click(createOper,"createOpertunity");
	  
	  // opertunise name
	  WebElement operName=wu.searchElement("//input[@name='potentialname']","opertunityName");
	  wu.type( operName, "mkb100pr","opertunityName");
	  
//	  // window cheng
//	 WebElement choseorg= wu.searchElement(driver, "//input[@id='related_to_display']/parent::td[@class='dvtCellInfo']//img[@alt='Select']");
//   wu.click(driver, choseorg);
   
  

}

public void testDeletOpportunitieseFuncitionslity() {
	

}
public void testEditOpportunitieseFuncitionslity() {


}
public void testSearchOpportunitieseFuncitionslity() {

//code

}
}
