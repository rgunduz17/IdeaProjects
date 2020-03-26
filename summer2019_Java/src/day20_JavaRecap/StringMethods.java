package day20_JavaRecap;

import java.util.Scanner;

public class StringMethods {
	/*
		 methods: 
		 	substring, indexOf, lastIndexFo, replace, replaceFirst,
		 	equals, equalsIgnoreCase, contains, startsWith, endsWith,
		 	charAt, trim, length, concat, isEmpty, toUpperCase, toLowerCase
		 	 	
	 */
	public static void main(String[] args) {
		/*
		 substring:
		 			creating a sub value of the string
		 */
		
			String str ="Cybertek School"; // String literals
			
				str = str.substring(0,str.indexOf("k")+1);
		
				System.out.println(str); // Cybertek, String is immutable
		
			String str2 = "Cybetek School";
			 
				str2 = str2.substring(str2.indexOf("S"));
				
				System.out.println(str2);
		
		
		// index of returns the first occurred value's index number
				String s1 = "Java is a fun language, I Love java, java,";
			System.out.println(s1.indexOf("a"));//1
		
			System.out.println(s1.indexOf("ag"));//19
		
		// lastIndexOf(): returns the last occurred char's index num
			System.out.println(s1.lastIndexOf("a")); // 34
		
			System.out.println(s1.lastIndexOf("ava")); //38
			
			System.out.println(s1.indexOf("ava,")); // 32
			
		System.out.println("========================\n");
		//replace: replaces the old value with a new one
		String name = "Cybertek School Batch 12";
			int length = name.length();
			System.out.println(length);
			
			
			name = name.replace(" ", "");
			System.out.println(name.length());
		
			name = name.replace("e", "a");
			System.out.println(name);
		
			name = name.replace("School", "Family");
			System.out.println(name);
			
			System.out.println("========================\n");

		// replaceFirst(): replaces the first occurred old character with the new one
		
			String A1 = "Java is Fun, Java is object oriented";
				A1 = A1.replaceFirst("Java is o", "C++ is o");
				A1 = A1.replaceFirst("d, Java", "d, C++");
				
				System.out.println(A1);
		
			System.out.println("========================\n");
	
		/*
		==, equals, equalsIgnoreCase
		*/
			String R1 = "Cybertek";
			String R2 = new String("Cybertek");
		    String R3 = new String("cybertek");
			System.out.println(R1 == R2); // false, different location
						
			System.out.println(R1.equals(R2)); // true, visible text is same
			System.out.println(R1.equals(R3)); // false, case sensitivity
			System.out.println(R1.equalsIgnoreCase(R3)); // true, checks visible text, ignores case
		
			System.out.println("========================\n");

		System.out.println();				
		// trim(): removes the unused spaces
			String spaces ="            M             ";
				spaces=spaces.trim();
				System.out.println(spaces);
		
			String n1="       ";
				n1=n1.trim();
				System.out.println(n1.isEmpty());
			
			String n2="Tomorrow is going to be a great day ro do repl.its";
				n2=n2.trim();
				System.out.println(n2);
		
				n2=n2.replace(" ", "");
				System.out.println(n2);
		
				System.out.println("========================\n");

		//charAt(): returns a specific character from the String
				String c1="Cybertek";
				//		   01234567	
					char ch= c1.charAt(4); // 'r'
					
					System.out.println(ch);
		
					String c2="Please do more and more java practices tomorrow";
						char ch2 = c2.charAt( c2.lastIndexOf("w"));
						System.out.println(ch2);
						
						System.out.println("========================\n");

		//startsWith & endsWith: returns boolean, checks the starting and ending 
		
				String gmail = "cybertekSchool@gmail.com";
				boolean r = gmail.endsWith("@gmail.com");
				System.out.println(r);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please enter your gmail address");
		String gmailadress = scan.nextLine().toLowerCase();
		
		if (gmailadress.endsWith("@gmail.com")) {
			System.out.println("It's a valid gmail address");
		}else {
			System.out.println("Invalid gmail address");
		}
		
		System.out.println("========================\n");

		// starts with www.
		System.out.println("Enter a web address");
		String URL = scan.nextLine().toLowerCase();
		
		if(URL.startsWith("www.")&&URL.endsWith(".com")){
			System.out.println("It's a valid web address");
		}else{
			System.out.println("It's an invalid web address");
		}
		
		System.out.println("========================\n");

		// contains: checks if given value is contained in the String or not
			String salary = "$1000";
			boolean sign = salary.contains("$");
			System.out.println(sign); // true

			System.out.println("========================\n");

		// concat(): concats two String values
			String SchoolName = "Cybertek";
			SchoolName = SchoolName.concat(" School");
			System.out.println(SchoolName);
		
			String schoolName = "Cybertek" +1231; 
			// + concats any value to String"
			System.out.println(schoolName);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
