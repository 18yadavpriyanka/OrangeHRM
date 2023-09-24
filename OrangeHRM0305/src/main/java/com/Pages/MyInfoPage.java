package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.Base.Base;

public class MyInfoPage extends Base{


	@FindBy(xpath="//a[text()='Contact Details']") WebElement contactPage;
	@FindBy(xpath="(//div[@class='oxd-input-group oxd-input-field-bottom-space']//input)[1]") WebElement street1;
	@FindBy(xpath="(//div[@class='oxd-input-group oxd-input-field-bottom-space']//input)[2]") WebElement street2;
	@FindBy(xpath="(//div[@class='oxd-input-group oxd-input-field-bottom-space']//input)[3]") WebElement city;
	@FindBy(xpath="(//div[@class='oxd-input-group oxd-input-field-bottom-space']//input)[4]") WebElement state;
	@FindBy(xpath="(//div[@class='oxd-input-group oxd-input-field-bottom-space']//input)[5]") WebElement postalCode;
	@FindBy(className = "oxd-select-text-input")
	

	
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
	@FindBy(xpath="(//div[@class='oxd-input-group oxd-input-field-bottom-space']//input)[8]") WebElement workno;
	@FindBy(xpath="(//div[@class='oxd-input-group oxd-input-field-bottom-space']//input)[9]") WebElement workemail;
	@FindBy(xpath="(//div[@class='oxd-input-group oxd-input-field-bottom-space']//input)[10]") WebElement otherEmail;
	
	
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
