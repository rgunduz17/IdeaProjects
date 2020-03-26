package day46_SuperKeyword;

class A{
	
	String name = "Madina";
	
	public void methodA() {
		
	}
	
	
	public A(int a) {
		
	}
	
}


public class SuperKeyWord extends A{
		//		sub				  super
	
	public SuperKeyWord() {
		super(0); // Super class constructor MUST be called in the sub class
	}
	
	
	
	/*
	public SuperKeyWord(int a) {
		super(a);
	}
	*/
	
	/*
	 	String name = "Madina";
	 */
	
	
	public void  method() {
		super.name = "Mahir";
		this.name = "Ihsan";
		super.methodA();
		this.methodA();
	}

}
