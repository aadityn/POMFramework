package com.Packages.TestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
		public static WebDriver driver;
		public String BaseURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		public static String Username="Admin";
		public static String Password="admin123";
	
		@Parameters("browser")
		@BeforeClass(description="The browser which you select from TestNG will be selected here")
		public void setup(String BrowserName)
		{
			if(BrowserName.equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
			}
			else if(BrowserName.equals("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
			}
			else if(BrowserName.equals("edge"))
			{
				WebDriverManager.edgedriver().setup();
			}
			else
			{
				System.out.println("Please do select any valid browser");
			}
			
			driver.manage().window().maximize();
			driver.get(BaseURL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
		@AfterClass
		public void Teardown()
		{
			driver.quit();
		}
}
