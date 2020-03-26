package day41_initializerBlocks;

public class Static_VS_Ins_VS_Cons {

	static {
		System.out.println("static block");	
		// static block execution does not depend on the object
		// executed as soon as the class is loaded, ONLY ONCE
	}
	
	{
		System.out.println("instance block");
		// instance block execution depends on the object
		// when the object is created, instance block runs first
	}
	
	public Static_VS_Ins_VS_Cons() {
		System.out.println("Constructor");
		// instance block execution depends on the object
		// when object is created, constructor runs after the instance block
	}
	
	public static void main(String[] args) {
		
		Static_VS_Ins_VS_Cons obj = new Static_VS_Ins_VS_Cons();
		Static_VS_Ins_VS_Cons obj2 = new Static_VS_Ins_VS_Cons();
		
		// constructor and instance block execution depends on the creation of object
	}
	
	
}
