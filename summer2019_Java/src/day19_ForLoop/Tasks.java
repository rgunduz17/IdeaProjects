package day19_ForLoop;

public class Tasks {

	public static void main(String[] args) {
		
		
// Task01:
		 
		/*
		for(int i = 1; i <=100; i++) {
			System.out.println("the square of "+i+" is "+(i*i));
		}
		*/
//Task02: display all even number from 1 to 32
		
		for(int i =1; i<=32; i++) {
			if(i%2 ==0) {
			System.out.print(i+" ");
			}
		}
		System.out.println("\n==============================");

//Task03: display all odd numbers from 1 to 32
		
		for(int i =1; i<=32; i++) {
			if(i%2 ==1) {
			System.out.print(i+" ");
			}
		}
		
		System.out.println("\n===============================================");
		
		String str = "Java";
		//			  0123
		//			 "avaJ"
		
		String Reversed ="";
		for(int i=str.length()-1; i>=0; i--) {
			Reversed += str.charAt(i);
		}
	
		System.out.println(Reversed);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
