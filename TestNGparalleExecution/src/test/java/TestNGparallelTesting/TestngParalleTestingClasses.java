package TestNGparallelTesting;

import org.testng.annotations.Test;

public class TestngParalleTestingClasses {

	
	@Test
	public void m2()
	{
     System.out.println("this is m2 : " + Thread.currentThread().getId());

	}
}
