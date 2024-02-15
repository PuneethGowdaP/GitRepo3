package com.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.BaseTest;
import com.pages.Page_login;
import com.pages.zzz;

public class TC_login extends BaseTest{
	  
	BaseTest base=new BaseTest();
	
	@BeforeTest
	public void url_launch() throws IOException
	{
		base.setup();
	}
	
	@Test(priority = 1)
	public void loginTest()
	{
		Page_login log=new Page_login(base.getdriver());
		log.loginTest();
	}
	@Test(priority = 2)
	public void bill() throws InterruptedException
	{
		zzz z=new zzz(driver);
		z.payment();
	}
	
	//@AfterTest
	public void url_close()
	{
		base.teardown();
	}

}
