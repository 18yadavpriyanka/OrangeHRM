package com.Pages;

import org.openqa.selenium.By;

import com.Base.Base;

public class DashboardPage extends Base {
//		public boolean getTimeWorkSectionPresent() {
//			return driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
//		}
//		
	public MyInfoPage getMyInfoPage() {
		driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
	return new MyInfoPage();
	}
	
	}



	

