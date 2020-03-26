package day20_JavaRecap;

public class warmUp1 {

	public static void main(String[] args) {
		/*
		1. find the sum of all the numbers between 1 to 1000
    	2. find the sum of all even numbers between 1 to1000
    	3. find the sum of all odd numbers between 1 to 1000

		 */
// Task01
		int sum1 = 0;
		for (int i = 1; i<=1000; i++) { // i: 1~1000
			sum1 += i;
		}
		System.out.println("sum of all nums: "+sum1);
		
		System.out.println("\n===============================================");
// Task02
		int sum2 = 0;
		for (int i = 1; i<=1000; i++) { // i: 1~1000
			if( i%2 == 0) {
				sum2 =+ i;
			}
		}
		/*int sum3 = 0;
		for (int i2 = 2; i2<=1000; i2+=2) {
			sum3+=i2;
		}
		
		System.out.println(sum3);
		
		*/
		System.out.println("sum of all even numbers: "+sum2);
		
		System.out.println("\n===============================================");
		
		
// Task03
		int sum3 = 0;
		for(int i = 1; i<1000; i++) {
			if(i%2!=0) {
				sum3 +=i;
			}
		}
		System.out.println("Sum of all odd numbers: "+sum3);
		
		int Sum3 = 0;
		for(int i=1; i<1000; i+=2) {
			Sum3 += i;
		}
		System.out.println("Sum of all odd numbers: "+Sum3);
		
		
		
		System.out.println("\n===============================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
