package TestNGparallelTesting;

import org.testng.annotations.Test;

public class TestngParalleTestingIndependent {
	
	
	@Test(threadPoolSize = 15,invocationCount = 13,timeOut = 3000)
	
	public void independentmethod()
	{
		System.out.println("this is the indpeendent method" + Thread.currentThread().getId());
	}

}
