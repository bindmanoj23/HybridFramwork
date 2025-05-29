package com.vtiget.testScript;

import java.lang.reflect.Method;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.dss.vtiger.pages.CreateProductFormPage;
import com.dss.vtiger.pages.HomePage;
import com.dss.vtiger.pages.LoginPage;
import com.dss.vtiger.pages.ProductInformarnationPage;
import com.dss.vtiger.pages.ProductPage;
import com.dss.vtiger.utils.WebUtil;

public class ProductAutomationScript {

    WebUtil wu;
    ExtentTest et;
    ExtentReports extentReport;

    @BeforeSuite
    public void beforeSuite() {
        extentReport = new ExtentReports();
        ExtentSparkReporter extentSpark = new ExtentSparkReporter("report/VTigerReport.html");
        extentReport.attachReporter(extentSpark);
    }

    @AfterSuite
    public void afterSuite() {
        extentReport.flush();
    }

    @BeforeMethod
    public void beforeTest(Method m) {
        String tcName = m.getName();
        et = extentReport.createTest(tcName);
        wu = new WebUtil(et);
        wu.launchBrowser("chrome", 60);
    }

    @AfterMethod
    public void afterTest() {
        wu.closeBrowser();
    }

    @Test
    public void PT001createNewProductwithValidData() {
        wu.openURL("http://localhost:8888/");

        LoginPage lp = new LoginPage(wu);
        lp.validLogin();

        HomePage hp = new HomePage(wu);
        hp.clickOnProductsLink();

        ProductPage pp = new ProductPage(wu);
        pp.clickCreateProductBT();

        CreateProductFormPage cpp = new CreateProductFormPage(wu);
        cpp.productFillupForm();
        cpp.saveButton();
    }
}
