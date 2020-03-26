package day20_JavaRecap;

import java.util.Scanner;

public class warmUp3 {
	/*
	 4. write a program that asks user to enter number 5 times:
	 	2. find the maximum number and the minimum number
	 */
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int max = -99999999;
	
	for(int i = 1; i<=5; i++) {
		System.out.println("Enter a number");
		int inputNum = scan.nextInt(); // 1 , 2 , 3 , 4 , 5
		if(inputNum > max) {
			max= inputNum;
		}
	}
	System.out.println("max value is: "+max);
	
	
	
	}
}
