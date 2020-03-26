package day10_ifStatement;

public class Nested_if {
	/*
	 Nested if:
	 	if ( condition ){
	 			if ( condition2 ){
	 					//some code run
	 			
	 			}
	 	
	 	}
	 
	 
	 */
	
	public static void main(String[] args) {
		
		if ( true ){
 			System.out.println("Hello Cybertek");  // printed
			if ( false ){
 					System.out.println("Hello World");
			}
			else {
 						System.out.println("Hello Team SDET");  // printed
 			}
 			
 	
		}
		
		
		/*
		 60 <= grade , 70 ==> D
		 70 <= grade <80 ==> C
		 80 <= grade <90 ==> B
		 90 <= grade <= 100 ==> A
		 */
		int grade = 89;
		
		if (grade >= 60 && grade <= 100) {
			System.out.println("passed");
			
			if (grade >= 90 && grade <= 100) {
				System.out.println("with an A");
			}
			else if (grade >= 80 && grade < 90) {
				System.out.println("\t with a B");
			}	
			else if (grade >= 70 && grade < 80) {
				System.out.println("\t with a C");
			}
			else {
				System.out.println("\t with a D");
			}
		
		}	
		else if (grade >= 0 && grade < 60){
			if(grade < 60) {
				System.out.println("You failed with a grade of F");
			}
			else if (grade >= 50 && grade < 60) {
				System.out.println("\t with a G");
			}
			else if (grade >= 40 && grade < 50) {
				System.out.println("\t with a H");
			}
			else if (grade >= 30 && grade < 40) {
				System.out.println("\t with a I");
			}
			else if (grade >= 20 && grade < 30) {
				System.out.println("\t with a J");
			}
			else if (grade >= 10 && grade < 20) {
				System.out.println("\t with a G");
			}
			else if (grade >= 0 && grade < 10) {
				System.out.println("\t with a G");
			}
			else {
				System.out.println("Invalid score, error 401");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
