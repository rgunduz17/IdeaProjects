package day12_SwitchStatement;

public class warmUp {

	/*
	 declasre 3 numbers 
	 if n1 and n2 are equal
	 	=>n1&n2 are equal
	 	
	 if n2 and n3 are equal
	 	=>n2&n3 are equal 
	 
	 if n3 and n1 are equal
	 	=>n3&n1 are equal
	 
	 if all equal ==> all equal
	 
	 Do not use single if statement
	 
	 If none are equal, output should be none are equal
	 
	 
	 */
	
	public static void main(String[] args) {
		
		byte n1 = 11;
		byte n2 = 10;
		byte n3 = 12;
		
		
		if (n1==n2 && n2==n1) {
			System.out.println("all equal");
		}
		else if (n1==n2) {
			System.out.println("n1 & n2 are equal");
		}
			else if ( n2==n3) {
				System.out.println("n2 & n3 are equal");
			}
				else if (n3==n1) {
					System.out.println("n3 & n1 are equal");
				}
					else {
						System.out.println("none are equal");
					}
		
		
		// third
		
		int A=10, B=20, C=30;
		
		if ( A==B&&B==C ) {
			System.out.println("all are equal");
		}
		else {
			if (A==B) {
				System.out.println("A & B are equal");
			}
			else if ( A==C) {
				System.out.println("A & C are equal");
			}
			else if (B==C) {
				System.out.println("B & C are equal");
			}
			else {
				System.out.println("none are equal");
			}
		}
		
		System.out.println("=========================\n");
		
		/*
		 
		 60-70  => D
		 70-80  => C
		 80-90  => B
		 90-100 => A
		 0-59   => F
		 
		 */
		int grade=70;
		
	if (grade>=0&&grade<=100) {	
		if(grade>=60) {
			
			if (grade >=90) {
				System.out.println("A");
			}
			else if( grade>=80) {
				System.out.println("B");
			}
			else if (grade >=70) {
				System.out.println("C");
			}
			else {
				System.out.println("D");
			}
		}else {
			System.out.println("failed");
		}
	}		
	else {
		System.out.println("invalid number");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
