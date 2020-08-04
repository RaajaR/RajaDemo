package HardAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

	
	@Test
	
	public void testcase1()
	{
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("test1 start");
		Assert.assertTrue(false);
		System.out.println("test2 end");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		

	}

	    @Test 
        public void testcase2()
        
	   {
	    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("test2start");
		Assert.assertTrue(true);
		System.out.println("test2 end");
	    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		

	}
}
