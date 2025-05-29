package testxml;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommanClass {
	WebDriver driver;
	
		public WebDriver lanchB(String browser) {
		    if (browser.equalsIgnoreCase("chrome")) {
		        driver = new ChromeDriver();
		    } else if (browser.equalsIgnoreCase("edge")) {
		        driver = new EdgeDriver();
		    } else if (browser.equalsIgnoreCase("firefox")) {
		        driver = new FirefoxDriver();
		    } else {
		        System.out.println("Invalid driver");
		    }
		    return driver;
		}

		
	}


