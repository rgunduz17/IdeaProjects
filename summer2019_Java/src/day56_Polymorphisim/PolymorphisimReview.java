package day56_Polymorphisim;

class A{
	
	protected void methodA() {
		System.out.println("method A from A class");
	}
	
	public static void methodC() {
		System.out.println("method C from A class");
	}
	
}

class B extends A{
	public void methodB() {
		System.out.println("method B");
	}
	
	@Override
	public void methodA() {
		System.out.println("method A from B class");
	}
	
	public static void methodC() {
		System.out.println("method C from B class");
	}
	
	
}

public class PolymorphisimReview {

	public static void main(String[] args) {
		A obj = new A();
		
		A obj2 = new B(); // IS A relationship
			obj2.methodA();
		//	obj2.methodB();
			
		//	B obj3 = new A(); //child class can not be the reference to parent class 

			
		//	C onj4 = new C(); // abstract class is not concrete
			
			C obj5 = new D();
			
			E obj6 = new D();


			
		//	D obj7 = new E(); // we cannot create object from interface 
			
		//	C obj8 = new E(); // we cannot create object from interface 
			
		//	E obj9 = new C(); // abstract class is not concrete
			
		//	E obj10 = new F();
			
			A obj11 = new B();
			obj11.methodA();	// from B class will be executed if it is overridden
		// if a method is exist in both reference type and object, the overridden one gets executed
			
			obj11.methodC();
			// if the method is not being overridden, then reference type method gets executed
	}
}



abstract class C{
	
}

class D extends C implements E{
	
}


interface E {
	
}

abstract class F implements E{
	
}




































