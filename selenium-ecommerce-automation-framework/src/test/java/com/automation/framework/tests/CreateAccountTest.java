package com.automation.framework.tests;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.framework.base.Base;
import com.automation.framework.utilities.UtilityClassObject;




public class CreateAccountTest extends Base  {
	
	@DataProvider(name = "userData")
	public Object[][] userData() throws Exception {
		int row = excel.getRow("./testdata/UserData.xlsx", "Sheet1");
		int cell = excel.getCel("./testdata/UserData.xlsx", "Sheet1");
		Sheet sh = excel.getSheet("./testdata/UserData.xlsx", "Sheet1");
		Object[][] data = new Object[row-1][cell];
		for(int i =1; i<row; i++) {
			for(int j=0; j<=cell-1; j++) {
				data[i-1][j]= sh.getRow(i).getCell(j).toString();
			}
		}
		return data;
		
		
	}
	@Test(dataProvider = "userData")
	public void Create(String firstName, String lastName, String email, String password, String confirmPassword) throws Exception {
		waits.implicit();
		home.getLogin().click();
		waits.explicit(lp.getSignUpLink());
		lp.getSignUpLink().click();
		waits.explicit(caa.getFirstName());
		caa.getFirstName().sendKeys(firstName);
		caa.getLastName().sendKeys(lastName);
		caa.getEmail().sendKeys(email);
		caa.getPassword().sendKeys(password);
		caa.getConfirmPassword().sendKeys(confirmPassword);
		caa.getCreateAccount().click();
		UtilityClassObject.getDriver().navigate().refresh();
		home.getHomePage().click();
	}

}
