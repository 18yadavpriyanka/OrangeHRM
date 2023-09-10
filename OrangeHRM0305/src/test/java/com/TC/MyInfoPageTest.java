package com.TC;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.DashboardPage;
import com.Pages.LoginPage;
import com.Pages.MyInfoPage;

public class MyInfoPageTest {
LoginPage lp;
DashboardPage dp;
MyInfoPage mip;


	@BeforeMethod
	public void browserSetup() {
		lp = new LoginPage();
		lp.initialization();	
}
	@Test
	public void MyInfoPage () {
		dp = lp.login();
		mip = dp.getMyInfoPage();
		
	}
	@Test
	public void ContactDetailsisPresent() {
		dp= lp.login();
		mip=dp.getMyInfoPage();
        mip.ContactDetailsispresent();
		
	}
	@Test
	public void street1() {
		dp = lp.login();
		mip = dp.getMyInfoPage();
        mip.ContactDetailsispresent();

		mip.street1();
	}

@Test
public void street2() {
	dp = lp.login();
	mip = dp.getMyInfoPage();
	 mip.ContactDetailsispresent();
	mip.street2();
}	
@Test
public void city() {
	dp = lp.login();
	mip = dp.getMyInfoPage();
	mip.ContactDetailsispresent();
	mip.city();
}
@Test
public void state() {
	dp = lp.login();
	mip = dp.getMyInfoPage();
	mip.ContactDetailsispresent();
	mip.state();
}
@Test
public void home() {
	dp = lp.login();
	mip = dp.getMyInfoPage();
	mip.ContactDetailsispresent();
	mip.home();
}
//country
@Test
public void country() {
	dp = lp.login();
	mip = dp.getMyInfoPage();
	mip.ContactDetailsispresent();
	mip.country();
}

@Test
public void mobile() {
	dp = lp.login();
	mip = dp.getMyInfoPage();
	mip.ContactDetailsispresent();
	mip.mobile();
}

@Test
public void work() {
	dp = lp.login();
	mip = dp.getMyInfoPage();
	mip.ContactDetailsispresent();
	mip.work();
}

@Test
public void workemail() {
	dp = lp.login();
	mip = dp.getMyInfoPage();
	mip.ContactDetailsispresent();
	mip.workemail();
}
@Test
public void otheremail() {
	dp = lp.login();
	mip = dp.getMyInfoPage();
	mip.ContactDetailsispresent();
	mip.otheremail();
}
@Test
public void save() {
	dp = lp.login();
	mip = dp.getMyInfoPage();
	mip.ContactDetailsispresent();
	mip.save();
}
@Test
public void addattachment() {
	dp = lp.login();
	mip = dp.getMyInfoPage();
	mip.ContactDetailsispresent();
	mip.addattachment();
	mip.browseattachment();
	mip.saveattachment();
	mip.cancelattachment();
}
}

