package com.Browserfactory.Package;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
public static  WebDriver driver;
	
    @BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
	}
	
	

	   
		
		
		public static void takeScreenshot(String filename) throws IOException
		{    
			
			TakesScreenshot take = (TakesScreenshot) driver;
			File source=take.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(System.getProperty("user.dir")+ "\\Screenshots\\" +filename + ".png" ));
		}

		 @AfterMethod
		   public void teardown() throws InterruptedException
			{
			   Thread.sleep(2000);
				driver.close();
				
			}
		
}
