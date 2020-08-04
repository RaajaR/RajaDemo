package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import confiiguration.StartBrowser;

public class ActionDriver {
	
	WebDriver driver;
	
	public ActionDriver()
	{
		driver= StartBrowser.driver;
	}
	
	
	public void navigatetoApplication(String url)
	{
		
        driver.get(url);
	}
	
	public void click(By locator)
	{
		
		driver.findElement(locator).click();
	}
	
	public void type(By locator ,String text)
	{
		
		driver.findElement(locator).sendKeys(text);
	}
}