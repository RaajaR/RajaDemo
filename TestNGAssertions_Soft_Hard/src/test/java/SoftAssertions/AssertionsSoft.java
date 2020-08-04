package SoftAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsSoft {

	SoftAssert obj = new SoftAssert();
	
	@Test
	
	public void testcase1()
	{
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("test1 start");
		obj.assertTrue(true);
		obj.assertEquals("HELLO", "HELLO");		
		System.out.println("test2 end");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		obj.assertAll();

	}

	    @Test 
        public void testcase2()
        
	   {
	    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("test2start");
		obj.assertEquals("HELLO", "hello");		
		obj.assertTrue(false);
		System.out.println("test2 end");
	    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		obj.assertAll();


	}
}
