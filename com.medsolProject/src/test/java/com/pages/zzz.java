package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class zzz extends BaseTest {
	
	public zzz( WebDriver driver)
	{
		this.driver=driver;
	}
	public void payment() throws InterruptedException
	{
		WebElement billing=driver.findElement(By.xpath("//span[contains(text(),'Billings')]"));
		Actions act1=new Actions(driver);
		 act1.moveToElement(billing).click().build().perform();
		 Thread.sleep(3000);
		
		
		WebElement payments=driver.findElement(By.xpath("//a[@class='nav-link p-0 active']"));
		Actions act=new Actions(driver);
		 act.moveToElement(payments).click().build().perform();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@id='dropdownMenuButton']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[normalize-space()='New Payment']")).click();
		 driver.findElement(By.xpath("//span[@id='select2-accountId-container']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("raman");
		 driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath("//input[@id='pay_to']")).sendKeys("xx");
		 driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("00");
		 driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("xx");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='btnPaymentSave']")).click();
		
	}

}
