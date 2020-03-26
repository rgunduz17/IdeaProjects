package day09_Review;

public class quiz {

	
	public static void main(String[] args) {
	// question 01
		
		boolean a = !!!!!false;
			//		   !!!!true
			//		   !!!false
			//		   !!true
			//				!false
			//				true
		System.out.println(a);		// true
		System.out.println(!!true);	// true

		
	// question 02
		boolean result = !false != ( "Batch12" != "Nest Batch Ever" ) ;
			//			true	!=              False
			//				false
		
		
	// question 03
		int x = 100;
		double y = x += 100/20;
		//	   x=x+(100/20) = 105
		//	   y = 100 += 5 ==> 105
		System.out.println(x);
		
		System.out.println( 105.0 > 105 );	// false
		System.out.println( 105.1 > 105 );	// true
		
		
	// question 04
		String Answer1 = "Bran Stark";
		
	
	// question 05
		
		boolean A =128 > '9' || 128 == 127;	
					// true	 || false
		System.out.println( A );

		
	// question 6
		boolean StupidOperators = 10 >= 20 && 'a' > 'b';
					//				false  &&  false ==> false
		System.out.println(StupidOperators);
		
		
	// question 07
		int num1 = 9999999;
		int num2 = 10;
				
		System.out.println( num1 * num2 / 10 % num1);	//0
				
				
	// question 08
		int x1 = 100;
		int y1 = (byte)100;
		
		
		
		
	// question 09
		int z =100;
	//	System.out.println( "z > 100 is :" + H);	H is not defined before the print statement
		boolean H = z > 100;	//false
				
																		
    // question 10
		System.out.println( 5 +7 + "8" );
		//					  12 + "8" ==> 128
		
		
		
	// question 11
		System.out.println( 1+11+"3" == "123");
		//					 12 + "3"== "123"	
		//						"123"== "123" ==> true
		
		
	// question 12:
		int numberA = 100;
			numberA += 300;	//400
			
			System.out.println( numberA++ + " " + numberA );
			//					400                4001
			
			
			
	// question 14
		System.out.println( (10*2) / (5*4) *1000 / 10 % 100);
		//						20/20 *1000 / 10 %100
		//						    1000 /10 %10
		//								10 % 10 ==>0
		
		
		
	
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
