package day59_Exceptions;

import java.util.NoSuchElementException;

public class Multi_Catch_Blocks {

	
	public static void main(String[] args) {
		/*
		try {
		System.out.println(9/0);
		}catch(RuntimeException e) {
			System.out.println("Arithmetic exception");
		}catch(ArithmeticException e) {
			
		}
		Multi-catch block CONDITION: parent exception block must be after its sub exception block
		*/
		
		
		/*
		try {
			
		}catch(ArithmeticException e) {
			
		}catch(ArithmeticException e) {
			
		}
		
		Conflicted
		*/
		
		
		int[] arr = {1,2,3};
		
	try {	
		System.out.println(arr[100]);
		
	}catch(NullPointerException e) {
		System.out.println("Null pointer eception");
		
	}catch(ClassCastException e) {
		System.out.println("Class cast exception");
		
	}catch(NoSuchElementException e) {
		System.out.println("No such element exception");
		
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index out of bound");
		
	}catch(IndexOutOfBoundsException e) {
		System.out.println("Index out of bound exception");
		
	}
	
	
	System.out.println("============================================");
	
	try {
		System.out.println(11/0);
		
	}catch(ArithmeticException e) {
		System.out.println("Arithmetic");
		
	}catch(ClassCastException e) {
		System.out.println("Class cast");
		
	}catch(RuntimeException e) {
		System.out.println("Run time");
		
	}catch(Exception e) {
		System.out.println("Exception");
		
	}
	
	System.out.println("Hello");
	try{
		System.out.println(10/0);
	}catch(Exception e) {
		//code here
		System.out.println("Unexpected event occured at line 78");
	}
	
	System.out.println("World");
	System.out.println("Test completed");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	}
	
	
}
