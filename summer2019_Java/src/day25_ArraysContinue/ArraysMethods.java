package day25_ArraysContinue;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {

		int num1 = 10;
		System.out.println(num1);

		int[] arr = { 1, 2, 3 };
		System.out.println(arr);

		/*
		 * to print entire array as whole, we need to convert the array to String
		 * Arrays.toString(VariableName): used for converting single dimensional arrays
		 * to String value
		 * 
		 * Arrays class: Utility of all the arrays Arrays class is presented in
		 * "java.util" package
		 */

		String str = Arrays.toString(arr);
		System.out.println(str);

		String[] names = { "Elvira", "Bibish", "Tural", "Daulet", "Hakan" };

		System.out.println(names[0]);
		System.out.println(names); // hash code
		System.out.println(Arrays.toString(names));

		/*
		 * Arrays.sort(VariableName); sorts the values of the arrays in ascending order
		 * (smallest to largest)
		 * 
		 */

			int[] Numbers = { 9, 8, 100, 3000, 4, 5, 6 };
	
			System.out.println(Arrays.toString(Numbers));

		Arrays.sort(Numbers); // sort all values of array in ascending order

			// Numbers = [4, 5, 6, 8, 9, 100, 3000]
			
		System.out.println(Arrays.toString(Numbers));

		System.out.println("Maximum "+Numbers[Numbers.length-1]);
		System.out.println("Minimum "+Numbers[0]);
		
		
		
		String[] NameLists = {"Alma", "Enes","Myra", "Smith", "Sarah", "Lexi", "ABC"};
			Arrays.sort(NameLists); // alphabetical order ( from AsCII table )
			
			System.out.println( Arrays.toString(NameLists) );
		
		
		char[] ch = {'0', '9', '8', '5', '3', '2', '1'};	
			Arrays.sort(ch);
			System.out.println( Arrays.toString(ch) );
		
		
			int[] nums = {2000, 89, 79, 65, 5555, 444, -5};
		
			Arrays.sort(nums);
			System.out.println(Arrays.toString(nums));
			System.out.println("Maximum "+nums[nums.length-1]);
			System.out.println("Minimum "+nums[0]);
			System.out.println("Second maximum is "+ nums[nums.length-2]);
		
		
		/*
		 write a program that can sort the arrays in Descending order (largst to smallest)
		 
		 */
		int[] MyNumbers = {99, 10, 200, 3000, 40, 50, 5000};
			Arrays.sort(MyNumbers);
					// MyNumbers -> [10, 40, 50, 99, 200, 3000, 5000]
					//				 0    1   2   3   4     5     6
			
			System.out.print( Arrays.toString(MyNumbers) );
		
		String result = "[";
		System.out.println("[");
		for( int i = MyNumbers.length-1; i>=0; i--) {
			result+= MyNumbers[i]+ ", ";
		}
		
			System.out.println();
			
			result = result.substring(0, result.length()-2)+"]";
		
		System.out.println(result);
		
//========================================================================
		
		int[] arr2 = {99, 10, 200, 3000, 40, 50, 5000};
		Arrays.sort(arr2);
		
		int[] arr3 = new int[ arr2.length ];
		int z = 0;
		for(int i = arr2.length-1; i >= 0; i--) {
			arr3[z] = arr2[i];
			z++;
		}
		
		System.out.println("Ascending order: "+Arrays.toString(arr2));
		System.out.println("Descending order: "+Arrays.toString(arr3));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
