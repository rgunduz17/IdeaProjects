package day09_Review;

public class Review {

	/*
	 	relational :
	 	>	: greater					X=10 Y=9 : only return true when X > Y
	 	>=	: greater than or equal		true: either greater than or equal
	 	<	: less than 					X=10 Y=9 : only return true when Y < X 
	 	<=	: less than or equal 		true: either less than  or equal
	 	==	: equal						true: only if exactly same
	 	!=	: not equal					true: only if characters are not equal
	 
	 logical operators: 
	 		&& : true: if both conditions are true
	 		|| : true if at least one condition is true
	 
	 
	 
	 
	 */
	public static void main(String[] args) {
		// > :
		
		System.out.println( 'Z' > 'A' );	// true
		
		System.out.println( 'Z' >= 'A' );	// true
		
		System.out.println( 'a' > 'A' );	// true
		
		
		System.out.println( 'a' < 'A' );	// false
		
		char ch1 = 65 ;
		System.out.println(ch1);
	
		System.out.println( 'A' <= 'A' );	// true
		System.out.println( 'A' <= 'a' );	// true
		//					 65 <= 97 ==>      true
	
		System.out.println( false == false );	// true
		System.out.println( !(false != true) );		// false
		
		
		
		System.out.println( true == true  && false != true );	// true
		//						true      &&      true  ==> true
		
		System.out.println( true != true  ||  false == true );	// false
		//						false     ||    false		   	==> false
		
		System.out.println( "Monday" == "Funday"  || true == !false);
		//							fasle         ||     true	==> true
		
		
		
		
		
		
		
		
		/*
		byte X = 10; int Y = 10;
		System.out.println( X == Y );	// for primitives, yes.
		*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
}
