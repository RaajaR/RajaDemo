package Stringprogramme;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
	
	
	static String removeduplicates(String str)
	{
		char[] chararr = str.toCharArray();
		Set<Character> charset = new LinkedHashSet<Character>(); 
		for(char ch:chararr)
		{
			charset.add(ch);
		}
		StringBuffer sb = new StringBuffer();
		for(char c : charset)
		{
			sb.append(c);
		}
		return sb.toString();
		
	}
 
	public static void main(String[] args) {
		
		String strrrr = "aabbccddeeff";
		System.out.println(removeduplicates(strrrr));

		
	}

}
