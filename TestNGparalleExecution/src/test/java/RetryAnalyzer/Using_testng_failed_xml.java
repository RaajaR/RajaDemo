package RetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Using_testng_failed_xml {
	
	@Test(retryAnalyzer= retryAnalyzerInterface.class)
	public void runfailedtestcase1()
	{
		System.out.println("this is our testcase1");
		Assert.assertTrue(false);
	}
	@Test(retryAnalyzer= retryAnalyzerInterface.class)
	public void runfailedtestcase2()
	{
		System.out.println("this is our testcase1");
		Assert.assertTrue(false);
	}

}
