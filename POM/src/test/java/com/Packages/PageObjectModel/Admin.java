package com.Packages.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Admin 
{
	WebDriver ldriver;
	public Admin(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Search']/parent::div/parent::div/following-sibling::ul/li[1]")
	WebElement AdminMainModule;
	
	@FindBy(how=How.XPATH,using="//nav[@aria-label='Topbar Menu']/ul/li[2]")
	WebElement Job_MainHeader;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Work Shifts')]")
	WebElement Job_Workshifts;
	
	
	public void setAdminMainModule()
	{
		AdminMainModule.click();
	}
	
	public void setJobmainheader()
	{
		Job_MainHeader.click();
	}
	
	public void setJobworkshift()
	{
		Job_Workshifts.click();
	}
}
