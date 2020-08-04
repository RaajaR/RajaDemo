package Takescrenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotstype1 {
	
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
		TakeScreenshotstype1.takeScreenshot("screenshot1");
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
		TakeScreenshotstype1.takeScreenshot("screenshot2");

	}
	
   @AfterMethod
   
	public void teardown() throws InterruptedException
	{
	   Thread.sleep(2000);
		driver.close();
		
	}
}
