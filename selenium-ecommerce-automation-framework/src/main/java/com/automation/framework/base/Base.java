package com.automation.framework.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.automation.framework.utilities.BrowserUtility;
import com.automation.framework.utilities.PropertyFile;

public class Base {

	protected WebDriver driver = null;
	protected BrowserUtility browserUtility = new BrowserUtility();
	PropertyFile file = new PropertyFile();

	@BeforeSuite
	public void beforeSuite() {

	}

	@BeforeClass
	public void beforeClass() throws Exception {
		 String browser = file.read("Browser") ; 
		 String url = file.read("application.url");
	   if(browser.equalsIgnoreCase("chrome")) {
		   browserUtility.chrome(driver);
	   }else if(browser.equalsIgnoreCase("Firefox")) {
	   browserUtility.fireFox(driver);
	}else {
		   browserUtility.edge(driver);
	}
	   driver.get(url);
	
	}

	@BeforeMethod
	public void beforeMethod() {

	}

	@AfterMethod
	public void afterMethod() {

	}

	@AfterClass
	public void afterClass() {

	}

	@AfterSuite
	public void afterSuite() {

	}

}
