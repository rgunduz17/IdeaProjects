package day22_NestedLoop;

public class NestedLoop {

	public static void main(String[] args) {
	
	for (int z = 0; z < 5; z++ ) {	
		for(int i = 1; i <= 5; i++) {
			System.out.print(i+" ");

		}
		System.out.println();
	}
		
		
	/*
	 *****
	 *****
	 *****
	 *****
	 *****	
	 */
	
	int z =5;
	while(z>0) {	
		int i = 1;
		
		while(i<=5) {
			System.out.print("*");
			i++;
		}
		System.out.println();
		z--;
	}
		
	/*
	 		*
	 		**
	 		***
	 		****
	 		*****
	 		******
	 		*******
	 */
		System.out.println();
		for (int i=1; i<=7; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int A=1;
		while (A<=7) {
			for(int B = 1; B<=A; B++) {
				System.out.print("*");
			}
			
			System.out.println();
			A++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
