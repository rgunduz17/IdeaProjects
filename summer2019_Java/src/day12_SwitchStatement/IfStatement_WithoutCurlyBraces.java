package day12_SwitchStatement;

public class IfStatement_WithoutCurlyBraces {

	public static void main(String[] args) {
		
		if (true) {
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
		}else {
			System.out.println("World");
		}
		System.out.println("========\n\n");
		
		//without curly brace a single line of statement
		if (true)
			System.out.println("Hello");
			//System.out.println("Hello");
			// without curly brace only hold one statement
		else
			System.out.println("World");
		
		
		if (true) {
			if(true) {
				System.out.println("Hello World");
			}else {
				System.out.println("Hello Cybertek");
			}
		}
		else {
			System.out.println("Invalid");
		}
		
		System.out.println("=========================");
		
		if (true)
			if(true)
				System.out.println("Hello World");
			else
				System.out.println("Hello Cybertek");
		else
			System.out.println("Invalid");
		
		
		
		// multi-branch if:
		int grade = 80;
			if(grade <=100&&grade>=0) {
				if(grade>=90) {
					System.out.println("A");
				} else if(grade >=80) {
					System.out.println("B");
				}else if(grade>=70) {
					System.out.println("C");
				}	
		}
		
		System.out.println("=============");
		if(grade <=100&&grade>=0)
			if(grade>=90) 
				System.out.println("A");
			 else if(grade >=80) 
				 System.out.println("B");
			 else if(grade>=70) 
				 System.out.println("C");
			 else 
				 System.out.println(); // this else statement belongs to else of statements
		else 
			System.out.println("Invalid"); // this else statement belongs to precondition
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
