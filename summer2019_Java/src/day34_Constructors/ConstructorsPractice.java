package day34_Constructors;

public class ConstructorsPractice {

	//public sort() {} in constructor, the method name MUST be the same with the class name
	
	//default constructor
	
	public ConstructorsPractice(int a) {
		
		System.out.println("Hi i am constructor with parameter int: "+ a);
		
	}
		
	
	public static void main(String[] args) {
	
	//	ConstructorsPractice obj = new ConstructorsPractice(); does not exist
			
		// constructor method is given by default when there is no othr constructor
		
		
	//	ConstructorsPractice obj2 = new ConstructorsPractice("Hello");
			// we don't have constructor that passes String parameter
		
		
		method1();
		
	//	ConstructorsPractice(10);
		
		
		ConstructorsPractice obj3 = new ConstructorsPractice(10);
				// Constructors executution ALWAYS depends on the creation of object
		
		
		method2();
	}
	
	public static void method1() {
		System.out.println("Regular method");
	}
	
	public static void method2() {
		ConstructorsPractice obj4 = new ConstructorsPractice(10);
		method1();
	}
	
}
