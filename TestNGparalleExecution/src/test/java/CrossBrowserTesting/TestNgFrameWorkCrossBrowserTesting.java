package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgFrameWorkCrossBrowserTesting {
	public WebDriver driver;
	
	//tHIS IS CROSS BROWSER tESWTING
	@Parameters("Browser")
	@Test
	
	public void launchApp(String browser) throws Exception
	{
	if(browser.equalsIgnoreCase("chrome"))	
	{
	       WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();		
	}
	
	else if(browser.equalsIgnoreCase("Firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("IE"))
	{
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
	}
	else
	{
		System.out.println("please check the path)");
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.automationtestinginsider.com/p/java-qa.html");
	Thread.sleep(2000);
	driver.close();
	
	
	}

}
