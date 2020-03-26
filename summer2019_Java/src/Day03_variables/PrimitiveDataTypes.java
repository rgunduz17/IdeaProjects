package Day03_variables;

public class PrimitiveDataTypes {
	/*
	byte: can assign numbers that are whole within> -128, 127
	 
	Variable names must be unique	
	
	short: We can only assign whole number. Range must be within -32768 <= short <= 32767
	
	int: we can only assign whole number. Range between -2147483648 <= int ,+ 2147483647
	
	long: we can only assign whole number. Be within -9223372036854775808 and 9223372036854775807
	 	  at end of value we can give l or L
	
	 		byte < short < int < long
	 		small one can be assigned to larger one

 	float: can assign decimals
	 		(decimals must have f or F at end)
	 	
	double (used more often): can assign decimals. 		
	 		
	 		float < double
	 		
	 		
	 		
	 */
	
	
	
	
	public static void main(String[] args) {
		
		byte length = 3;
		System.out.println(length);
		
		byte width = 4;
		System.out.println(width);
		
		//byte 9num=100; cariables must start with letter
		
		//byte num_and$; _ $ are the only special characters you can use 

		byte num_and$ = 90;
		System.out.println(num_and$);

		// byte length =6; variable name is not unique
		
		
		//byte public = 199; variable names can not be Java reserved words
		
		//if you capitalize Java reserved words, you can bypass this, 
		
		//for ex: byte Public = 199; works
		
		byte myNum2 =127;
		
		//short num2 =&; we can only assign whole numbers
		
		short num3 =10000;
		
		int num4 =-2147483648;
		
		//100,000,000 
		
		int num5 = 100_000_000; //make it easier to read. Can only use _ with numbers
		
		long longNumber =10L; //can put l or L in long. 
		
		
		//int inNumber =10l;
		
		byte byteNumber =10;
		short shortNumber = byteNumber;
		
		short shortNumber2 =18;
		//byte byteNumber2 = shortNumber2;		short is greater than byte. Error
		
		
		int intNumber =-19876;
		long longNumber2 =intNumber;
		//left side of the = has to be greater than or equal to right side of =
		
		short shortNumber3 = -30000;
		int intnumber2 = shortNumber3;

		float exapmleNum2 =10.5f; //to use decimal in float, use f at end
		
		double doubleNum =10.5; //No need to use special characters with double
		
		byte bNum =10;
		short sNum =20;
		int iNum =30;
		long lNum =40;
		
		System.out.println("===================================");
		
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		
		System.out.println("===================================");
		
		float fNum =bNum;
		float fNum2 =sNum;
		float fNum3 =iNum;
		float fNum4 =lNum;
		System.out.println(fNum);
		System.out.println(fNum2);
		System.out.println(fNum3);
		System.out.println(fNum4);
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
