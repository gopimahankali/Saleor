package com.automation.framework.utilities;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public class UtilityClassObject {
	    // ThreadLocal variable to store ExtentTest object for each thread
		public static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();

		// ThreadLocal variable to store WebDriver object for each thread
		public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
		public static ExtentTest getTest() {

			return test.get();

		}
		public static void setTest(ExtentTest actTest) {

			test.set(actTest);

		}
		public static WebDriver getDriver() {

			return driver.get();

		}
		public static void setDriver(WebDriver actDriver) {

			driver.set(actDriver);

		}

}
