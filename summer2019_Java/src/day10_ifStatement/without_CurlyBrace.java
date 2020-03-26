package day10_ifStatement;

public class without_CurlyBrace {

	public static void main(String[] args) {
	
		/*
		 single if statement:
		 if( condition ) 
		 			// single line of statement only
		 
		 
		 
		 
		 
		 */
		
		if (false) {
			System.out.println("Today is Friday");
			System.out.println("tomorrow is a day off");
			System.out.println("there is no java class tomorrow");
		}
		
		
		if (true)
				System.out.println("Today is friday");
		
		System.out.println("toomorrow there is class");
		
		
		/*
		 if- else statement:
		 
		 	if(condition)
		 			// single line of statement
		 		else
		 			//single line of statement
		 
		 
		 */
		
		if (true)
			System.out.println("Hello");
		    System.out.println("Good morning");
		/*else
			System.out.println("Hola");
		*/
		
		
		if (false)
			System.out.println("this is if");
	
		else
			System.out.println("this is else");
			
		
		/*
		 multi-branch if statement:
		 
		 		if( condition1 )
		 				//single line of statement
		 		else if ( condition 2 )
		 				//single line of statement
		 		else
		 				//single line of statement
		 */
		
		if (true)
			System.out.println("if block");
		//System.out.println(); compile error
		else if (true)
			System.out.println("else if block");
		//System.out.println(); compile error
		else
			System.out.println("else block");
		
		// else block is not mandatory
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
