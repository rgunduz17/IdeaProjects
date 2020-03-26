package day06_ArithmaticOperators;

public class PrimitivesCasting {

	/*
	 casting: converting larger primitive to smaller size
	 			datatype variablename = (datatype) value
	 
	 			castings : Explicit or implicit
	 
	 primitives: byte, short, int, long, float, double
	 	
	 */
	
	public static void main(String[] args) {

//EXPLICIT casting		
		
		int a = 128;
		byte b = (byte) a;		//explicit casting
		System.out.println(b);
		
		double DecimalNumber = 10.5;
		float FloatNumber = (int) DecimalNumber;	//double > float
			// FloatNumber = 10.0;
		
		System.out.println(FloatNumber);
		
	long LongNum = 300L;
			
		//	int IntNum = (int) LongNum;
		//	int IntNum = (byte) LongNum;  CAN NOT BE CONVERTED
			int IntNum = (short) LongNum;
			
			System.out.println(IntNum);

			
// implicit casting:
				byte ByteNum = 100;
				int IntNum2 = ByteNum;			//Implicit casting
					// Same with:
				int IntNUm3 = (int) ByteNum;	//Implicit casting
	
		short ShortNum = 100;
			long LongNum2 = ShortNum;
				// same with:
			long LongNum3 = (long) ShortNum;
	
	
	// explicit casting practices:
			double LargestNumber = 100.8765;
			
			byte ByteValue = (byte) LargestNumber;			
			//    		100
			float FloatValue = (short) LargestNumber;
			float FloatValue2 = (int) LargestNumber;
			float FloatValue3 = (long) LargestNumber;
			//	        		100	
			float FloatValue4 = (float) LargestNumber;
			//					100.8765
			
			
			System.out.println(FloatValue4);	//100.8765
			
		float FloatNumber2 = 500.67f;
		
		int myNumber = (short) FloatNumber2;
		int myNumber2 = (int) FloatNumber2;
		//				500
		System.out.println(myNumber);
		
		
		
		/*
		 	int Num1 = 100
		 	int Num2 = 200
		 	int Num3 = 300
				All of these are called local variables             
			Same as:	
		 */
		
			
			int Num1 = 100 , Num2 = 200 , Num3 = 200 ;
		
			
			boolean result;
		//	System.out.println( result ); LOCAL VARIABLES MUST BE INITIALIZED
	
			char Character1 = 'A' ;
			System.out.println( Character1 );
			
			
			boolean result1, 
					result2, 
					result3 ;
			
			
			//System.out.println(result1); error
			
			
			
			
			
			
			
			
	
	}
	
	
	
	
	
}
