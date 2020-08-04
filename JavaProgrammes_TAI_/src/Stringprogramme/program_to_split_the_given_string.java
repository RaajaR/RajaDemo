package Stringprogramme;

public class program_to_split_the_given_string {

	public static void main(String[] args) {
		
		/*
		 * While programming, we may need to break a string based on some attributes.
		 * Mostly this attribute will be a separator or a common - with which you want
		 * to break or split the string. split() method splits a String into an array of
		 * substrings given a specific delimiter.
		 * 
		 * Syntax: --public String split(String regex) --public String split(String
		 * regex, int limit) Where: Regex: The regular expression is applied to the
		 * text/string
		 * 
		 * Limit: A limit is a maximum number of values the array. If it is omitted or
		 * zero, it will return all the strings matching a regex.
		 */
		
		
		//String str = "Raaja, Reddy,vanukuri , nuthalapadu,prakasam,Andhra ,India,globe,Earth,Solar System";	
		
		String strMain = "Java, Two, Three, Four, Five";

		  String[] arrSplit = strMain.split(", ");

		  for (int i = 0; i <=arrSplit.length; i++) {

		   System.out.println(arrSplit[i]);

		  }

		 }

}
