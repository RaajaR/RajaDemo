package Stringprogramme;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
		
		// Format y-M-d or yyyy-MM-dd
		
		String date = "2020-07-26";
		
		LocalDate  local = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
		System.out.println(local);
		
		String string2="31/12/1998";
	    Date   local1 = new SimpleDateFormat("dd/MM/yy").parse(string2);
	    System.out.println(string2 + "\t" +  local1 );
	    
	    String str3 = "04/06/2020";
	    Date   local11 = new SimpleDateFormat("dd/MM/y").parse(str3);
	    System.out.println(str3  );
	    System.out.println(str3 +  "\t " + local11 );
		
	}

}
