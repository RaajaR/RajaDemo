package Scripts;

import org.testng.annotations.Test;

import Commands.ActionDriver;
import TiA_Diff.AdvisePlan_Framework.LoginPage;
import confiiguration.StartBrowser;


public class Tc01  extends StartBrowser {
 
	
	@Test
  
  
 
	public void login()  {
		
		
		ActionDriver aDriver = new ActionDriver();
		aDriver.navigatetoApplication("http://localhost/product/login.php");
		aDriver.type(LoginPage.usernam, "raja123@gmail.com");
		aDriver.type(LoginPage.password, "raja123");
		aDriver.click(LoginPage.clickLogin);		
  }
}

