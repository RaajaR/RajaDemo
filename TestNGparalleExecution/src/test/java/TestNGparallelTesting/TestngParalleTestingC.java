package TestNGparallelTesting;

import org.testng.annotations.Test;

public class TestngParalleTestingC {
	
	
	@Test
		public void m3()
		{
	     System.out.println("this is m3 : " + Thread.currentThread().getId());

		}
}
