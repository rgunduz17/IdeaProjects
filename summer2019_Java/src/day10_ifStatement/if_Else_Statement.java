package day10_ifStatement;

public class if_Else_Statement {

	
		/*
		 * if & else:
		
			if (condition) {
					//A			
					// if block only executed if condition is true
			}
			else {
					//B			
					// executed if condition is false
			}
		 	if condition is true -> A
		 	if condition is false -> B
		
		*/
		
	public static void main(String[] args) {
	
		
		
		
		if (9 >= 8) {
			System.out.println("9 is greater than or equal to 8");
		}
		
		else {
			System.out.println("9 is less than 8");
		}
		// if 9 is not greater than or equal to 8, then 9 must be less than 8
		
		/*
		 Task01:
		 	if score < 60 ==> failed
		 	if score > 60 but score < 90 ==> pass
		 */
		
		int score = 59;
		if (score >=60) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		
		
		/*
		 1. triangle: has three angles, 
		 				and sum of three angles must equal 180
		 	1. declare three variables called angle1, angle 2, angle 3.
		 	2. write a program to check if the triangle is valid or not
		 
		 */
		
		int angle1 = 20, angle2 = 50, angle3 =75;
		boolean valid = (angle1+angle2+angle3) == 180;
		if (valid) {
			System.out.println("This is a valid Triangle");
		}
		else {
			System.out.println("Invalid angle degrees");
		}
		
		
		
		
		
		
		
		
	}
}
