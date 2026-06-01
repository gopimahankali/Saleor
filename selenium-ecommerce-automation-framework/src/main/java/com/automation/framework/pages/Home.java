package com.automation.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;

	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@aria-label='Homepage']")
	WebElement homePage;
	@FindBy(xpath = "//input[@name='search']")
	WebElement search;
	@FindBy(xpath = "//a[text()='All']")
	WebElement all;
	@FindBy(xpath = "//a[text()='Apparel']")
	WebElement apparel;
	@FindBy(xpath = "//a[text()='Accessories']")
	WebElement accessories;
	@FindBy(xpath = "//a[text()='Groceries']")
	WebElement groceries;
	@FindBy(xpath = "//a[contains(@class,'inline-flex h-10 w-10')]")
	WebElement login;
	@FindBy(xpath = "//button[@data-testid='CartNavItem']")
	WebElement cart;

	
	public WebElement getHomePage() {
		return homePage;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getAll() {
		return all;
	}
	public WebElement getApparel() {
		return apparel;
	}
	public WebElement getAccessories() {
		return accessories;
	}
	public WebElement getGroceries() {
		return groceries;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getCart() {
		return cart;
	}

}
