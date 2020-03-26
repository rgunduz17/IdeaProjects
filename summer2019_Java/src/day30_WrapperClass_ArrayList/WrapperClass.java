package day30_WrapperClass_ArrayList;

import java.util.Arrays;

public class WrapperClass {
	/*
		primitives						wrapper-class : classes that are dedicated to primitives
	 		byte		 Auto-Boxing		Byte			null
	 		short		============>		Short			null
	 		int								Integer			null
	 		long		 Un-Boxing			Long			null	
	 		float		<============		Float			null	
	 		double							Double			null
	 		boolean							Boolean			null
	 		char							Character		null
	
	 
	 		default values of primitves: 
	 				byte, short, int, long ==>0;
	 				double, float ==> 0.0
	 				boolean ==> false;  
	 				char ==> space
	 		
	 		
	 		default value of wrapper class: null
	 		
	 		if we do not give any objects to class (reference), null will be given by default
	 		
	 		Strings default value is also null
	 */
	
	public static void main(String[] args) {
		int numInt = 10;
		Integer numINteger = 10;
		
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
		
		char ch3 = ch1; // none
		
		char ch4 = ch2; // Un-Boxing
		
		Character ch5 = ch2; // none
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		
		
		Long[] arr = new Long[3]; // [0, 0, 0]
		System.out.println( Arrays.toString(arr) );
		
		int num1 = 10; 
		//	num1.method(); primitive variable do not have methods, variable num1 is not an object
		
		Integer num2 = 20;
		int x = num2.MAX_VALUE;
		
		
				
	}
	
	
}
