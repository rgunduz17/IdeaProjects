package day45_Inheritance;

class Data{
	
	public String name;	// has public access modifier
	private String age; // has private access modifier
	String ID;			// has default access modifier
	protected String DOB;//has protected access modifier
	
	public void Hello() { //public access modifier
		System.out.println("Hello");
	}
	
	private void Hola() { // private access modifier
		System.out.println("Hola");
	}
	
	void Aloha(){ //default access modifier
		System.out.println("Aloha");
	}
	
}

public class MultiClassPractice {

	public static void main(String[] args) {
		
		Data obj = new Data();
		System.out.println( obj.name ); // public is visible at everywhere
	 //	System.out.println( obj.age ); // private is not visible outside the class
		System.out.println( obj.ID ); // default access modifier is visible to
											// the classes in the same package
		/*
		  if those two classes were located in two different packages,
		  then the default access modifier is not gonna be visible
		 */
		
		obj.Hello();
	//	obj.Hola();  //has private access modifier
		obj.Aloha();
		
	}
}
