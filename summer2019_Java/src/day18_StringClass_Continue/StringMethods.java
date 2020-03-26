package day18_StringClass_Continue;

public class StringMethods {

	public static void main(String[] args) {
		/*
		 index(str); takes a String, and returns the index of the first occured character
		 in the given String as an int value
		 
		 */
		String A1 = "Batch 12 is a great batch";
		//
			int num = A1.indexOf("g");	// 14
			System.out.println(num);
			
			int num2 = A1.indexOf("at ");	// 17
			System.out.println(num2);
		
		String B1 = "today is tuesday, today we have class in the afternoon";
		
			int n1 = B1.indexOf("te");
			System.out.println(n1);
		
		
		String Address = " 7925 Jones Branch Dr, Mclearn, VA 22003";
		int begin = Address.indexOf(", ")+2;
		int end = Address.indexOf(", V");
		
		String cityName = Address.substring(begin, end);
		System.out.println(cityName);
		
		String email = "Random.Emails@gmail.com";
		int begin2 = email.indexOf("@");
		int end2 = email.indexOf(".com");
		
		String emailType = email.substring(begin2, end2);
		System.out.println(emailType);
	
		
		/*
		 lastIndexOf(); returns last occured character's
		 index number as an Int value
		 
		 */
		String str = "ABCDABCD";
 		int n2 = str.lastIndexOf("B"); // 5
 		int n3 = str.indexOf("B"); // 1
 		
 		String myEmail = "Myemail.school@gmail.com";
 		int Begin = myEmail.indexOf("@")+1;
 		int End = myEmail.lastIndexOf(".");
 		
 		String EmailType = myEmail.substring(Begin, End);
 		
 		System.out.println(EmailType);
		
		/*
		 isEmpty(); checks if the String is empty
		 , returns boolean expression
		 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
