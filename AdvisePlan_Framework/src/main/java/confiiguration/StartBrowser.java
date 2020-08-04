package confiiguration;



import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

    public class StartBrowser {
	
	
	public static WebDriver driver;
	
	
	
  @BeforeClass
 
  public void beforeClass() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	  
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  
	  //Thread.sleep(35);
	//  driver.quit();
  }

}
