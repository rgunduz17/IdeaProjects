package day34_Constructors;

public class ConstructorMethods {

	// happy birthday Madina and Parsa
	
	/*
	declaration of constructor: 
	 		access-modifier className(){
	 				statements;
	 		}
	 */
	
	public ConstructorMethods() {
		
		System.out.println("Hello World");
		System.out.println("I am a default constructor");
		
		// return "aaa"; there is no return type in constructor
	}
	
	public ConstructorMethods(int num) {
		System.out.println("Hello World");
		System.out.println("I am a constructor with an argument of int: "+num);
		
	}
	
	
	public static void main(String[] args) {

	//	ConstructorMethods obj = new ConstructorMethods("A");
						// object was not created with existing constructor
		
		ConstructorMethods obj = new ConstructorMethods( 8 );
		
		
		
	}
	
	
	public static void method1() {
		
		ConstructorMethods obj2 = new ConstructorMethods(8);
		
	}
	
	
}
