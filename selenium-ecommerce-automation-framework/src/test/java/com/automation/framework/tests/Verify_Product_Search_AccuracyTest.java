package com.automation.framework.tests;

import org.testng.annotations.Test;

import com.automation.framework.base.Base;

public class Verify_Product_Search_AccuracyTest extends Base{
	@Test
	public void accuracy() {
		waits.implicit(10);
		home.getSearch().sendKeys("Shirt");
		home.getSearch().submit();
		
		
		
		
	}

}
