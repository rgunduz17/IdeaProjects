package day08_ShortHandOperators;

public class warmup {

	/*
	 Task 2:
	 		write a java program that converts gallons to liters
	 				1 gallon = 3.785 liters
	 
	 
	 */
	
	public static void main(String[] args) {
		
			int gallon = 100;
			double liters = gallon * 3.785;	// converts gallon to liters
			String result1 = gallon + " gallons equal to " + liters + " liters";
			
			System.out.println(result1);
			
			
			double L = 1;
			double G = L/ 3.785;	//	
			String result2 = L + " litters equal to " + G + " gallons";
			
			System.out.println(result2);
			
			
			//Task1:
			int x = 2;
			int y = x++;	// y = 2; x = 3;
				// post
			System.out.println( y + " " + x );
			
			
			int x2 = 2;
			System.out.println( x2 ++);	// 2
			System.out.println(x2);	// 3
			
			int x3 = 2;
			System.out.println( --x3 );	// 2 - 1 = 1
			
			
			int x4 = 8;
			int y4 = x4--;	// 8
			System.out.println( y4 );
			System.out.println( x4 );
			
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
