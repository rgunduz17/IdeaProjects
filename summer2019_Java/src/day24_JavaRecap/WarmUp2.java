package day24_JavaRecap;

public class WarmUp2 {

	/*
		3. write a program that return the minimum value from an int array
	
		4. write a program that return the second minimum valye from an int array
	 
	 */
	
	public static void main(String[] args) {
		int arr[] = {100, 2, 2, 3, 4, 5, 6, -1, -2};
				int min = 99999999;
		for (int i = 0; i< arr.length; i++) {
			// highest num of i : i<9 ==>8 (8 i s the highest index num)
			
			if(arr[i] < min) {
				min=arr[i];
			}
		}
		
		System.out.println("minimum number is: "+min);
		
				int secmin = 0;
		
		for (int j = 0; j< arr.length; j++) {
			if(arr[j]< secmin && arr[j] != min) {
				secmin = arr[j];
			}
		}
		System.out.println(secmin);
		
		
		
		for(int i = 0; 0<1;) {
			System.out.println("kwah-");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
