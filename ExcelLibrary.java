package DataRead;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary {
	
	
	 XSSFWorkbook wb;
	 XSSFSheet sheet;
	 //Below Constructor is to load the excel configuration 
	 public ExcelLibrary() throws Exception {
	  String excelPath="C:\\Users\\USER\\eclipse-workspace\\SeleniumWebDriver\\Configure\\testdata.xlsx";
	  File file= new File(excelPath);
	  FileInputStream fis= new FileInputStream(file);
	  wb= new XSSFWorkbook(fis);
	 }
	 public String readData(String sheetName, int row, int col) {
	  sheet=wb.getSheet(sheetName);
	  String data=sheet.getRow(row).getCell(col).getStringCellValue();
	  return data;
	 }

}
