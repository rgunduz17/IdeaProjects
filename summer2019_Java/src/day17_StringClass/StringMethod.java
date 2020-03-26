package day17_StringClass;

public class StringMethod {

	public static void main(String[] args) {
	//==
		
		String str1 ="Hello Javengers";
		String str2 ="Hello Javengers";
		boolean R1 = str1==str2; // true
		System.out.println(R1);
		
		String str3 = new String("public pool");
		String str4 = new String("public pool");
		boolean R2 = str3==str4; // false
		System.out.println(R2);
		
		boolean R3 = str1==str3;// false
		System.out.println(R3);
		
		/*
		 Methods: 
		 	1. concat, 2. Length, 3. charAt, 4. toUpperCase, 
		 	5. toLowerCase
		 	
		 */
		
		/* concat(str); it takes String, combines with another,
		and returns as a new String value
		
		*/
		String a ="Cybertek";
			a.concat(" School");// "Cybertek School" but doesn't change value of a
		System.out.println(a);
			a=a.concat(" School"); // a= "Cybertek School"
		//	a="Cybertek School";
		System.out.println(a);
		
		String A="hello", B= "hello ";
		System.out.println(A==B); // false, different values
		
		String C="Hello", D="hello";
		System.out.println(C==D);// false, case sensitivity
		
		/*
		 lenght(): it returns the total number of the characters as an int value
		 
		 */
		String LongName="ABCDEFGHIJKLMN";
			int num = LongName.length();
			System.out.println(num);
			
		
		/*
		 charAt(indexnum); it returns the character value of index num as a char value
		 
		 */
		String name1 = "Muhtar";
		// index:		012345	
		char ch = name1.charAt(5);
		System.out.println(ch);// r, index 5 is r
		
		/*
		 toUpperCase(); converts the Strings value to upper case, 
		 				and returns it as New String value
		 
		 
		 toLowerCase(); converts the Strings value to upper case, 
		 				and returns it as New String value
		 */
		String name2="cybertek";
			name2=name2.toUpperCase();
		System.out.println(name2);// CYBERTEK
		
		String name3="CYBERTEK";
			name3=name3.toLowerCase();
		System.out.println(name3); // cybertek
		
		
		/*
		 trim(); it's used for removing the unused spaces
		 	
		 */
		String s1="              hello                  ";	
			s1=s1.trim();
		System.out.println(s1); // "hello"
		
		String s2="Cybertek        School";
			s2=s2.trim();
		System.out.println(s2);// "Cybertek        School" space is not removed because it's contained within words
		
		String s3="   ";
			s3=s3.trim();
		System.out.println(s3);

		String s4="        Cybertek    School";
			s4=s4.trim();
		System.out.println(s4);// "Cybertek    School"
		
		/*
		 substring(beginning index); 
		 							it creates sub value of String from
		 							the beginning of the index till the last index
		 							returns it as a new String value
		 
		 
		 */
		String Str="Cybertek School";
		//			0123456789		
		
		Str=Str.substring(9); //School
		System.out.println(Str);
		
		String Adress = "Mclean Va 22000";
		String zipcode = Adress.substring(10);
		System.out.println(zipcode);
		
		
		/*
		 substring( beginning index, ending index);
		 			it creates the sub value of String from 
		 			beginning index till the ending index
		 			(end index num will be excluded)
		 			then returns it as a new String value
		 
		 */
		String Name="Hello Cybertek School"; 
		Name=Name.substring(6, 14); // "Cybertek"
		System.out.println(Name);
		
		String fullName="Cybertek School Batch12";
		
		String middleName=fullName.substring(9, 15); // School
		System.out.println(middleName);
		
		

		
		
		
		
		
		
	}
}
