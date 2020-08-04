package DataRead;

import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	 public void readExcelTest() throws Exception {
	  ExcelLibrary obj= new ExcelLibrary();
	  //Call readData method from ExcelLibrary class to get the value of Particular cell
	  String datString=obj.readData("Test", 5, 1);
	  System.out.println("The data is: "+datString);
	 }
	

}
