package day34_Constructors;

public class ConstructorMethods {

//	declaration of constructor:
//	 		access-modifier className(){
//	 				statements;
//	 		}
	public ConstructorMethods() {
//		the method name MUST be the same with the class name
		System.out.println("I am a default constructor");
		
//		 there is no return type in constructor
	}
	public static void main(String[] args) {

//		ClassName 	objName = new       MethodName();
	ConstructorMethods obj = new ConstructorMethods();

//	Constructor method is given by default
//   	when there is no other constructor
}

	public ConstructorMethods(int num) {
		System.out.println("Hello World");
		System.out.println("I am a constructor with an argument of int: "+num);

	}
	
	public static void method1() {
		
		ConstructorMethods obj2 = new ConstructorMethods(8);
		
	}
	
	
}
