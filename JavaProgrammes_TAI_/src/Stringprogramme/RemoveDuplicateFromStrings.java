package Stringprogramme;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromStrings {
	
	static String remove(String str) {
		
		
		char[] chararray = str.toCharArray();
		Set<Character> charset = new LinkedHashSet<Character>();
		for(char ch: chararray)
		{
			charset.add(ch);
		}
		StringBuilder sb = new StringBuilder();
		for (char c : charset)
		{
			sb.append(c);
		}
		
		
		return sb.toString() ;
		
		
	}

	public static void main(String[] args) {
   
		String a ="Rajasekhara reddy vanukuri";
		System.out.println(remove(a));


	}

}
