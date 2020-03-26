package day27_CustomMethods;

public class VoidMethod_WithArgument {

	/*
	 
	 methods with argument:
	 	
	 	access-modifier specifier return-type name(parameter){
	 
	 
	 	}
	 	
	 	parameters: any data-type
	 */
	
	public static void main(String[] args) {
	//	oddOrEven(); 
			// method is designed to take an argument. 
			// needs argument to perform task
		
	//	oddOrEven(8);
		// need to provide a value that can be assigned to the parameter of the method
		
		oddOrEven(50);
		
		int z = 100; // local variables must be initialized before we use it
		
		oddOrEven(z); // variable z's value will e assigned to parameter variable a
		// int z = 100;
		
	
	//	SumOfTwoNums(); // not enough info
			
	//	SumOfTwoNums(10); // still not enough info
		
		SumOfTwoNums(10, 20);
		
	
	}

	public static void SumOfTwoNums (int a, int b) {
		System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
	}
	
	
	
	public static void oddOrEven(int a) {
		if(a % 2 == 0) {
			System.out.println(a+" is an Even number");
		}else {
			System.out.println(a+" is an Odd number");
		}
		
	}




}
