package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Config.StartBrowser;
import ObjectRepositary.Loginpage;
import commands.ActionsDriver;

public class TC01_Login extends StartBrowser {
  @Test
  public void LoginPage() throws IOException {
	  
	  ActionsDriver aDriver = new ActionsDriver();
	  aDriver.navigateToApplication("https://opensource-demo.orangehrmlive.com/");
	  aDriver.EnterCredential(Loginpage.textuser, "Admin","username");
	  aDriver.EnterCredential(Loginpage.textpassword, "admin123","password");
	  aDriver.Click(Loginpage.textlogin,"Submitbutton");
	  
	  
	   
  }
}
