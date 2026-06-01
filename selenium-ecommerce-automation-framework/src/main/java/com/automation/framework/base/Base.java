package com.automation.framework.base;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.automation.framework.pages.Create_an_Account;
import com.automation.framework.pages.Home;
import com.automation.framework.pages.loginPage;
import com.automation.framework.utilities.Excel;
import com.automation.framework.utilities.PropertyFile;
import com.automation.framework.utilities.UtilityClassObject;
import com.automation.framework.utilities.Waits;

public class Base {

	protected WebDriver driver = null;
	protected PropertyFile file = new PropertyFile();
	public Waits waits = new Waits();
	public Excel excel = new Excel();
	protected Create_an_Account caa;
	protected Home home;
	protected loginPage lp;

	@BeforeSuite
	public void beforeSuite() {

	}

	@BeforeClass
	public void beforeClass() throws Exception {

		String browser = file.read("browser");
		String url = file.read("application.url");

		if (browser.equalsIgnoreCase("Chrome")) {
			ChromeOptions options = new ChromeOptions();

			Map<String, Object> map = new HashMap<>();
			map.put("profile.password_manager_leak_detection", false);

			options.setExperimentalOption("prefs", map);

			options.addArguments("--force-device-scale-factor=1.0");
			options.addArguments("--high-dpi-support=1.0");

			driver = new ChromeDriver(options);

		} else if (browser.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();

		} else {

			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		UtilityClassObject.setDriver(driver);
		caa = new Create_an_Account(UtilityClassObject.getDriver());
		home = new Home(UtilityClassObject.getDriver());
		lp = new loginPage(UtilityClassObject.getDriver());
	}

	@BeforeMethod
	public void beforeMethod() throws Exception {
		home.getLogin().click();
		lp.getEmail().sendKeys(file.read("valid.username"));
		lp.getPassword().sendKeys(file.read("valid.password"));
		lp.getLogin().click();

	}

	@AfterMethod
	public void afterMethod() {
		
	
	}

	@AfterClass
	public void afterClass() {
		UtilityClassObject.getDriver().quit();
	}

	@AfterSuite
	public void afterSuite() {

	}

}
