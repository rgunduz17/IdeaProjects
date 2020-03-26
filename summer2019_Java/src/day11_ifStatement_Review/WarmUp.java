package day11_ifStatement_Review;

public class WarmUp {
	/*
	 Warm up:
	 	1. declare an int variable "Year"
		2. write a java program that can check if the year is a leap year

		if a year can be divided by 4 ==> leap
			Do Not use single If statement	
			
		2. grade calculator
		A => 90 - 100
		B => 80 - 89
		C => 70 - 79
		D => 60 - 69
		F => 0 - 59
	 */
		
	public static void main(String[] args) {
		
//Warmup 1		
		int Year = 2000;	// leap
		boolean LeapYear = Year % 4 ==0;
		
		 if (LeapYear) {
			 System.out.println(Year+" is a leap year");
		 } 
		 else {
			 System.out.println(Year+ " is not a leap year");
		 }
		
		System.out.println("===================================\n\n");
//Warmup 2
		 byte grade = 78;
		 
		 boolean A =grade>=90&&grade<=100;
		 boolean B =grade >=80&&grade<90;
		 boolean C =grade >=70&&grade<80;
		 boolean D =grade >=60&&grade<70;
		 boolean F =grade >=0&&grade<60;
		
		 if (grade>=60&&grade<=100) {
				System.out.println("You passed the class");
			}
		 	if (A) {			//90&&grade<=100
		 		System.out.println(grade+" is an A");
		 		}
		 		else if (B) {	//80&&grade<90
		 			System.out.println(grade+" is a B");
		 		}
		 		else if (C) {	//70&&grade<80
		 			System.out.println(grade+" is a C");
		 		}
		 		else if (D) {	//60&&grade<70
		 			System.out.println(grade+" is a D");
		 		}
		 		else if (F) {	//0&&grade<60
		 			System.out.println("You failed the class\n"+grade+" is an F");
		 		}
		 else {
			System.out.println("This grade is incorrect: \n"+grade);
		 }
		
		
		
		 System.out.println("===================================\n\n");
		
		
		
		/*
		 
		 declare an int variable called Age
		 declare a boolean variable "Healthy Person"
		 Write program that shows what age can buy
		 
		 if goodperson is false:
		 	age>= 18 ==> cigarette
		 	age>= 21 ==> alcohol, gun carry license
		 	age>= 25 ==> 
		 
		 	age<  18 ==> milk
		 
		 else
		 bad for your health
		 */
		int age= 20;
		
		boolean GoodPerson = true;
		boolean agelimit = age>=0;
		
		if (age >= 18) {
			System.out.println("You can buy milk");
			if(GoodPerson) {
				System.out.println("You are healthy");
			}else {	//GoodPerson = false && age >= 18
				System.out.println("You can buy Cigaretes");
			}
				if (age>=21) {
					System.out.println("You can buy Hookah");
				}
					if(age>=25) {
						System.out.println("You can buy Alcohol");
					}
		}
		else {
			System.out.println("You can buy milk");
		}
		
		
		
		/*
		 1. write a program that can find the number of days in a month
		 (Assume that Feb has 28 days)
		 
		 int month= 0-12;
		 
		 1		2		3		4		5		6		7		8		9		10		11		12
		 Jan,	Feb,	Mar,	Apr,	,May,	Jun,	Jul,	Aug,	Sep,	Oct,	Nov,	Dec
		 31		28		31		30		31		30		31		31		30		31		30		30	
		 
		 		MUST use nested if
		 
		 		28 days: 2
		 		30 days: 4, 6, 9, 11
		 		31 days: 1, 3, 5, 7, 8, 10, 12
		 		
		 		even number of 30 days: 4 & 6
		 		odd number of 30 days: 9 & 11
		 		
		 		even number of 31 days: 8, 10, 12
		 		odd number of 31 days: 1, 3, 5, 7
		 */
		
		int month = 10;
		boolean Limit = month >= 1 && month <= 12;
		if ( Limit ) {
			if (month ==1) {
				System.out.println("31 days");
			}
			else if (month==2) {
				System.out.println("28 days");
			}
			else if (month==3) {
				System.out.println("31 days");
			}
			else if (month==4) {
				System.out.println("30 days");
			}
			else if (month==5) {
				System.out.println("31 days");
			}
			else if (month==6) {
				System.out.println("30 days");
			}
			else if (month==7) {
				System.out.println("31 days");
			}
			else if (month %2 ==0 ) {
				System.out.println("31 days");
			}
			else {
				System.out.println("30 days");
			}
			
		}
		else {
			System.out.println("Invalid Entry!");
		}
		System.out.println("===========================\n\n\n");
		/*
		 	28 days: 2
		 	30 days: 4, 6, 9, 11
		 */
		
		int Month2 = 2;
		int year =2016;
		if(Month2 >0 && Month2<13) {
		
				 if (Month2 ==2) {
					 if(year%4 == 0) {	//condition for leap year
						 System.out.println("29 days");
					 }
					 else {				//condition for regular year
					 System.out.println("28 days");
					 }
				}
				 else if (Month2==4 || Month2==6) {
					 System.out.println("30 days");
				 }
				 else if ( Month2==9 || Month2==11) {
					 System.out.println("30 days");
				 }
				 else {
					 System.out.println("31 days");
				 }
				}
		else {
			System.out.println(Month2+ " is an Invalid Entry");
		}
		
		
		// if-else && else-if:
		
		
		if (true) { //true
			System.out.println("hello");
		}
		else { //false
			System.out.println("Bath 12");
		}
		
		
		if (true) {	//true
			System.out.println("hello");
		}
		else if (false) { // false
			System.out.println("Batch 12");
		}
		else {	//NEVER GETS EXECUTED
			System.out.println("Cybertek");
		}
		
		
		
		
		
		  if(true) {
		  
		  }
		  else {
		  
		  }
	//	  else if (false){}
		  // else if MUST be declare right after if block
		  
		  int X=10;
		  if(X >0) {
			   System.out.println("greater than 0");
		   }
		  if (X>5) {
			  System.out.println("Greater than 5");
		  }
		  if (X==10) {
			  System.out.println("equal to 10");
		  }
		  /*
		  else if (X>5) {
			  System.out.println("Greater than 5");
		  }
		  else if (X==10) {
			  System.out.println("equal to 10");
		  }
		  
		  This way, only the first true option will be printed
		  */
		  
		  
		  
		  
		 if(true) {
			  
		 }  // only be used for 1 condition
		  
		  
		 if(true) {	// for 2 conditions
			 
		 }
		 else {	
			 
		 }
		
		if(true) {		//more than two conditions
			
		}else if (true) {
			
		}else {
			
		}
		
		
		if (true) {	// if condition has multiple scenarios
					// if we have pre condition
			
			if (true) {
				// execution of this block depends on first condition
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
