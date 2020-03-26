package day28_JavaRecap;

import java.util.Arrays;

public class WarmUp1 {
	/*
	  	1. write a method that can convert km to miles
    				1 km = 0.612 miles
    				
    	2. write a method that can convert gallons to litters
	 				1 G = 3.75  L
	 				
	 	3. write method that can print out the array in descending order
	 */
	
	
	
	
	public static void main(String[] args) {
	//	KmToMiles(); // not enough info for the method to perform its task
	
		KmToMiles(1000); // KmTo Miles( 10.0 );
		
		GToL(1);
		
		int[] arr = {0, -1, 1000, 2000, 5000};
		
		SortDes(arr);
		
	
	}
	
	public static void SortDes(int[] array) {
		//array = {10,8,99,0,-1};
		Arrays.sort(array); // array ={-1,0,8,10,99};
		for(int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i]+", ");
		}
		
		
	}
	
	
	public static void GToL(double G) {
		double L = G * 3.75;
		System.out.println(G+" gallons equals to "+L+" liters");
	}
	
	
	public static void KmToMiles(double KM) {
		double Miles = KM * 0.612;
		System.out.println(KM+" km equals to "+Miles+" miles");
	}
}
