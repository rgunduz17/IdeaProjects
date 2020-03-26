package day04_variables2;

public class PrimitiveDataTypes2 {

	/*
	 Primitives: byte, short, int, long, float, double, boolean, char
	 	
	 		boolean: can only assign true or false boolean expressions
	 		
	 		char: declared within the single quote ' '; Single character only.
	 				'' is a MUST  when you give character as value
	 
	 
	 */
	public static void main(String[] args) {
		
		boolean result = true;
		boolean result2 = false;
		boolean result3 = 9 > 3;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		
		//char:
		
		char char1 ='a'; //only single character is accepted
		
		System.out.println(char1);
		
		//char char2 ='ab'; gives compile error
		
		char char2 = '9';
		char char3 = '#';
		System.out.println("\n\n");
		//	Welcome  ==> emocleW
		//char with numbers
		char char4 =67; //only time we use sing quote for char is when we are declaring a single character 
		System.out.println(char4);
		
		char char5 = 'C';
		System.out.println(char5);
		
		char char6 = '{';
		System.out.println(char6);
		
		char char7 = 123;
		System.out.println(char7);
		
		//initializing char to other primitives; byte, short, int, long, float, double
		char MyChar1 = 'b';
			
		int MyInt = MyChar1;	//the number that represents b is initialized to the int
			
		System.out.println(MyInt); //prints 98
		
		//byte MyByte = MyChar1; char's memory is 2 byte, byte memory is 1 byte
		byte MyByte2 = 'b'; //b's corresponding number is 98
		System.out.println(MyByte2);
		
		
		//short ShortNum = MyChar1; Chars memory could be larger than short, and range is greater than short as well
		short ShortNum2 = 'b';
		System.out.println(ShortNum2);
		
		long LongNum = MyChar1;	//long's memory is 8 byte
		long LongNum2 = 'b';	//98
		System.out.println(LongNum);
		
		float FloatNum = MyChar1;
		float FloatNum2 = 'b';
		System.out.println(FloatNum2);	//98.0
		
		double doubleNum = MyChar1;
		double doubleNum2 = 'b';
		System.out.println(doubleNum2);	//98.0
		
		//java is case sensitive: A does not = a
		
		char mycharValue = 200;
		
		System.out.println(mycharValue);
		
	
		
		
	
		
		
		
		
	}
	
	
	
	
	
	
	
}
