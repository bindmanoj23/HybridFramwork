package testxml;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;

public class ClassA  {
    WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setup(String browser) {
        CommanClass cc = new CommanClass();
        driver = cc.lanchB(browser); 
    }

    @Test
    public void tc01() {
        System.out.println("ClassA - Test case 1 - " + driver);
    }

    @Test
    public void tc02() {
        System.out.println("ClassA - Test case 2 - " + driver);
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
