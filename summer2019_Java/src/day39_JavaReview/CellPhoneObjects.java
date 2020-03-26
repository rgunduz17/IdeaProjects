package day39_JavaReview;

import java.util.Arrays;

public class CellPhoneObjects {
	
	public static void main(String[] args) {
	
		CellPhone phone1 = new CellPhone();
			System.out.println( phone1.brand ); // Iphone
			System.out.println( phone1.color ); // White
			System.out.println( phone1.model ); // 10
			System.out.println( phone1.price ); // 600.0
			System.out.println( phone1.screensize ); // 5.8
			
		CellPhone phone2 = new CellPhone("OnePLus", "6T", 6.41, "Black", 300);
			phone2.getInfo();
			
		CellPhone phone3 = new CellPhone("Nokia", "brick", 3, "Black", 20);
			phone3.getInfo();
		
		CellPhone phone4 = new CellPhone("Samsung", "Galaxy S10", 6.1, "GT-I7500", 700);
			phone4.getInfo();
		
		CellPhone[] phones = {phone1, phone2, phone3, phone4};	
			
		// brand of phone3:
		System.out.println( phones[2].brand );
		
		// get info of phone3:
			phones[2].getInfo();
		}
	
}
