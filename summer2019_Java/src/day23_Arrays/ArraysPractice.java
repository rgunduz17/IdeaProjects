package day23_Arrays;

import java.util.Scanner;

public class ArraysPractice {
	public static void main(String[] args) {
		String student1 = "Ibrahim";
		String student2 = "Zuleyha";
		String student3 = "Elina";
		
		String[] AllStudents = {"Ibrahim", "Zuleyha", "Elina"};
		//							0		   1          2
			AllStudents[0] = "Marufjon";
		//	AllStudents[3] = "Muhtar";	// Arrays size is fixed
			System.out.println( AllStudents.length );
			
		// initialize the size only without giving value:
			int[] array = new int[4];	// we haven't given values to the array
				// this array can contain four values, its length is 4
			
			System.out.println( array.length );
			System.out.println( array[0] );
			System.out.println( array[1] );
			System.out.println( array[2] );
		
				// give values to the array:
			array[1] = 100;
			System.out.println( array[1] );
			
			array[0] = 200;
			System.out.println( array[0] );
			
			/*
			array[5] = 500;
			System.out.println( array[5] );
				ARRAY'S size is fixed
			*/
			
			
			
			
			int[] array2;
	//		System.out.println( array2[0]);	//Array size must be initialized
			
			Scanner scan = new Scanner(System.in);	
				int[] Inputs = new int [5];		
					// in this aray we can store 10 elements, hishest index num is 9
				
				for (int i = 0; i < Inputs.length; i++) {
					System.out.println("Enter a number");
						Inputs[i] =	scan.nextInt();
				}
			
				for(int i = 0; i<Inputs.length; i++) {
					System.out.print( Inputs[i]+" ");
				}
			
			String[] AllStudentsNames = new String[358];
			
			//		this mew keyword in array is used to give the size of the array
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
	}
}
