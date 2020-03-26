package day29_ReturnMethods;

import java.util.Arrays;

public class returnMethodPractice {
	public static void main(String[] args) {
		sum(10,20);
		
		// int max = sum(10,20); // the method sum does not return any value
		
		addition(10,20); // this method is just an int value
		
		System.out.println( addition(10, 20) );
		
		float num = addition(10,20);
		
		System.out.println( num );
		
		
		
		int max = (int) greaterNumber(90, 200, 30); 
		//it's gonna be reusable if you assign it
		
		System.out.println(max);
		
		System.out.println( greaterNumber(90, 200, 30) );
		
		int[] arr = {20,30,1,2,3,5,9};
		int maxNum = maximum(arr);
		System.out.println(maxNum);
	
		
		int[] arr2 = {10000,90000,823112,762112, 654312};
		int maxNum2 = maximum(arr2);
		System.out.println(maxNum2);
		
		
		String[] names = {"emrah", "zulfie", "waris", "mehmet", "Aktoty", "yusuf", "Djalolitdin", "Munevver", "Hatice"};
		
		String longname = Longest(names);
		System.out.println(longname);
		
		
		
			int[] array = {1,2,3,4,5,6,7};
				array = sort(array);
				System.out.println(Arrays.toString(array));
	}
	
	//write a method that accepts an int array and returns the max number from array
	
	public static int maximum( int[] arr ) {
		
		Arrays.sort(arr);
		
		return arr[arr.length-1];	
	}
	
	
	
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public static int addition(int a, int b) {
		return a+b;
		
	}
	
	public static double greaterNumber(double a, double b, double c) { 
		double[] arr = {a, b, c};
		//			{1, 2, 3}
		Arrays.sort(arr);
		
		return arr[arr.length-1]; 
	}
	
	
	
	
	
	
	//1. write a method that accepts String array, and returns the longest String value
	public static String Longest(String[] arr) {
		String LongWord ="";
		
		int max=0;
		for(int i=0; i<arr.length; i++) {
			if( arr[i].length()>max ) {
				max = arr[i].length();
				LongWord = arr[i];
			}
		}
		return LongWord;
	}
	
	
	// write a method that accepts an int array and sorts it then returns an array
	
	public static int[] sort(int[] arr) {
							  // [5,3,2,22,3]
		Arrays.sort(arr); // [2,3,3,5,22]
		int[] numbers = new int[arr.length]; // array now has same length as arr
		
		int z=0;
		for(int i = arr.length-1; i>=0; i--) {
			numbers[z]=arr[i];
			z++;
		}
		
		return numbers;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
