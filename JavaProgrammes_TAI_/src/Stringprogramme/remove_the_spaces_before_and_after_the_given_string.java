package Stringprogramme;

public class remove_the_spaces_before_and_after_the_given_string {

	public static void main(String[] args) {
		
	String str = "     Blank Space       ";
	
	
	String blank = str.trim();
	String blank1 = blank.replaceAll("\\s", "");
	System.out.println(blank1);
		
		
		
	}

}
