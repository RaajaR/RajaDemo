package commands;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;

import Config.StartBrowser;

public class ActionsDriver {
	
	WebDriver driver;
	
	public ActionsDriver()
	{
		driver = StartBrowser.driver;
	}
	
	public void navigateToApplication(String URL)
	{
	try {
		
		driver.get(URL);
		StartBrowser.childTest.pass("Succesfully navigated to : " + URL);
	}
	
	catch (Exception e)
	{
		StartBrowser.childTest.fail("Unable to navigate to : " + URL);
	}
	}
	
	
	public String  screenShot()
	{
		return((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		
	}
	
	
	public void EnterCredential(By locator,String text,String element ) throws IOException
	
	{ 
	try
	{
		driver.findElement(locator).sendKeys(text);
		StartBrowser.childTest.pass("Succesfully Entered  on : " + element + "With data" + text);
	}
	catch(Exception e)
	{
		StartBrowser.childTest.pass("Unable to  Entered  on : " + element + "with data" + text,MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
		StartBrowser.childTest.info(e);
		throw e;
		
	}
	
	}
	
	public void Click(By locator, String element) throws IOException
	{
		try {
		driver.findElement(locator).click();
		StartBrowser.childTest.pass("Succesfully clicked on : " + element  );
	}
	
	  catch(Exception e)
		{
		  StartBrowser.childTest.fail("Unable to  clicked on : " + element,MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build()); 
		  StartBrowser.childTest.info(e);
		  throw e;
		 
		}
	}
	
	
	

}
