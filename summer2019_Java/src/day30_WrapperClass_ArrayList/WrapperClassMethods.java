package day30_WrapperClass_ArrayList;

public class WrapperClassMethods {
	/*
	 useful methods of Wrapper class:
	 			Max_Value
	 			Min_Value
	 			parse methods
	 			ValueOf methods
	 */
	public static void main(String[] args) {
		
//		1. MAX_VALUE:
//		 returns the maximum value of the primitive
			int maximum = Integer.MAX_VALUE;
			System.out.println(maximum);
			
			double maximumDouble = Double.MAX_VALUE;
			System.out.println(maximumDouble);
			
			byte maximumByte = Byte.MAX_VALUE;
			System.out.println(maximumByte);
			
			char maximumChar = Character.MAX_VALUE;
			System.out.println(maximumChar);
			

			
			
	// MIN_VALUE: returns min value of primitive
			
			int minimum = Integer.MIN_VALUE;
			System.out.println(minimum);
			
			byte minimumByte = Byte.MIN_VALUE;
			System.out.println(minimumByte);
			
			
			
	// parse methods:
	// converts String values to primitives,
	// returns the value as primitive
			
			// parseInt("strValue"): takes the String and converts the String to int primitive 
			
			Integer num1 = Integer.parseInt("123"); // Auto-Boxing
			System.out.println(num1);
			
			int num2 = Integer.parseInt("125"); // none
			System.out.println(num2+1);
			
			
			// parseByte("strValue"): takes the String and converts String to byte
				
					// byte num3 = Byte.parseByte("198"); // out of range
			
						byte num3 = Byte.parseByte("18"); // none
						System.out.println(num3+1); 
						
						Byte num4 = Byte.parseByte("18"); // Auto-Boxing
						System.out.println( num4+1 );
			
						
						
			// parseShort("StrValue"): takes the String and converts it to Short primitive value
						
						short num5 = Short.parseShort("200"); // none
						System.out.println( num5+1 );
						
						Short num6 = Short.parseShort("200"); // Auto-Boxing
						System.out.println(num6+1);
						
						
			// parseLong("strValue"): takes String value and converts to long primitve
						
					long num7 = (int)Long.parseLong("1222");
					long num8 = Long.parseLong("1222");	
					System.out.println( num7 );
					System.out.println( num8 );	
					
					
			// parseFloat("strValue"): takes String value and converts it to float primitive
					
					float num9 = Float.parseFloat("12.5"); // none
					System.out.println( num9+1 );
					
					Float num10 = Float.parseFloat("12.5"); // Auto-Boxing
					System.out.println( num10+1 );
					
					
			// parseDouble("strValue"): takes String value and converts it to double primitive
			
					float num11 = (int)Double.parseDouble("8.5"); // none
					System.out.println( num11+1 );
			
					
					double num12 = Double.parseDouble("8.5"); // none
					System.out.println( num11+1 );
			
					Double num13 = Double.parseDouble("8.5"); // Auto-Boxing
					System.out.println( num12+1 );
			
			// parseBoolean(""strValue): takes String and converts to boolean primitive		
					
					boolean A = Boolean.parseBoolean("CybertekBatch12");
									// any String values other than true will return false
					
					System.out.println(A);
					
					boolean B = Boolean.parseBoolean("TrUe"); // method ignores the case sensitivity
					System.out.println(B);
					
					
					boolean C = Boolean.parseBoolean("10 > 9"); // "10 > 9" != "true"
					System.out.println(C);
					
					
					Boolean D = Boolean.parseBoolean("TrUe");
					System.out.println(D);
					
					
					
		 //================================================================================================
					
					int a = 10;
					double b = a;
					
				// Double c = a; Double wrapper class is only dedicated to double primitive
					
					
					int A1 = Byte.parseByte("19");
					Integer A2 = (int)Byte.parseByte("19");
					
					
					Short A3 = (short)Double.parseDouble("10.9");
					
					
					int A5 = 100; 
					float A6 = (float)A5; // Float wrapper class is only dedicated to float
					
					
					
					
					
					
//		 ValueOf methods:
//		 converts String value to Wrapper class values,
//		 returns wrapper
					
					int z = Integer.valueOf("1234"); // unboxing
					Integer z1 = Integer.valueOf("1234"); // none
					
					Integer z2 = (int)Integer.valueOf("1234"+3); // Auto-Boxing
					
					System.out.println(z2);

				boolean result1 = ! Boolean.valueOf("FALSE"); // unboxing
				System.out.println(result1); // ValueOf methods ignores the case sensitivity
					
					
					
					int totalNumber = 100;
					String str3 = ""+totalNumber; // none 
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
	}
	
	
	
	
}
