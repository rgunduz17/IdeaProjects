package day09_Review;

public class If_Statement {

	/*
	 	if statement:
	 	single if statement:
	 			
	 	if(boolean expression) {
	  		some codes to run
	  		}
	  	only executed if statement is true
	  	if block only gets executed the condition is true
	  			
	  
	  
	 */
	public static void main(String[] args) {
		
		
		if( 9 > 10 ) {
			System.out.println("Hello");
			System.out.println("Happy Friday");
			System.out.println("Tomorrow is day off");
			System.out.println("class starts on Monday");
		}
		
		int a = 1000;		//1001
		
		if ( true ) {
	//		 1000 == 1001 ==> false
			a = 2000;
			System.out.println("a is increased");
		}
		
		System.out.println( a + "\n\n\n" );
		
		
		
		int X = 987654320;
		
		if ( X % 2 == 0 ) { 	// even
			// true
			System.out.println(X);
			System.out.println( "it's an even number" );
		}
		
		if ( X % 2 != 0) {	// odd
			// false
			System.out.println(X);
			System.out.println( "it's an odd number" );
		}
		
		
		
		
		
		
		
		//
		int Y = 2345678;
		
		if ( Y % 5 == 0 ) {
			System.out.println( Y + " can divide by 5" );
		}
		
		if ( Y % 5 != 0 ) {
			System.out.println( Y + " can't be divided by 5\n\n");
		}
		
		
		
		String CEO = "Main Boss";
		String Kuzzat = "Main Boss";
		
		System.out.println(CEO == Kuzzat);	// true
		
		if( Kuzzat == CEO ) {
		//       true	
			System.out.println( "Greatest person in the world" );
			System.out.println( "First if block" );
		}
		
		if (Kuzzat != CEO) {
		//	     false
			System.out.println( "Greatest person in the world" );
			System.out.println( "Second if block" );
		}
		
		
		
		
		
		int TotalNumber = 100;
		boolean Cybertek  = true;
		boolean BestSchool = true;
		 if ( Cybertek == BestSchool ) {
			 //		true	 
			 TotalNumber +=500;	// TotalNumber = 600;
		 }
		if ( Cybertek != BestSchool ) {
			//		false
			TotalNumber -= 50;	// TotalNumber = 50;
		}
		
		
		System.out.println( TotalNumber + "\n\n\n ");
		
		
		
		/*
		 1. declare a variable and initialize user age
		 2. write a program that checks if user is eligible to vote for Donald Trump 2020
		 		vote age is 18
		 
		 */
		
		
		byte UserAge = 78;
		byte VoteAge = 18;
		
		if ( UserAge >= VoteAge) {
			//      true
			System.out.println( "You are eligible to vote" );
			System.out.println( "Have fun building the wall!" );
			System.out.println( "MAGA" );
		}
		
		if ( UserAge < VoteAge ) {
			//      false
			System.out.println( "You are not eligible to vote yet" );
			System.out.println( "Minimum voting age is 18" );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
