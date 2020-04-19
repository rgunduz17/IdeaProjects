package day52_Interface;

public interface InterfaceIntro {


	// public InterfaceIntro() { }
	// no object instances ==> no constructors,
	
	// public void methodB() {}
	//  no instance methods

	// default methods
	public default void methodC() {
		
	}
	
	public abstract void methodA();
	
	public static void mm() {
		
	}
	
		int a =100; // public static final by default

	// public static final by default
		   public static final int b = 200;
	
		// public protected int num = 100;
		
	public static void main(String[] args) {
		InterfaceIntro.mm();
		
		System.out.println(a); // variables are static by default  
		//a = 200; // variables are final by default
	}
	
}

interface Data{
	
	
}

class Test implements InterfaceIntro, Data{
//	  subtype			supertype,	  supertype
	
	@Override
	public void methodA() {
			
	}

	
}

/*
class A{
	
}

class B extends A{
	
}
*/

//		two ways to achieve abstractions:
//				1. Abstract
//				2. Interface

//		INTERFACE:  blueprint of class, but its not a class
//					we can store abstract methods,
//							and let classes implement abstract methods
//					interface is meant to be implemented
//					We cannot create object from interface or abstract class
//							because object needs to be concrete
//					abstract methods cannot be overridden in interface,
//							because there is no instance method in an interface


//      Declaration of interface:
//				public   interface  interfaceName { body of interface }



//		implements keyword: we use the implements keyword
//								to implement abstract class

//		advantages of interface: A class can implement multiple interfaces
//								 A class can extends one class only

// 		what we can in interface:
//					methods:  abstract methods, static methods, default methods
//							  abstract keyword given by defaults for methods in interface
//							  public access modifier given by default
//					variables: public static final given by default


//		what we cannot in interface:
//					1. Constructors ==> no class name, no constructors
//					2. Instance methods ==> no object creation
//					3. Instance variables  ==> static keyword given by default
//					4. Instance block, static block


//		Interface_VS_AbstractClass obj = new Interface_VS_AbstractClass();
// 				interface is not a class.
// 				Abstraction is not concrete

//  	Abstract Class VS Interface:
//  		both can have abstract methods,
//  		both cannot create object from them
//			both cannot be final

//		Abstract Class: meant to be extended to the regular class, extends keyword
//				methods: abstract and all non abstract methods
//				variables: any variables
//				blocks: both instance and static block
//				sub class can only extend one abstract class

//		Interface: meant to be implemented, implements keyword
//			methods: we can only have abstract , static and default methods
//			variables: public final static ==> given by default
//			blocks: cannot have any blocks
//			subtype can implements multiple interfaces (supertype)


//		Extends VS Implements keyword:

//			extends: a class can be extended by multiple classes
//					 a class can extend only one class
//					class extends class
//					interface extends interface

//			implements: only used for interface to be implemented to the class
//						can implement as many interfaces as we want
//						class implements interface

// 			we can use extends and implements at the same time
//			class extends class implements interface/S