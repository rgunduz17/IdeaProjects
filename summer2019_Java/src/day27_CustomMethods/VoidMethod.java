package day27_CustomMethods;

public class VoidMethod {


//	  	declaration of method:
//	  	access-modifier	specifier	return-type  	methodName(){
//	  			statements;
//	  	}
//

	
	public static void main(String[] args) {
		
		myFirstMethod();
//		method is grouping a series of statements
//		to perform specific task benefits: reusable
		even1To100();
	}
	
	
	public static void even1To100() {
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.print(i+" ");
			
		}
	}
	
	
	
	public static void myFirstMethod() {
		
//		public static void main(String[] args) {}
//			 methods must be declared within the class
		System.out.println("Hello World");
	}
	
	
//		NOTE: void does not accept RETURN keyword
//			  CANNOT use with (Int/String etc) return types
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
