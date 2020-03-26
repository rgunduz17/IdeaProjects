package day21_whileLoops;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true){
		
			System.out.println("Enter first number");
			int a = scan.nextInt();
			System.out.println("Enter your second number");
			int b = scan.nextInt();
			
			System.out.println("addition is: "+(a+b));
			
			System.out.println("Do you want to contiue?");
			String answer = scan.next();
			if(answer.equalsIgnoreCase("no")) {
				break;
			}else if(!answer.equalsIgnoreCase("no")) {
				System.out.println("Incorect answer");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
