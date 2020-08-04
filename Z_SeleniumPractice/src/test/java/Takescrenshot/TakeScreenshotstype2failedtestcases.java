package Takescrenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotstype2failedtestcases {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
	}

	@Test
	
	public void webpagesearch1() throws IOException
	{
		// setup();
		
		driver.findElement(By.name("q")).sendKeys("ys jagan");
		//TakeScreenshotstype2failedtestcases.takeScreenshot("screenshot1");
		Assert.assertTrue(false);

	}
	
	
	
	public static void takeScreenshot(String filename) throws IOException
	{    
		
		TakesScreenshot take = (TakesScreenshot) driver;
		File source=take.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(System.getProperty("user.dir")+ "\\Screenshots\\" +filename + ".png" ));
	}
	
@Test
	
	public void webpagesearch2() throws IOException
	{		
	  
	  // setup();
	
		driver.findElement(By.name("q")).sendKeys("ys jagan");
		//TakeScreenshotstype2failedtestcases.takeScreenshot("screenshot2");
		Assert.assertTrue(false);

	}
	
   @AfterMethod
   
	public void teardown(ITestResult result) throws InterruptedException, IOException
	{
	   if(result.FAILURE==result.getStatus())
	   {
		   TakeScreenshotstype2failedtestcases.takeScreenshot(result.getName());
	   }
	   Thread.sleep(2000);
		driver.close();
		
	}
}
