package testxml;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassD {
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void beforeTest(String browser) {
		CommanClass cc=	new CommanClass();
		cc.lanchB(browser);
	}
	@Test
	
public void tc010() {
		
		System.out.println("Test case 10 from classD");
	}
	@Test
public void tc011() {
	
	System.out.println("Test case 11 from classD");
}
	
	 @AfterMethod
	    public void teardown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
}
