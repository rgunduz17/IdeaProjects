package day14__Scanner;

		import java.util.Scanner;
// 		everything in scanner class is imported
//		import java.util.*;
// 		this imports all the class form Java.util package


public class ScannerClass {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//declaration of scanner
		System.out.println("Enter a Byte Value");
		byte byteNum = input.nextByte();
		// only allows user to enter byte value
				
				System.out.println("You have entered: "+byteNum);
				
				System.out.println("Enter a Byte Value 2");
				byte byteNum2 =	input.nextByte();
				
				System.out.println("You have entered: "+byteNum2);
		
				System.out.println("Addition is : "+(byteNum+ byteNum2) );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
