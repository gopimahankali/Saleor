package com.automation.framework.utilities;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Waits {
	
	public void implicit() {
		UtilityClassObject.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void explicit(WebElement element) {
		WebDriverWait wait = new WebDriverWait(UtilityClassObject.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	

}
