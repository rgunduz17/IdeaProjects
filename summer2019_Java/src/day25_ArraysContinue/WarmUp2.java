package day25_ArraysContinue;

public class WarmUp2 {

	/*
	 * 2. Write a program that print out the unique values from String Array
	 */
	public static void main(String[] args) {

		String[] arr = { "A", "A", "B", "C", "C" };
		// index: 0 1 2 3 4

		// how many times A occurred in array

		for (int j = 0; j < arr.length; j++) {

			int count = 0;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equals(arr[j])) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[j]);
			}
		}

	}

}
