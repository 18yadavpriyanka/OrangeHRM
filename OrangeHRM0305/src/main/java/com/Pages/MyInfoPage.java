package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Base.Base;

public class MyInfoPage extends Base{
	
	public void ContactDetailsispresent() {
		driver.findElement(By.xpath("//a[normalize-space()='Contact Details']")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Contact Details')]")).click();

		
	}
	
	public void street1() {
		Actions act = new Actions(driver);
		WebElement st1=driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[1]//div[1]//div[2]//input[1]"));
		st1.click();
		act.moveToElement(st1).doubleClick(st1).sendKeys(st1, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		st1.sendKeys(prop.getProperty("street1"));
		
	}
	public void street2() {
		Actions act = new Actions(driver);
		WebElement st2=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]"));
		st2.click();
		act.moveToElement(st2).doubleClick(st2).sendKeys(st2, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		st2.sendKeys(prop.getProperty("street2"));
		
	}
	public void city() {
		Actions act = new Actions(driver);
		WebElement ct=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/input[1]"));
		ct.click();
		act.moveToElement(ct).doubleClick(ct).sendKeys(ct, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		ct.sendKeys(prop.getProperty("city"));
		
	}
	public void state() {
		Actions act = new Actions(driver);
		WebElement st=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/input[1]"));
		st.click();
		act.moveToElement(st).doubleClick(st).sendKeys(st, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		st.sendKeys(prop.getProperty("state"));
		
	}	
	public void zipcode() {
		Actions act = new Actions(driver);
		WebElement zc=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[2]/input[1]"));
		zc.click();
		act.moveToElement(zc).doubleClick(zc).sendKeys(zc, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		zc.sendKeys(prop.getProperty("zipcode"));
		
	}	
	
	//country
	public void country() {
		Actions act = new Actions(driver);
		WebElement ct=driver.findElement(By.xpath("//div[contains(text(),'-- Select --')]"));
		ct.click();
		act.moveToElement(ct).doubleClick(ct).sendKeys(ct, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		ct.sendKeys(prop.getProperty("country"));
		
	}
	
	public void home() {
		Actions act = new Actions(driver);
		WebElement hm=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		hm.click();
		act.moveToElement(hm).doubleClick(hm).sendKeys(hm, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		hm.sendKeys(prop.getProperty("home"));
		
	}
	public void mobile() {
		Actions act = new Actions(driver);
		WebElement mb=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]"));
		mb.click();
		act.moveToElement(mb).doubleClick(mb).sendKeys(mb, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		mb.sendKeys(prop.getProperty("mobile"));
		
	}
	public void work() {
		Actions act = new Actions(driver);
		WebElement wk=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[2]/input[1]"));
		wk.click();
		act.moveToElement(wk).doubleClick(wk).sendKeys(wk, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		wk.sendKeys(prop.getProperty("work"));
		
	}
	public void workemail() {
		Actions act = new Actions(driver);
		WebElement wkemail=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		wkemail.click();
		act.moveToElement(wkemail).doubleClick(wkemail).sendKeys(wkemail, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		wkemail.sendKeys(prop.getProperty("workemail"));
		
	}
	public void otheremail() {
		Actions act = new Actions(driver);
		WebElement otemail=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/input[1]"));
		otemail.click();
		act.moveToElement(otemail).doubleClick(otemail).sendKeys(otemail, Keys.CONTROL,"a",Keys.BACK_SPACE)
		.build().perform();
		otemail.sendKeys(prop.getProperty("otheremail"));
		
	}
	
	public void save() {
	
		WebElement s=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]"));
		s.click();
			
	}
	public void addattachment() {
		Actions act = new Actions(driver);
		WebElement add=driver.findElement(By.xpath("//button[normalize-space()='Add']"));
		act.moveToElement(add).click().build().perform();
			
	}
	public void browseattachment() {
	
		WebElement browse=driver.findElement(By.xpath("//div[@class='oxd-file-button']"));
		browse.sendKeys(prop.getProperty("browsefile"));
			
	}
	
	public void saveattachment() {
		Actions act = new Actions(driver);
		WebElement saveat=driver.findElement(By.xpath("//div[@class='orangehrm-attachment']//button[@type='submit'][normalize-space()='Save']"));
		act.moveToElement(saveat).click().build().perform();
		
	}
	public void cancelattachment() {
		Actions act = new Actions(driver);
		WebElement can=driver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
		act.moveToElement(can).click().build().perform();
		
	}
	
	}