package Stringprogramme;

public class program_to_print_the_given_string_in_reverse {

	public static void main(String[] args) {
	
		String original = "Raaja";
		
		for(int i=original.length()-1;i>=0; i--)
		{
			System.out.print(original.charAt(i));
		}
	}

}
