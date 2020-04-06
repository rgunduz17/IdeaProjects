package day25_ArraysContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class StringMethods {

    /*
    split(str): splits the String by the given value, and returns it as String array
    
    
    toCharArray():
    
    */
   public static void main(String[] args) {

//      3. split(str):

       String sentence = "Today is great day Good day to learn java";
       
       String[] arr = sentence.split(" ");
       System.out.println( Arrays.toString(arr) );
//      [Today, is, great, day, Good, day, to, learn, java]
           
           String email ="FirstName_LastName";
                String[] arr2 =  email.split("_");
                
                String str = Arrays.toString(arr2);
       System.out.println( str.replace("[", "").replace("]", "")  );
                
       
           String   fullname  = "Cybertek School Batch12";
           
                    String[] array1 = fullname.split(" "); // there are two spaces
                    System.out.println(  Arrays.toString(array1) );
    
           
           String  Java = " Java I love Java and Java is fun, Java is Life Java ";
           //              I love  |   and   |  is fun,   | is Life  |
           
           String[]  array2  =  Java.split("Java");
               
           System.out.println(Arrays.toString(array2));
           System.out.println(array2.length-1); // java is occured 3 times in the sentence
       
       
           String Python = " Python is good, I Love Python, Python is life ";
               //          [     |   is good, I Love   | ,    |     is life      ]  
           String[]  array3 = Python.split("Python");
           System.out.println( array3.length-1 );   // retunrs the total number of python in STring
           
           
           
           String emailAddress ="Cybertek.school.bacth12@Gmail.com";
               emailAddress =  emailAddress.substring(0, emailAddress.indexOf("@") );
               String[] array = emailAddress.split("\\.");
               
               System.out.println(Arrays.toString(array));
           
               
               String word = "ABCDEFG";
               String[] AllCharacters =word.split(""); // all characters from the string as an array
                               // splits the STring character by character
           
           System.out.println(Arrays.toString(AllCharacters));
           
           
           /*
            toCharArray(): returns a char array from the String
            */

//          4. toCharArray();

           	String str1 = "java";
           	char[] ch = str1.toCharArray();
           				
           	System.out.println( Arrays.toString(ch) );
//          [j, a, v, a]
		
		
//      Arrays.asList(objectArray);
//          Converting Array to ArrayList
		Integer [] arr5 = {1,2,3,4,5,6,7,8,9};

       ArrayList<Integer> list =new ArrayList<>(Arrays.asList(arr5));
       System.out.println(Arrays.toString(arr5));
//      [1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
