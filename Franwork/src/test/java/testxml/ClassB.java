package testxml;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ClassB {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void beforeTestcase(String browser) {
		CommanClass cc= new CommanClass();  
		cc.lanchB(browser);
		
	}
	@AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
	}}
	
	@Test
	public void tc05() {
		System.out.println("Test case 5 from classB");
	}
	@Test
	public void tc06() {
		System.out.println("Test case 6 from classB");
	}
	@Test
	public void tc07() {
		System.out.println("Test case 7 from classB");
	}

}
