package NumberPrograms;

import java.util.Scanner;

public class Java_program_to_print_the_entered_number_in_reverse {

	public static void main(String[] args) {
		
		System.out.println("please enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int reverse=0;
		
		while(a !=0 )
		{
			reverse = reverse * 10;
			reverse= reverse + a%10;
			a=a/10;
		}
		System.out.println("reverse of a number"  + reverse);
		

	}

}
