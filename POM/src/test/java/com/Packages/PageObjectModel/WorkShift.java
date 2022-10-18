package com.Packages.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WorkShift 
{
	WebDriver ldriver;
	public WorkShift(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//i[@class='oxd-icon bi-plus oxd-button-icon']/parent::button")
	WebElement Job_Workshifts_AddBtn;
	
	@FindBy(how=How.XPATH,using="//label[contains(text(),'Shift Name')]/parent::div/following-sibling::div/input")
	WebElement txtshiftname;
	
	@FindBy(how=How.XPATH,using="//label[contains(text(),'From')]/parent::div/following-sibling::div/div/div/input")
	WebElement txtfrom;
	
	@FindBy(how=How.XPATH,using="//label[contains(text(),'To')]/parent::div/following-sibling::div/div/div/input")
	WebElement txtto;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']/preceding-sibling::button")
	WebElement Cancelbtn;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	WebElement Savebtn;
	
	
	public void setAddbutton()
	{
		Job_Workshifts_AddBtn.click();
	}
	
	public void setshiftname(String shift)
	{
		txtshiftname.sendKeys(shift);
	}
	
	public void setfromdate(String fromdate)
	{
		txtfrom.clear();
		txtfrom.sendKeys(fromdate);
	}
	
	public void settodate(String todate)
	{
		txtto.clear();
		txtto.sendKeys(todate);
	}
	
	public void setCancelBtn()
	{
		Cancelbtn.click();
	}
	
	public void setSaveBtn()
	{
		Savebtn.click();
	}
	
	
	
	
	

}
