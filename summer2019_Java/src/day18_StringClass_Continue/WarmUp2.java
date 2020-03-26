package day18_StringClass_Continue;

import java.util.Scanner;

public class WarmUp2 {
	/*
	 mUhTaR
	 cYBerTeK
	 
	 output: 
	 Muhtar Cybertek
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	//using substring	
		/*System.out.println("Enter your first name");
		String firstname = scan.nextLine();
		// 		mUhtAr
		String lastname = scan.nextLine();

		firstname = firstname.substring(0,1).toUpperCase()
					+ firstname.substring(1).toLowerCase();
		
		lastname = lastname.substring(0,1).toUpperCase()
				+ lastname.substring(1).toLowerCase();
	
		System.out.println("First and last name is: "+firstname+" "+lastname);
		*/
	//using char
		System.out.println("Enter your first name");
			String firstname = scan.nextLine();
		firstname = (""+firstname.charAt(0)).toUpperCase()
					+ (firstname.substring(1)).toLowerCase();
			
			String lastname = scan.nextLine();
		lastname = (""+lastname.charAt(0)).toUpperCase()
				+ lastname.substring(1).toLowerCase();
		
		System.out.println("First and last name is: "+firstname+" "+lastname);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
