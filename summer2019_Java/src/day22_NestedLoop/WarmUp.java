package day22_NestedLoop;

public class WarmUp {
	/*
	 1. write a program which prints out the numbers from 1 to 30:
        1. for numbers which are divisible by 3, print "FIN" instead of the number.
        2. for numbers which are divisible by 5, print "RA" instead of the number
        3. for numbers which are a divisible by booth 3 and  5, print "FFINRA" instead of the number
                DO NOT USE FOR LOOP
    2. write a program that can check if the String is plaindrome. if it's print "true", 
    	otherwise print "false"    DO NOT USE FOR LOOP
        Ex: input: level
            output: true,  (because reversed value is still "level")
	 */
	public static void main(String[] args) {
//task01		
		int i = 1;
		while ( i < 30 ) {
			if( i%3==0 && i%5==0 ) {
				System.out.print("FINRA ");
			}else if( i%3==0 ) {
				System.out.print("FIN ");
			}else if ( i%5==0 ) {
				System.out.print("RA ");
			}else {
				System.out.print(i+" ");
			}
			++i;

		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
