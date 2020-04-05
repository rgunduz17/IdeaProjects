package day30_WrapperClass_ArrayList;

import java.util.Arrays;

public class WrapperClass {


//	The eight primitive data types
//	byte, short, int, long, float, double, char and boolean
//	are not OBJECTS,
//	Wrapper classes are used for converting primitive data types
//	into objects, like int to Integer etc.


	/*
		  Primitives					  Wrapper-class 		: classes that are dedicated to primitives
	 		byte		 Auto-Boxing		Byte			null
	 		short		============>		Short			null
	 		int								Integer			null
	 		long		 Un-Boxing			Long			null	
	 		float		<============		Float			null	
	 		double							Double			null
	 		boolean							Boolean			null
	 		char							Character		null
	
	  */
//	 		default values of primitives:
//	 				byte, short, int, long ==>0;
//	 				double, float ==> 0.0
//	 				boolean ==> false;
//	 				char ==> space
//	 		default value of wrapper class: null
//
//	 		if we do not give any objects to class (reference),
//	 		 null will be given by default
//
//	 		Strings default value is also null
//
	
	public static void main(String[] args) {
		int numInt = 10;
		Integer numInteger = 10;
		
		double numdouble = 5.5;
		Double numDouble = 5.5;
	
		long longnum = 20L;
		Long Longnum = longnum; // Auto-Boxing converting primitive values to wrapper class
		
		System.out.println(longnum);
		System.out.println(Longnum);
		
		
		Boolean Booleanresult = false;
		boolean booleanresult = Booleanresult; // Un-Boxing converting wrapper class value to primitve value
		

		char ch1 = 'L';
		Character ch2 = ch1; // Auto-Boxing
		
		char ch3 = ch1; 	 // none
		
		char ch4 = ch2; 	 // Un-Boxing

		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);

		
		
		Long[] arr = new Long[3]; // [0, 0, 0]
		System.out.println( Arrays.toString(arr) );
		
		int num1 = 10; 
		//	num1.method(); primitive variable do not have methods,
		//	variable num1 is not an object
		
		Integer num2 = 20;
		int x = num2.MAX_VALUE;
		
		
				
	}
	
	
}
