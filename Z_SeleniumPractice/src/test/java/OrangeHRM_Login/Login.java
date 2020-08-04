package OrangeHRM_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public WebDriver driver;
	
	@BeforeClass
	
	public void Setup()
	{
         WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\OneDrive\\Desktop\\Raja\\SLENIUM FRAMEWORK\\CONFIGURATION FACTORY\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("browser is launched");
	}

	@Test (dataProvider = "Test")
	public void loginApp(String UN,String PW) 
	{
		driver.findElement(By.id("txtUsername")).sendKeys(UN);
		System.out.println("username entered");
		driver.findElement(By.id("txtPassword")).sendKeys(PW);
		System.out.println("clicked on password");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("clicked on submit");
	}
	
	
	/*
	 * @Test public void logout() throws InterruptedException {
	 * driver.findElement(By.linkText("Welcome Admin")).click();
	 * System.out.println("clicked on Admin button");
	 * driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
	 * Thread.sleep(3000); System.out.println("clicked on logout button");
	 * 
	 * 
	 * 
	 * }
	 */
	  
	  @AfterClass
	  
	  public void teardon() throws InterruptedException
	  {
		  Thread.sleep(3000);
		  driver.close();
		  System.out.println("driver is closed");
	  }
	  
	  
	  @DataProvider(name="Test")
	  
	  public static Object [][]logindata()
	  {
		return new Object[][] {{"username1","password1"},{"username2","password2"},{"username3","password3"},{"1234","123456789"}};
		  
	  }
}
