package com.test.Package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Browserfactory.Package.Baseclass;

public class Screenshotstake extends Baseclass {
	

	//Team commit 
   @Test
	
	public void webpagesearchAA() throws IOException
	{		
	  
	  //setup();
	
		driver.findElement(By.name("q")).sendKeys("ys jagan");
	//	TakeScreenshotstype1.takeScreenshot("screenshot2");
          Assert.assertTrue(false);
	}

   
   @Test
	
  	public void webpagesearchBB() throws IOException
  	{		
  	  
  	  // setup();
  	
  		driver.findElement(By.name("q")).sendKeys("ys rajasekhara reddy");
  		//TakeScreenshotstype1.takeScreenshot("screenshot2");
        Assert.assertTrue(false);


  	}

   @Test
	
 	public void webpagesearchCC() throws IOException
 	{		
 	  
 	  // setup();
 	
 		driver.findElement(By.name("q")).sendKeys("ys rajasekhara reddy");
 		//TakeScreenshotstype1.takeScreenshot("screenshot2");
       Assert.assertTrue(true);


 	}

}
