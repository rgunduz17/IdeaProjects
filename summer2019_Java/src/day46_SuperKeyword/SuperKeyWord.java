package day46_SuperKeyword;

class A{
	String name = "Madina";  // instance variable
	
	public void methodA() { } // instance method

	public A(int a) { }      // constructor
}
public class SuperKeyWord extends A{
		//		sub				  super

	public SuperKeyWord(int a) {
		super(10); //calling constructor from super class
	}
	public void  method() {
		super.name = "Mahir"; // calling instance from super class
		super.methodA();	  // calling instance method from super class

		this.name = "Ihsan";  // calling instance from the class
		this.methodA();		  // calling instance method from the class
	}
}


//		super. : used for calling instances
//			(instance variable and methods) from the super class
//				super keyword can only be used in the subclass

//		super() : used for calling constructor from the super class
//					constructor from super class MUST be called in sub class.
//						super class' default constructor is called in the sub class by default.


//		super.  VS  this.  :
//					this.  : used for calling the instances from the class itself
//								to use this. , we do not need inheritance
//					super. : used for calling the instances from the super class
//								to use super. , we MUST have super class and sub class

//		super()  VS  this()  :
//					 this()  : used for calling the constructor from the class itself
//								to use this() , we do not need inheritance
//					 super() : used for calling the constructor from the super class
//								to use super. , we MUST have super class and sub class


//		All the rules of the CONSTRUCTOR:
//			CONSTRUCTOR: Special method, belongs to the object.
//					1. Every class MUST HAVE constructor.
//						if there is not any, will be given by default
//					2. Constructor method CANNOT have return-types or specifier
//						return types: primitives, wrapper class, objects ...
//						specifiers: final, static, abstract ...
//					3. Constructor's name MUST be same with the ClassName
//					4. Constructor's execution depends on the creation of the object
//					5. Constructor can ONLY be called in other constructor.
//						(methods or blocks cannot call constructor)
//					6. Constructor CANNOT be called by constructor name,
//						MUST be called with this or super keyword.
//							this(): calls the class' constructor
//							super(): calls the super class' constructor
//					7. Constructor CANNOT call or contain itself
//					8. Constructor CANNOT call more than one constructor
//					9. Constructor call MUST be first in the code block
//					10. Class' object MUST  be created with existing and visible constructor
//					11. Super class' default constructor is called in sub class by default
//					12. At least one of the super class' constructors MUST be called in sub class.
//					13. Constructor can be overload


