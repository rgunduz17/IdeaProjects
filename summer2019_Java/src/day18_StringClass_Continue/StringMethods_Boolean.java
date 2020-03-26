package day18_StringClass_Continue;

public class StringMethods_Boolean {
	public static void main(String[] args) {
	/*
	 isEmpty(); checks if the String is empty, 
	 			and returns boolean expressions
	 			empty => true, !empty ==> false
	 */
	
	String str = "Cybertek";
		boolean R1 = str.isEmpty(); // false
		System.out.println(R1);  // false
			
		String str2 = "";
		if(str2.isEmpty()) {  
			// true
			System.out.println("it's empty String");
		}else {
			System.out.println("It's not empty");
		}
		
	
		/*
		 equals(str); checks if the two Strings face values
		 			  are equal or not, then returns boolean expression
		 			  
		 			  equal ==>true !equal ==> false
		 			  
		 			  
		 */
				String A1 = "Cybertek"; // string literal in string pool
				String A2 = new String("Cybertek"); // in java heap 
				System.out.println(A1==A2); // false
				
					boolean R2 = A1.equals(A2);
					System.out.println(R2);
		
					System.out.println("java".contentEquals("Java")); 
							// false because Java is case sensitive
					
					/*
					 equalsIgnoreCase(str);checks if the two String visible
					 text are equal or not, then returns boolean expression
					 		case sensitivity does not matter
					 		
					 		
					 		
					 */
					
					String s1 = "JAVA";
					String s2 = new String ("java");
					System.out.println(s1==s2); // false
					System.out.println(s1.equals(s2)); // false, case sensitivity
					System.out.println(s1.equalsIgnoreCase(s2)); // true, ignores case sensitivity
						
	
					/*
					 contains(str); checks if the str is contained in the String 
					 or not, then returns boolean expression
					 
					 contained ==> true		!contained ==> false
					 
					 
					 */
					
					String name = "Muhtar";
					boolean Result = name.contains("ABC"); // false
					System.out.println(Result);
					
					String name2 = "Marufjon";
					System.out.println(name2.contains("m")); // false, case sensitivity
					
					
					/*
					 startsWith("str"); checks if the String is started with 
					 the str or not, then returns boolean expression
					 
					 startedwith ==> true		!startedwith ==> false
					 
					 */
					
				String Today = "Java";
					boolean Result2 = Today.startsWith("J"); // true
					System.out.println(Result2);
					
					
				String names = "Cybertek School is great place to learn java";
				
				System.out.println(names.startsWith("Cybertek School")); // true
					
				
				/*
				 endWith(str); checks if the String is ended with 
					 the str or not, then returns boolean expression
					 
					 endedwith ==> true		!endedwith ==> false
					 
				 */
					
				String B1 = "Muhtar";
				System.out.println(B1.endsWith("r")); // true
				System.out.println(B1.endsWith("M")); // false	
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
	
	
	}
}
