package com.TC;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.DashboardPage;
import com.Pages.LoginPage;


public class DashboardPageTest{
	LoginPage lp;
	DashboardPage dp;


	@BeforeMethod
	public void browserSetup() {
		lp = new LoginPage();
		lp.initialization();
	}
//
//	@Test
//	public void validateTimeWorkSectionPresent() {
//		dp = lp.login();
//		Assert.assertTrue(dp.getTimeWorkSectionPresent());
//	}

	public void validateMyInfoispresent() {
		dp = lp.login();
		
	}
	@AfterMethod
	public void closeSetup() {
		lp.tearDown();
	}
}


