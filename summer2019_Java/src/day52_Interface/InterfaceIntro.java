package day52_Interface;

public interface InterfaceIntro {


	// public InterfaceIntro() { } // no object instances, no instance method
	
	// public void methodB() {}
	
	public default void methodC() {
		
	}
	
	public abstract void methodA();
	
	public static void mm() {
		
	}
	
		int a =100; // public static final
		
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
//	  subtype			superype,	  supertype
	
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