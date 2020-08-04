package com.utility.Package;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Browserfactory.Package.Baseclass;

public class listenercalss  extends Baseclass implements ITestListener {
	// Listeenrs only 
	
   public void onTestStart(ITestResult result)	
   {
	   
   }
	
   public void onTestSuccess(ITestResult result)	
   {
	   
   }
	
   public void onTestFailure(ITestResult result)	
   {
	   try {
		takeScreenshot(result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
	
   public void onTestSkipped(ITestResult result)	
   {
	   
   }
}
