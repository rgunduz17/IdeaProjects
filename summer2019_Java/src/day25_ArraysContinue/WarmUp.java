package day25_ArraysContinue;

public class WarmUp {

	/*
	 * 1. Write a program that can print out the unique values from an int Array
	 */
	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 4, 4, 8, 7, 9 };
		// index:     0  1  2  3  4 .. . . .. . . . . . . . . . .
		// arr[j] 
		
		for (int j = 0; j < arr.length; j++) {
			
			int count = 0; // to find out how many times a value is appeared in the array
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == arr[j]) { // compares each index of the array with the given index
					count++; // every time if the value is occurred in the array, count will increase
				}
			}

			if (count == 1) { // if only appeared once, we will print that value out
				System.out.println(arr[j]);
			}

		}

		
		
		
		
		
	}
}
