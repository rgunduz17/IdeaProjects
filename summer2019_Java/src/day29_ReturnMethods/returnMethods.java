package day29_ReturnMethods;

public class returnMethods {
	/*
	 access-modifier specifier   returnType   methodName(parameters){
	 		statements;
	 }
	 */
	
	public static void main(String[] args) {
//		return type: void
		method1();

//		 return methods are either
//		  printed or assigned to the variable
		System.out.println( name() );
		
		String str = name();
		System.out.println( str );
	}
		
	public static boolean yesnt(){
		return 8>9;
	//  return true;
	}
	
	
//	 	if return type is void:
		public static void method1() {
			System.out.println("Hello");
			return;
		}
		
//	 	if the return type of the method is not void:
		public static String name() {
			return "Batch18";
//			System.out.println();
//			return exits the method after execution
		}

}
