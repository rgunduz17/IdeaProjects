package day12_SwitchStatement;

public class SwitchStatement {

	/*
	 switch statement does similar thing as multi branch if statement
	 
	 		switch(expression){
	 			case CaseValue:
	 					statements1
	 					statements2
	 			default:				
	 					statement
	 		}
	 
	 
	 */
	public static void main(String[] args) {
		int score = 3;
		if(score==1) {
			System.out.println("1");
		}
		else if(score==2) {
			System.out.println("2");
		} else {
			System.out.println("Invalid");
		}
		
		
		switch(score) { //Must give an expression: data
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			
			default:
				System.out.println("Invalid");
				break;
		}
		
		System.out.println("============================\n");
		
		
		
		String str= "Java";
		
		switch (str) {
			
			case "C#":
				System.out.println("C# Programming Language");
			break;
			
			case "Python":
				System.out.println("Python Programming Language");
			break;
			
			case "Java":
				System.out.println("Java Programming Language");
			break;
			
			default: //else
				System.out.println("Invalid");
				
		}
		
		System.out.println("==========================\n");
		
		char grade = 'A';
		
		switch (grade) {
				
			case 'B':
				System.out.println("Passed with B");
				
			case 'C':
				System.out.println("Passed with C");
		
			default :
				System.out.println("Failed");	
		}	// switch statement only exits when there is break statement or closing curly brace
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
