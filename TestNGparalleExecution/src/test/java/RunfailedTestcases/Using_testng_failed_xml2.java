package RunfailedTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Using_testng_failed_xml2 {
	
	

	@Test
	public void runfailedtestcase3()
	{
		System.out.println("this is our testcase1");
		Assert.assertTrue(true);
	}
	@Test
	public void runfailedtestcase4()
	{
		System.out.println("this is our testcase1");
		Assert.assertTrue(false);
	}
}
