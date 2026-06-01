package com.automation.framework.utilities;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Waits {
	
	public void implicit(int time) {
		UtilityClassObject.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public void explicit(WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(UtilityClassObject.getDriver(), Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	

}
