package day43_JavaRecap;

import day43_JavaRecap.staticKeyword;


public class Practice {

	public static void main(String[] args) {

				
		staticKeyword.printName(); //Nurzat 
		// static method can be called through class name

		
		//staticKeyword.printName(); 
			//instance methods can not be called through class name

		Practice.printName(); //Semra
		
		printName(); //Semra
	
		
		System.out.println( staticKeyword.StaName );
		//static variables can be called through class name
		
	//	System.out.println( staticKeyword.StaName.InsName );
			//instance variables belong to the object, cannot be called through class name 
		
		staticKeyword obj = new staticKeyword();
			obj.printName2(); 
			// in order to call non static, we must create an object
	
	
	
	
	}
	
	
	public static void printName() {
		System.out.println("Semra");
	}
	
}
