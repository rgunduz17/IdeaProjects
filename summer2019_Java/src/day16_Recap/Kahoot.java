package day16_Recap;

public class Kahoot {

	public static void main(String[] args) {
		
	// Q1:
		/*
			int Batch =12;
			
			switch (Batch) {
			case 014:
				System.out.println("Cybertek");
				break;
			case 12:
				System.out.println("Best");
			default:
				System.out.println("Batch");
			
			}
		*/
		// 0324
		
	// Q8:
		int x = 5, y=19;
		
		int num = y-x>x-y? y-x: x-y;
			
		System.out.println(num);
		
	// Q9:
		
		int sum =2, price =100;
		
		sum *= price >= 100? price *=2: price;
		// true? price=price*2
		//  sum *= 200       ==> 400
		
		System.out.println(sum+" "+price);
			
	// Q10:
		
		//boolean opt=true; // can't use boolean
		String opt="true";
		
		switch (opt) {
		/* 		
		case true:<<<this is not a String
			
			System.out.println("True ");
		*/
		case "true":
			System.out.println("True ");
			
		}
		System.out.println("Done");
			
	// Q6:
		float f1 = (12_345.1 > 123_45.0)? 12456 : 12456.02f;
		//			 12345.1 > 12345.0  ? 12456 : 12456.02f;
		
		// 12456 + 1024 = 13480.0 > 13480
		
		/*
		 in accounting : 1,000,000,000
		 in java: 1_000_000_000
		 
		 
		 */
		
		int money = 123123;
		
		float f = 100.5f;
		
		
		
	// Q8:
		int i = 10;
		int j = 20;
		int k = j += i/5;
		//	k = j += 2;
		//		j += 2 ==> j= j+2 = 22
		//k = 22
		
		System.out.println(i+" "+ j+" "+ k);
		
		
	//Q9:
		byte B =1;
		switch (B) {
		case 1:
			System.out.println("One");
			
		case 2:
			System.out.println("Two");
		}
		
	// Q10:
		int z = 10;
		switch (z) {
		
		case 10: System.out.println("Monday");
		case 11: System.out.println("Tuesday");
		
		default: System.out.println("Friday");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
