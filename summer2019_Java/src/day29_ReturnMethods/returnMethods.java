package day29_ReturnMethods;

public class returnMethods {
	/*
	 acces-modifier specifier returnType name(parameters){
	 		statements;
	 }
	 */
	
	public static void main(String[] args) {
		
		name(); // this is a String value
	//	"z"
	
		System.out.println( name() ); // return methods are either printed or assigned to the variable
		
		String str = name();
		
		System.out.println( str );
		
		
	}
		
	public static boolean yesnt(){
		return 8>9;
	//  return true;
	}
	
	
	// if return type is void:
		public static void method1() {
			System.out.println("Hello");
			return;
		}
		
	// if the return type of the method is not void:
		public static String name() {
			return "Batch12";
		//	System.out.println(); return exits the method after execution
			// once return statement is executed it exits the method immediately
		}

}
