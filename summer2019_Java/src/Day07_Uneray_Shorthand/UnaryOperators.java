package Day07_Uneray_Shorthand;

public class UnaryOperators {

	public static void main(String[] args) {
	
		/*
		 +: positive
		 -: negative
		 ++: increment
		 --: decrement
		 
		 for + & -:
		 	= - ===> -
		 	- - ===> +
		 	+ + ===> +
		 	- + ===> -
		 	*/
		
		int a = 10;
		int b = -10;
		System.out.println(b);
		
		int c = + b;
		System.out.println(c);	// + (-10)	==> -10
		
		int d = - c;
		System.out.println(d);	// - (-10)  ==> 10
		
		// increment: increases the value by 1.
	//a pre increment: operator is placed before a variable;
		int num1 = 100;
		
		System.out.println( ++num1 );	// num1+1
		
		int num2 = ++num1;	// ++(101) ==> 102
		
		
		// post increment: the operator is placed after variable
		
			int IntNum = 100;
			
			System.out.println( IntNum ++ );	// 100
			System.out.println( IntNum );	// 101
		
		
			int IntNum2 = IntNum ++;	// IntNum2 = 101
			//	Intnum2 = 101
			
			System.out.println( IntNum2 );
			
			System.out.println( IntNum ); // 102
			
			
			
			int x = 100;
			int y = x++ -1;
			// 	y = 100 -1;
			
			System.out.println( y );
		
		
			// decrement: decreases the value by 1
					// pre-decrement: operator is placed before the variable
					//				decreases the value by 1 immediately
			
			
			int Z = 100;
				
				System.out.println( --Z ); //99
			
				
			// Post-decrement: operator is placed after the variable
				//  it will pass the current value, then decrease it by 1
			
				
		int Y = 95;
		
		System.out.println(Y --);	//95
		System.out.println(Y);		//94
		
			
		int T = 25;
		System.out.println(++ T);	//26
		System.out.println(-- T);	//25	
			
			
		int P = 50; // 50
		P = --P + P++ + P-- + P++;
		//	pre	  post  post  post
		//  49  +  49 + 50  +  49  
		//   98 + 50 + 49
		//		148 + 49
		//		197
		
		
		System.out.println( P );
	
		
		
		short S = 4;
		int R = S *4 - S--;
		//			16 -  4 = 12
		
		System.out.println(R);	//12
		System.out.println(S);	//3
		
		
		int W = 1;
			W= - W-- + W++ / -W-- * --W;
		//		post + post	/ post * pre
			
		//		 -1  +  0  /  -1  *  -1
		//       -1 + 0 * -1	
			System.out.println(W);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
