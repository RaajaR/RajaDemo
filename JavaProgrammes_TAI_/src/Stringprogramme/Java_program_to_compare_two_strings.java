package Stringprogramme;

public class Java_program_to_compare_two_strings {
	
	// To compare two Strings We require comparto() method
	public static String Str1 = "RAJA.v";
	public static String Str2 = "REDDY.vvv";

	public static void main(String[] args) {
		
		if(Str1.equals(Str2))
		{
			System.out.println("then Both the Strings are Equal");
		}
		else
		{
			System.out.println("Both the Strings are not  Equal");
		}
		
		if(Str1.equalsIgnoreCase(Str2)) 
		{
			System.out.println(" but both the Strings are equals");
		}
		else
		{
			System.out.println("both the Strings are not  equals '  ' ' ' ' ' ");
			
		}
	   if(Str2==Str1)
	
	    {
		     System.out.println("Bothy the Strings are equal");
	    }
	   else
	   {
		     System.out.println("Bothy the Strings are  not equal");
	   }
	   
	   System.out.println(Str1.compareTo(Str2));
	   System.out.println(Str2.compareTo(Str1));

	}

}
