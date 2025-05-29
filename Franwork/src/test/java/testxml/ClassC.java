package testxml;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassC {
	WebDriver driver;
	@Parameters()
	@BeforeMethod
	public void beforerTestCase(String browser) {
		CommanClass cc=new CommanClass();
		cc.lanchB(browser);
	}
	
	@Test
public void tc08() {
		
		System.out.println("Test case 8 from classC");
	
	}
	@Test
public void tc09() {
	
	System.out.println("Test case 9 from classC");
}

	 @AfterMethod
	    public void teardown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
}
