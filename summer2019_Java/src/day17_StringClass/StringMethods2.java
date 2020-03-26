package day17_StringClass;

public class StringMethods2 {

	public static void main(String[] args) {
		
		/*
		 replace(old char, new char);
		 			replaces all the old char values with the 
		 			given new char value in the String and
		 			returns it as a new String value
		 		
		 */
		String str1="Java is fun Programming Language";
			str1 = str1.replace('a', 'e');
		System.out.println(str1);
		
		
		/*
		 replace(old str, new str);
		 		replaces all the old str values with the 
		 		given new str value in the String and
		 		returns it as a new String value
		 */
		
		String str2="Today is gonna be a great day to learn Java";
			str2=str2.replace("Today", "Tomorrow");
		System.out.println(str2);
		
			str2=str2.replace("Java", "");
		System.out.println(str2);
		
		
		
		/*
		 replaceFirst(old str, mew str); 
		 			it replaces the first occured old str with the new str
		 		
		 */
		String s1="Java is fun, Java is good";
			s1=s1.replaceFirst("Java", "python");
		System.out.println(s1);
		
		s1=s1.replace("is good", "iS Good");
		System.out.println(s1);
		
		
		String s2="Java is programming language, Java is Java";
			s2=s2.replaceFirst("Java is Java", "C# is Java");
		System.out.println(s2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
