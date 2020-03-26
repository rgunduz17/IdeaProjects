package day10_ifStatement;

public class single_IfStatement {

	public static void main(String[] args) {
		/*
		 single if:
		 		if ( boolean expression ) {
		 				// A
		 		}
		 		
		 		
		 		
		 		
		 */
		if ( 9 > 8 ) {
			//true
			System.out.println( "We be balliiiiiin");
			System.out.println( "9 is greater than 8");
			
		}
		
		if ( 9 < 8) {
			//false
			System.out.println( "8 is greatter than 9");
			
		}
		
		System.out.println( "Test is completed");	// does not belong to any if block
		
		
// Task01:
		int num1 = 100;
		int num2 = 300;
		int max = 0; // local variables need to be initialized
		
		if ( num1 > num2) {	// means that num1 is greater than num2
			//false
			//max = num1;
			max += num1;
		}
		
		if ( num2 > num1 ) {
			//true
			
			//max = num2;
			max = num2;
			System.out.println( "both numbers are equal" );
		}
		
		System.out.println( "Maximum number between  "+num1+" and "+ num2+" is "+max);
		
		
// task02:
		
		int hours = 12;
		
		if (hours >= 1 && hours <=12) {
			System.out.println(hours);
		} else {
			System.out.println("error");
		}
		
		int minutes = 45;
		
		if (minutes >= 0 && minutes < 60) {
			System.out.println(minutes);
			
		} else {
			System.out.println("ERROR");
		
		}
		
		int seconds = 30;
		
		if (seconds >= 0 && seconds < 60) {
			System.out.println(seconds);
			
		} else {
			System.out.println("ERROR");
		
		}
		
		String amOrPm = "am";
		
		System.out.println(hours+":"+minutes+":"+seconds+" "+ amOrPm);  
			//hours:minutes:seconds am
			
		
// task03:
		int n1 = 100, n2 = 500, n3 = 700;
		int maximum = 0;
		
		/* in order for num1 to become maximum : n1 > n2 && n1 > n3
		   in order to n2 be maximum : n2 > n1 && n2> n3
		   in order to n3 be the maximum : n3 > n1 && n3 > n2
		
		 */
		
		if (n1 > n2 && n1 > n3 ) {
			maximum = n1;
			
			System.out.println("Maximum number between "+n1+", "+n2+", and "+ n3+" is "+maximum);
		}
		
		if (n2 > n1 && n2 > n3 ) {
			maximum = n2;
			
			System.out.println("Maximum number between "+n1+", "+n2+", and "+ n3+" is "+maximum);
		}
		
		if (n3 > n1 && n3 > n2 ) {
			maximum = n3;
			
			System.out.println("Maximum number between "+n1+", "+n2+", and "+ n3+" is "+maximum);
		}
		
		
		
		int A;
		if (true){
			A=12;
		}
		System.out.println(A);
		
		
		
		double B;
		 if(true) {
			 B=100;
		 }
		
		System.out.println(B);
	
		
		
// Task04:
        int statusCode = 404;
        String finalResult = "Invalid Status code";
        
        if(statusCode == 200) {
            finalResult = "ok";
            System.out.println("status code "+ statusCode+" is: "+finalResult);
        }
        
        if( statusCode == 201) {
            finalResult ="created";
            System.out.println("status code "+ statusCode+" is: "+finalResult);
        }
        
        if( statusCode == 404) {
            finalResult ="not found";
            System.out.println("status code "+ statusCode+" is: "+finalResult);
        
        }
		
		
		
//task05:
		int number = 100;
		String str = "zero";
		
		/*
		 number to be positive: number >0
		 number to be negative: number <0
		 number to be zero: number == 0
		 */
		if (number>= 0) {
			str="positive";
			System.out.println("number"+" is "+str);
		} else {
			str="negative";
			System.out.println("number"+" is "+str);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
