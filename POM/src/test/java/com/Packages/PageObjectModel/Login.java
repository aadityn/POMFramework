package com.Packages.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	WebDriver ldriver;
	public Login(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="//input[@name='username']")
	WebElement txtusername; 
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement txtpassword; 
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement LoginBtn; 
	
	public void setUsername(String uname)
	{
		txtusername.sendKeys(uname);
	}
	
	public void setPassword(String pass)
	{
		txtpassword.sendKeys(pass);
	}
	
	public void setLoginBtn()
	{
		LoginBtn.click();
	}
	
}
