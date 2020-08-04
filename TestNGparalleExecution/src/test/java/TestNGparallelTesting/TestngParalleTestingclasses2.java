package TestNGparallelTesting;

import org.testng.annotations.Test;

public class TestngParalleTestingclasses2 {
	
	@Test
	public void m4()
	{
     System.out.println("this is m4 : " + Thread.currentThread().getId());

	}
	
	public void m44()
	{
     System.out.println("this is m44 : " + Thread.currentThread().getId());

	}
	
	public void m444()
	{
     System.out.println("this is m444 : " + Thread.currentThread().getId());

	}
	
	public void m4444()
	{
     System.out.println("this is m44444 : " + Thread.currentThread().getId());

	}

}
