package com.Packages.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Packages.PageObjectModel.Login;

public class TC001_ValidLogin extends BaseClass
{
	@Test(description="To validate the Scenario by entering valid Username and Password")
	public void ValidLogin()
	{
		Login lp= new Login(driver);
		
		lp.setUsername(Username);
		lp.setPassword(Password);
		lp.setLoginBtn();
		
		SoftAssert sa= new SoftAssert();
		
		if(driver.findElement(By.xpath("//input[@placeholder='Search']/parent::div/parent::div/following-sibling::ul/li[1]")).getText().equals("Admin"))
		{
			sa.assertTrue(true);
			sa.assertAll();
		}
		else
		{
			sa.assertTrue(false);
			sa.assertAll();
		}
		
	}
	
}
