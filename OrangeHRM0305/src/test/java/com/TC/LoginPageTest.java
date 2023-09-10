package com.TC;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.LoginPage;
import com.Pages.DashboardPage;


public class LoginPageTest {
	LoginPage lp;
	DashboardPage dpj;

	@BeforeMethod
	public void browserSetup() {
		lp = new LoginPage();
		lp.initialization();
	}

	@Test
	public void validateTitleTest() {
		String expTitle = "OrangeHRM";
		String actTitle = lp.getTitle();
		Assert.assertEquals(actTitle, expTitle);
	}

	@Test
	public void validateUserNameFieldPresent() {
		Assert.assertTrue(lp.getUserNameFieldPresent());
	}

	@Test
	public void validatePasswordFieldPresent() {
		Assert.assertTrue(lp.getPasswordFieldPresent());
	}

//	@Test
//	public void validateLogin() {
//		dp = lp.login();
//		Assert.assertTrue(dp.getTimeWorkSectionPresent());
//	}

	@AfterMethod
	public void closeBrowserSetup() {
		lp.tearDown();
	}

}




