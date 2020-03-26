package day05_Recap;

public class Primitives_Review {
	
	/*
	 	Primitives:
	 			byte: 		only takes whole numbers
	 			short:		only takes whole numbers
	 			int(used more often):		only takes whole numbers
	 			long:		only takes whole numbers
	 			
	 			float:		can take decimals (MUST have F or f at end)		
	 			double:		can take decimals
	 			
	 			boolean:	takes true or false boolean expressions
	 				
	 			char:		characters within single quote '' (ASCII)
	 						also takes number for ASCII letters
	 */
	
		public static void main(String[] args) {
		
		//		System.out.println(bNum);
				// java applications are executed from top to bottom
			
			byte bnum = 127; 
				//bytes range is -128 to 127
			
		//byte bNum2 = 126.5; //byte only takes whole numbers
		
			
			short sNum2 = 1000;
		//short sNum = 126.5; //short only takes whole numbers
			
		//bNum= sNum2; //short is greater than byte, can't assign
			
			sNum2 = bnum;
			System.out.println(sNum2);
			
			short sNum3 = 127;
		//	byte bNum5 = sNum3;		short>byte so it doesn't compile
			
			int intNum = 100;
		//	int intNum2 = 100.5;	//int takes whole number only
			
			System.out.println(intNum);
			
		//	byte ByteNum = intNum;	//int > byte
		//	short ShortNum = intNum;	//int > short		
		
			short ShortNum2 = 105;
			int intNum2 = ShortNum2;
			System.out.println(intNum2);
		
			
			long LongNum = 100;
			long LongNum2 = 100L;
		
		//	byte ByteNum3 = LongNum;
		//	short ShortNum3 = 100l;		
		//	int IntNum3 = 100L;				long > int, byte, short
		
			byte a = 10;
			int b = 30;		
			short c = 40;
			
			long LongNumber = a;
			long LongNumber2 = b;
			long LongNumber3 = c;
			
		
			
		//float:	
			
			float floatNumber = 10.5f;
			float floatNumber2 = 20.5F;	
		
		short a1 = 10;	byte b1 = 20;	long c1 = 30;	int d1 = 40;
			
		float Floats = a1;
		float Floats2 = b1;
		float Floats3 = c1;
		float Floats4 = d1;
		
		System.out.println( Floats ); // 10.0
		
//double: takes all thw hole and decimal numbers
		double DoubleNum1 = 10L; //long is smaller than double
		
		double DoubleNum2 = 10.5f;
		
		
		
//boolean:
		boolean result = true;
		boolean result2 = false;		
		
		boolean result3 = 9 > 10;
		
		
// char:
		
		char character1 = 'A';
		System.out.println(character1);	//character: A
		
		//char character2 = A;
	//	char character3 = 'AA'; only single character can be declared
		
		//all the characters have representetive number:
		
		char charvalue = 98;
		System.out.println(charvalue);
		
		
		int num3 = 'B';
		System.out.println( num3 ); //66
		
		float fnum = 'B';
		System.out.println(fnum); //66.0
		
		byte bValue = 'B';
		System.out.println( bValue ); //66
		
	//float:
		float fnum2 = 5.5f; //5.5
		float fnum3 = 5;	//5.0
		
		
		char specialCharacter = 55000;
		System.out.println(specialCharacter);
	
		
		
		//	practices
		
		
		/*
		 8,	9,	#,	@,	8.5,	5.5F,
		 128,	40000,	9 > 10,  true, false
		 */
		
			//8:
		byte BNum =8;	short SNum=8;	int INum =8;
		long LNum =8l;   float FNum =8;	double DNum =8;	 	
		char character = '8';
		 
		 System.out.println(BNum);	//8
		 System.out.println(SNum); 	//8
		 System.out.println(INum);  //8
		 System.out.println(LNum);  //8
		
		 System.out.println(FNum);  //8.0
		 System.out.println(DNum);	//8.0
		 System.out.println(character);	
		
		// # & @:
		 	char character2 = '#';
		 	char character3 = '@';
		 	System.out.println(character2);
		 	System.out.println(character3);
		
			
		}
		
	
	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

