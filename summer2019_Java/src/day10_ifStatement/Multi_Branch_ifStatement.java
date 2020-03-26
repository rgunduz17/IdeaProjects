package day10_ifStatement;

public class Multi_Branch_ifStatement {

	/*
	 if-else if-else:
	 		If (condition1) {
					//A		==> if condition1 is true
			} 
			else if (condition2) {
					//B		==> if condition1 is false and condition2 is true
			}
			else{
					//C		==> if none of them are true ==> B
			}

			IN IF STATEMENT ONLY ONE BLOCK GETS EXECUTED

	 */
	
	public static void main(String[] args) {
		
		if(false) {
			System.out.println("if block");
			
		}
		else if (true) {
			System.out.println("else if block");
			
		}
		else {
			System.out.println("else block");
			
		}
		
		
		/*
TASK 01:
		 		90 <= GRADE ==> A
		 		80 <= grade < 90 ==>B
		 		70 <= grade < 80 ==> C
		 		60 <= grade < 70 ==> D
		 		else ==> F
		 */
		int grade =87;
		
		if (grade>=90&&grade<=100) {
			System.out.println("You got an A");
		}
		else if (grade<90&&grade>=80) {
			System.out.println("You got a B");
		}
		else if (grade<80&&grade>=70) {
			System.out.println("You got a C");
		}
		else if (grade<70&&grade>=60) {
			System.out.println("You got a D");
		}
		else {
			System.out.println("You got an F");
		}
		
//find the bug
		int grade2 = 70;
		
		if (grade2 >=60) {
			System.out.println("D");
		}
		else if (grade2 >=70) {
			System.out.println("C");
		}
		else if (grade2 >=80) {
			System.out.println("B");
		}
		else if (grade2 >=90) {
			System.out.println("A");
		}
		else {
			System.out.println("F");
		}
		
		// it executes D because it came before C		
		
		/*
		 Task02:
		 1: write a program that:
		 		1. 0 ~ 12 ==> good morning
		 		2. 12~ 15 ==> good afternoon
		 		3. 15 ~ 23 ==> good night
		 		4. 12 ==> good noon
		 		 
		 */
		
		int hour =24;
		
		if (hour >= 0 && hour <12) {
			System.out.println("Good morning");
		}
		else if (hour > 12 && hour <=15) {
			System.out.println("Good afternoon");
		}
		else if (hour >15 && hour <=23) {
			System.out.println("Good night");
		}
		else {
			System.out.println("Good Noon");
		}
		
		
		
		/*
		 Task:
		 int num1, num2, num3
		 	find the bigger number
		 	
		 */
		
		int num1 =200, num2 =300, num3 =50;
		
		if( num1 > num2 && num1 > num3) {
            System.out.println(num1+" is the bigger number");
        }
        
        else if( num2 > num1 && num2 > num3){
            System.out.println(num2+" is bigger number");
        }
        
        else if(num3 > num2 && num3 >num1) {
            System.out.println(num3+" is the bigger number");
        }
        
        else if (num3 == num2 && num3 > num1) {
            System.out.println(num3+" and "+num2+" are the bigger number");
        }
    
        else if(num3==num1 && num3 > num2) {
            System.out.println(num3+" and "+num1+" are the bigger number");
        }
        else if(num2 == num1 && num2 > num3) {
            System.out.println(num2+" and "+num1+" are the bigger number");
        }
        else if(num2 == num1 && num2 == num3) {
            System.out.println(num2+" and "+num1+" are the bigger number");
        }
        else {
            System.out.println("all of them are equal");
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
