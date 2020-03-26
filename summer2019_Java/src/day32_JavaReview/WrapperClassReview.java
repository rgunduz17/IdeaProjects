package day32_JavaReview;

public class WrapperClassReview {

	/*
	 	primitives									Wrapper classes: java.lang
	 		byte										Byte
	 		short		Auto Boxing						Short
	 		int		================>					Integer
	 		long										Long		
	 		float					   Un-Boxing		Float	
	 		double					<===============	Double
	 		boolean										Boolean
	 		char										Character
	 		
	 		
	 wrapper class vs primitives:		
	 		1. default values:
	 			primitives: byte, short, int, long ==>0
	 						float, double ==> 0.0
	 						boolean ==> false
	 						char ==> space
	 			
	 			All wrapper class: null
	  		
	  		2. wrapper class only accepts its own primitive value
	  
	  		3. wrapper class has method, primitives don't
	  		
	  		4. wrapper class takes objects, primitives take values
	  		
	  		
	  		
	  methods: Max_values, Min_values, parse methods, valueOf method		
	  				
	  				max_value: returns the maximum value of the data type
	  				min_value: returns the minimum value of the data type
	  				parse methods: converts String to primitives
	  				valueOf methods: converts String to wrapper class	
	  				
	  					
	  Auto-boxing: assign the primitives to wrapper class
	  un-boxing: assign the wrapper class value to primitive
	  
	  				
	 */
	public static void main(String[] args) {
		int a = 10;
		Integer b = 10; // Integer only accepts int primitive values
		byte c = 20;
	//	integer b2 = c; // Integer only accepts int primitive values
		
		long L = b; // integer is within the range of long
		
		
		
		boolean result = 9>0+1;
		Boolean result2 = result; 	// auto boxing
		
		boolean result3 = result2;	// un-boxing
		
		Boolean result4 = result2; 	// none
		
		boolean result5 = result3;  // none
		
		/*
		 methods:
		 			max_value
		 			min_value
		 			parse methods
		 			valueOf methods
		 			
		 */
		
		int max = Integer.MAX_VALUE; // 2147483647
	//	int max = Double.MAX_VALUE; // int != double
		System.out.println(max); 
		
		System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
		System.out.println(Byte.MAX_VALUE); // 127
		
		
		int min = Byte.MIN_VALUE; // -128
		int min2 = Integer.MIN_VALUE; //-2147483648
		System.out.println(min);
		System.out.println(min2);
		
		
		
	// parse methods: returns primitives, ignores the case sensitivity
		short s1 = Short.parseShort("1234"); 
		System.out.println(s1);
		
		double d1 = Double.parseDouble("78.5"); // none
		Double d2 = Double.parseDouble("78.5"); // auto-boxing
			
			
			boolean r1 = Boolean.parseBoolean("true"); // none, 
			System.out.println( r1 );
			
	// ValueOf methods: returns wrapper class,		
				Integer num = Integer.valueOf("123"); // none
				System.out.println(num);
		
				int num2 = Integer.valueOf("123"); // un-boxing
		
		
				byte num3 = Byte.valueOf("12");
				
				
				boolean R1 = Boolean.valueOf("TrUe"); // un-boxing
				System.out.println(R1);
				
				
		
	}

}
