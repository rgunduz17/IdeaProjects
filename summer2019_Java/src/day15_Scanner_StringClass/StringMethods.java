package day15_Scanner_StringClass;

public class StringMethods {

	public static void main(String [] args) {
		

//		1. charAt(index):

		String str="Cybertek";
//	 	index num:	01234567
		System.out.println(str.charAt(4));
		
			char ch= str.charAt(4);
			
			System.out.println(ch);
		
		String str2 = "Mu htar";
		//			   0123456
		
		System.out.println(str2.charAt(2));
		
		
//	 	2.length():
		
		String name= "Donald J Trump";
		System.out.println(name.length());

		//int n = name.strip().length();
		
//	 	3. concat():
		String s1 = "Cybertek";
		
		s1.concat(" School");
//		 attempt to modify String s1
		System.out.println(s1);
//		 String is immutable, Cybertek will be printed
		s1 = s1.concat(" School");
		System.out.println(s1);
//		 Cybertek School
		
		
//	 	4. toUpperCase():
//	 	converts to upper case

		String N= "cybertek";
		System.out.println(N.toUpperCase());


		
		N=N.toUpperCase();
		System.out.println(N); // CYBERTEK
		
		
//	 	5. toLowerCase():

		String name1 = "ABDURAHMAN";
		System.out.println(name1.toLowerCase());

		// "ABDURAHMAN" String is immutable
		
		name1= name1.toLowerCase();
		System.out.println(name1);
		
		
		 /*
	     charAt(index) ,  length(), concate(Str), toUpperCase(), toLowerCase()
	     */
	            
	                String a = "Batch 12 Javengers";  // 18 characters
	                // index:   0123456789 .....    
	                
	                    System.out.println( a.charAt(9) );
	                    
	                        char ch1 = a.charAt(11);
	                System.out.println(ch1);
	                /*
	                 charAt() methods extracts a specific character for them String,
	                 and returns it as char value
	                 */
	                
	                
	                int Length = a.length();
	                System.out.println(Length);
	                
	                int HighestInexNum = a.length()-1;
	                System.out.println(HighestInexNum);
	                /*
	                    length() method returns the total number of 
	                    character in the String as an int value
	                 */
	                
	        
	                String b="Cybertek";
	                    b.concat(" Batch12 Javengers"); 
	                        // "Cybertek Batch12 Javanger"
	                
	                System.out.println(b); //"Cybertek" ,   STring is immutable
	                
	                String c = b.concat(" Batch12 Javengers"); 
	                System.out.println(c);
	                    
	                b = b.concat(" Batch12 Javengers"); 
	                            // "Cybertek Batch12 Javengers"
	                System.out.println(b);
	                
	                /*
	                 concat() method concats the value to the variable' value 
	                 and then returns a NEW String value
	                 */
	                
	                
	                String d = "book";
	                
	                System.out.println( d.toUpperCase() );
	                
	                System.out.println( d ); //book
	                
	                    d = d.toUpperCase();
	                    
	                    System.out.println(d);  // BOOK
	            
	            /*
	             toUpperCase() method converts the String value to 
	             upper case and returns it as a NEW String
	             
	             */
	                    
	            
	            String e ="JAVA IS FUN";
	                 e.toLowerCase(); // "java is fun"
	                System.out.println(e); // JAVA IS FUN
	                
	            String f = e.toLowerCase();
	                e =  e.toLowerCase();
	                System.out.println(e);
	                System.out.println(f);
	            
	            /*
	             toLowerCase() method converts String' value to 
	             lower case and returns it as a NEW string value        
	             */
	                  		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
