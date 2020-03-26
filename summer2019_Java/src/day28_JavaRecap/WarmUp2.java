package day28_JavaRecap;

public class WarmUp2 {
	
	/* 
    4. write a method that accepts 3 parameters: 2 numbers and one operator, 
       and prints out the calculation 
       if operator is not between [-, +, *, /, %] output should be Invalid Operator
       Ex: calculate(10,2, "*") ==> 20;
    
    5. write a method that can calculate grade
            if score is 100 ~ 90 ==> A
            if score is 89 ~ 80 ==> B
            if score is 79 ~ 70 ==> C
            if score is 69 ~ 60 ==> D
            if score is 0 ~ 59 ==> F
            otherwise ==> Invalid Score
	 */
	
	public static void main(String[] args) {
		
		calculate(10, 2, "*");
		
		CalculateGrade(90);
		
	}
	
	
	public static void CalculateGrade(int score) {
		
		char Grade = (score>=90 && score<=100)? 'A' : 
			(score>=80 && score<90)? 'B' : (score>=70 && score<80)? 'C' :
			(score>=60 && score<70)? 'D' : (score>=0 && score<60)? 'F' :
			'I';
		if(Grade == 'I') {
			System.out.println("Invalid Score");
		}else {
			System.out.println("Your grade is "+Grade);
		}
		
	}
	
	
	
	
	public static void calculate(int a, int b, String Ope) {
		
		String result ="";
			if(Ope.equals("-")) {
				result += (a-b);
				
			}else if(Ope.equals("+")) {
				result+= (a+b);
				
			}else if(Ope.equals("*")) {
				result+= (a*b);
				
			}else if(Ope.equals("/")) {
				result+= (a/b);
				
			}else if(Ope.equals("%")) {
				result+= (a%b);
				
			}else {
				System.out.println("Invalid Operator");	
			}
			
			String result2 ="";
			result2 += (Ope.equals("-"))? (a-b) : (Ope.equals("+"))? (a+b) 
					: (Ope.equals("*"))? (a*b) : (Ope.equals("/"))? (a/b) 
							: (Ope.equals("%"))? (a/b) : "Invalid Operator";	
			
			System.out.println(a+Ope+b+"="+result);
			
	}
	
}
