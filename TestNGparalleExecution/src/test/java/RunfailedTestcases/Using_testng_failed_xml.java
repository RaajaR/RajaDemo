package RunfailedTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Using_testng_failed_xml {
	
	@Test
	public void runfailedtestcase1()
	{
		System.out.println("this is our testcase1");
		Assert.assertTrue(false);
	}
	@Test
	public void runfailedtestcase2()
	{
		System.out.println("this is our testcase2");
		Assert.assertTrue(false);
	}

}
