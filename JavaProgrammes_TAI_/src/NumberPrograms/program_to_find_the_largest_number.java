package NumberPrograms;

import java.util.Scanner;

public class program_to_find_the_largest_number {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
				
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if(a>=b && a>=c&& a>=d )
		{
			System.out.println("The greates number is" + a);
		}
		else if(b>=a && b>=c && b>=d)
		{
			System.out.println("The greates number is" + b);
	
		}
		else if(c>=d&& c>=d && c>=a)
		{
			System.out.println("The greates number is" + c);

		}
		else if (d>=a && d>=b && d>=c)
		{
			System.out.println("The greates number is" + d);

		}
		else
			System.out.println("all are equal");

	}

}
