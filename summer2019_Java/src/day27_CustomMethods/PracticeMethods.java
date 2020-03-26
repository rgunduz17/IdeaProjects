package day27_CustomMethods;

public class PracticeMethods {
	public static void main(String[] args) {	
	/*	String str = "abcabcabcDDDEEEFFFF";
		
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			if( ! result.contains( str.substring(i, i+1) ) ) {
				result+=str.substring(i, i+1);
			}
		}
		
		System.out.println(result);
		
	*/
	
		
		RemoveDuplicates("car car car");
		
		
	
	}
	
	public static void RemoveDuplicates (String a) {
	
	String result = "";
	for(int i = 0; i < a.length(); i++) {
		if( ! result.contains( a.substring(i, i+1) ) ) {
			result+=a.substring(i, i+1);
		}
	}
	
	System.out.println(result);
	}
	
}