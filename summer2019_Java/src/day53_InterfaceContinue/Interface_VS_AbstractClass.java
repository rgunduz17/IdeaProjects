package day53_InterfaceContinue;

public interface Interface_VS_AbstractClass {

	// Access-modifier className(){}
	
	// public Interface_VS_AbstractClass() {}
	//public void mm(){}
	
	static int num = 300;
	
	//static {}
		// variables in interface are static and final variables can not be reassigned
	
	
	
	public abstract void method1();
	public abstract int method2();
	
	 void method3(); // public
	 void method4(); // public
	
	public default void mm() {
		// predicate
	}
	
	
	// protected abstract void method5();
	// public protected abstract void method5();
	
	int a = 10; // public
	// final final static int a;
	
	public static void main(String[] args) {
		System.out.println(a); //static only accepts static
		
		System.out.println( Interface_VS_AbstractClass.a );
		
//		Interface_VS_AbstractClass obj = new Interface_VS_AbstractClass(); 
			// interface is not a class. 
			// Abstraction is not concrete	
	}
	
	
	
	
	
}

class Test implements Interface_VS_AbstractClass{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int method2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}
	
}
