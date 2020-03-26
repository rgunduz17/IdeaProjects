package day45_Inheritance;

class Data{
	
	public String name;
	private String age; // only visible within the same class
	String ID;
	protected String DOB;
	
	public void Hello() { //public
		//Hola();
		System.out.println("Hello");
	}
	
	private void Hola() { // private
		System.out.println("Hola");
	}
	
	void Aloha(){ //default
		//Hola();
		System.out.println("Aloha");
	}
	
}

public class MultiClassPractice {

	public static void main(String[] args) {
		
		Data obj = new Data();
		System.out.println( obj.name ); // public is visible at everywhere
	 //	System.out.println( obj.age ); // private is not visible outside the class
		System.out.println( obj.ID ); // default access modifier is visible to the classes in the same package
	
		/*
		  if those two classes were located in two different packages,
		  then the default access modifier i not gonna be visible
		 */
		
		obj.Hello();
	//	obj.Hola();
		obj.Aloha();
		
	}
	
}
