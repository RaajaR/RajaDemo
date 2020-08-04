package TestNGparallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngParalleTestingmethods {
	public WebDriver driver;
	
   @Test
   
   public void setup()
   {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\OneDrive\\Desktop\\Raja\\SLENIUM FRAMEWORK\\CONFIGURATION FACTORY\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	   driver.get("https://www.automationtestinginsider.com/p/java-qa.html");
	   System.out.println("this is m1  : " + Thread.currentThread().getId());
   }
   
   @Test
   
   public void setup2()
   {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\OneDrive\\Desktop\\Raja\\SLENIUM FRAMEWORK\\CONFIGURATION FACTORY\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("this is m1  : " + Thread.currentThread().getId());
   }
}
