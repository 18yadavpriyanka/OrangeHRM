package com.Pages;

import org.openqa.selenium.By;

import com.Base.Base;

public class LoginPage extends Base  {
	public String getTitle() {
		return driver.getTitle();
	}

	public boolean getUserNameFieldPresent() {
		return driver.findElement(By.name("username")).isDisplayed();
	}

	public boolean getPasswordFieldPresent() {
		return driver.findElement(By.name("password")).isDisplayed();
	}

	public DashboardPage login() {
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		return new DashboardPage();
	}

}






