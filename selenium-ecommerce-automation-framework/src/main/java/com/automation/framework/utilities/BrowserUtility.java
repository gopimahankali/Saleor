package com.automation.framework.utilities;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtility {
	public void chrome(WebDriver driver) {
		 ChromeOptions options = new ChromeOptions();
		 Map<String, Object> set = new HashMap<>();
			set.put("profile.password_manager_leak_detection", false);
			options.setExperimentalOption("prefs", set);
			// Set browser zoom level
			options.addArguments("--force-device-scale-factor=0.9");
			options.addArguments("--high-dpi-support=0.9");
			driver = new ChromeDriver(options);
	}
	public void edge(WebDriver driver) {
		 driver = new EdgeDriver();
	}
	public void fireFox(WebDriver driver) {
		 driver = new FirefoxDriver();
		
	}

}
