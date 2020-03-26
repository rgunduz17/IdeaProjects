package day24_JavaRecap;

import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
    /*
     ask user to enter five numbers,  then find the sum of 
     those five numbers.
     
            MUST use Array
     
     */
        int[] numbers = new int[5];
        Scanner scan = new Scanner(System.in);
        
        for(int i= numbers.length -1 ; i >= 0; i--) {
            System.out.println("Enter a number");
                numbers[i] = scan.nextInt(); 
                // assign user inputs to the Array's indexes
        }
        
        
        
        for(int i=0; i < numbers.length; i++) {
                System.out.print(numbers[i]+" ");
        }
        
        System.out.println();
        
        
        /*
         ask user to enter 5 names. then return the longest name 
         
         */
        
        String[] names= {"Seyfo", "Asiya", "Myra", "Keteryna", "Daulet", "vladislav zakharovich skorobogotko"};
		
        String LongestName = "";
        
        int max = 0;
		for (int i = 0; i < names.length; i++) {
			if(names[i].length() > max) {
				max = names[i].length();
				LongestName = names[i];
			}
		}
		
		System.out.println(max);
		System.out.println(LongestName);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
