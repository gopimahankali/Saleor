package com.automation.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class represents the login page of the e-commerce application.
 * PageFactory is used to initialize WebElements.
 *
 * Improves: - Code reusability - Maintainability - Readability
 *
 * @author Mahan
 */

public class loginPage {
	WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Sign up']")
	WebElement signUpLink;
	@FindBy(id = "email")
	WebElement email;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement login;

	
	public WebElement getSignUpLink() {
		return signUpLink;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}

}
