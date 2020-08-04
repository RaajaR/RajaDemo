package NumberPrograms;

public class swaptwonumbers_withoutusing_thirdvariable {

	public static void main(String[] args) {
		
		float f1=1.10f;
		float f2=2.45f;
		
		System.out.println("Before Swap is " + f1);
		System.out.println("After Swap is" + f2);
		
		f1= f1-f2;
		f2 = f1+f2;
		f1= f2-f1;
		System.out.println("After swap " + f1);
		System.out.println("After swap" + f2);
	}

}
