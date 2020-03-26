package day15_Scanner_StringClass;

public class StringClass {

	public static void main(String[] args) {
		
		String str="Cybertek";
		String A="Cybertek";
		String B="Cybertek";
		System.out.println(A==B); 
			// both String literals are stored at String pool
		
		String str2= new String("Cybertek");
		System.out.println(str==str2); 
			// different memory locations
		
		String str3 = new String("cybertek");
		System.out.println(str2==str3);
			// false
		
		String s1 = "cat";
		String s2 = "cat";
		System.out.println(s1==s2); // same memory location in String pool
		
		String s3 = new String("cat");
		String s4 = new String("cat");
		System.out.println(s3==s4); // different memory location
		
		System.out.println(s1==s4);
		
		
		String a="Batch12";
		String b="batch12";
		System.out.println(a==b); // false
		
		String c = new String("cybertek");
		String d = new String("Cybertke");
		System.out.println(c==d);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
