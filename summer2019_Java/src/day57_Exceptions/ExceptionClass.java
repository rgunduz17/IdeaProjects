package day57_Exceptions;

public class ExceptionClass {

	// exception
	
	public static void main(String[] args) throws InterruptedException {
		
		int[] arr = {1,2,3};
		
		System.out.println( arr[100] );
		
		
			Thread.sleep(1000);
			
		System.out.println("Done");	
		
	}
	
}
