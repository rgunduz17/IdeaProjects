package day34_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUp {
	/*
	Warm up:
    1. write  a return method that can remove duplicates from a string
        Ex: RemoveDup("abcabc") ==> returns "abc";
    
    2. write a return method that accepts two parameter Strings a and b, and returns the total numbers of apperence of b in String a
        Ex: count("abcaba")  ==> returns 3 ;
    
    3. use the above two methods to write a new method that can find the frequency of characters
        Ex: frequency("aabcabcabc") ==>a4b3c3
    
    4. write a return method that can find the maximum number from an Integer arrayList   (DO NOT use sort methods of Collections class)
    
    5. write a return method that can find the minimum number from an Integer arrayList     (DO NOT use sort methods of Collections class)

	 */
	
	
	
	public static void main(String[] args) {
		// task01
		String a = RemoveDup("abcabcdefdef"); // abc
		
		System.out.println(a);
		System.out.println( RemoveDup("abcabcdefdef") );
		
		// task02
		int count = count("abcabcdefdef", "a");
		System.out.println(count);
		
		System.out.println( count("abcabcdefdef", "a") );
	
		
		System.out.println( frequency("abcabcaabbcccc") );
		
		
		// task04
		ArrayList<Integer> list = new ArrayList<>();
				list.add(100);
				list.add(20);
				list.add(0);
				list.add(30);
		
		int maxnum = max(list);
		System.out.println(maxnum);
		
		int minnum = min(list);
		System.out.println(minnum);
	}
	
	
	// task01
	public static String RemoveDup(String str) {
									//"abcabc"
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			if( !result.contains( str.substring(i, i+1) ) ) {
				result += str.substring(i, i+1);
			}
		}
		
		return result;
	}
	
	
	// task02
	public static int count(String a, String b) {
								// abab			a ==> 1
								// bab			a ==> 2	
		
		int num = 0; // to count how many times 'b' appears in 'a'
		
		while( a.contains(b) ) {
			num++;
			a = a.replaceFirst(b, "");
		}
		
		return num;
		
	}
	
	
	// task03
	public static String frequency(String str) {
								// "abcabcabc"  ==> a3b3c3
		
		
		String nonDup = RemoveDup(str); //"abc"
		
		String result = ""; // to store the expected result
		
		for(int i=0; i<nonDup.length(); i++) {
				int count = count(str, ""+nonDup.charAt(i) );
				result+= ""+nonDup.charAt(i)+ count;
		}	
		
		return result;
	}
	
	
	
	
	// task04
	public static int max( ArrayList<Integer> list) {
		int max = Integer.MIN_VALUE; 
		
		for(int each: list) {
			if( each > max ) {
				max = each;
			}
			
		}
		
		return max;
	}
	
	
	// task05
	public static int min( ArrayList<Integer> list ) {
		int min = Integer.MAX_VALUE;
		
		for(int each: list) {
			if(each<min) {
				min = each;
			}
		}
		
		return min;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
