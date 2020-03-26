package day22_NestedLoop;

import java.util.Scanner;

public class WarmUp2 {

	
		/*
	    2. write a program that can check if the String is plaindrome. if it's print "true", 
	    	otherwise print "false"    DO NOT USE FOR LOOP
	        Ex: input: level
	            output: true,  (because reversed value is still "level")
		 */
		public static void main(String[] args) {
				/*
				 org 	==> 	rev
				 abba 	==> 	abba	==> palindrome
				 level	==>		level	==> palindrome
				 
				 */
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter somesing boi");
			String original = scan.nextLine();
			//		index:	  0123456		
			
			original = original.trim();
			
			//		rev index:    6543210
			String reverse =""; //gfedcba
				/*
				for(int i = original.length()-1; i>=0; i--) {
					reverse +=original.substring(i, i+1);
				}
				*/
			
			int i = original.length()-1;
			while( i>=0 ) {
				reverse +=original.substring(i, i+1);
				i--;
			}
			
			
				System.out.println("palindrome?");
				boolean result = original.equalsIgnoreCase(reverse) ? true: false;
				System.out.println(result);
				
				
				
				
				
				
				
				
				
				
				
				
	}
}
