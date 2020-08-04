package RunfailedTestcases;


import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.AfterTest;

public class FailedtestcaseRunner {
	
	@AfterTest
	public void runfailedtestcase()
	{
		TestNG obj = new TestNG();
		List<String> list= new ArrayList<>();
		list.add("C:\\Users\\USER\\eclipse-workspace\\TestNGparalleExecution\\test-output\\testng-failed.xml");
		obj.setTestSuites(list);
		obj.run();
		
	}

}
