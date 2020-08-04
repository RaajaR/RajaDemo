package OrangeHRM_Login_ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_ParallelExecution {
	public WebDriver driver;
	
	@Parameters("Browser")
	@Test
	
	public void launchBrowser(String browser) 
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			 WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

		}
		else if(browser.equalsIgnoreCase("firefox"))
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
			System.out.println("please check the browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	
	@Test 
	
	public void login()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		System.out.println("username entered");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		System.out.println("clicked on password");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("clicked on submit");
	}
	
	@Test 
	
	public void Admin()
	{
	
		driver.findElement(By.xpath(" //*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
	 }
	  
	  @AfterClass
	  
	  public void teardon() throws InterruptedException
	  {
		  Thread.sleep(3000);
		  driver.close();
		  System.out.println("driver is closed");
	  }
	  
	  
	  
}
