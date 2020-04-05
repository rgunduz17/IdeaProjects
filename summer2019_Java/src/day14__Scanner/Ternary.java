package day14__Scanner;

public class Ternary {
	
	/*
	 In Ternary
		 if(condition)		==> (condition)?
		 else if(condition)	==> :(condition)?
		 else				==> ;

		 
	 */
	
	public static void main(String[] args) {
		
		int num = 0;
		
		if (false) {
			num = 100;	
		}else {
			num = 50;
		}
		
		
		int n = (false)	? 100 : 50;		//ternary returns a Value
		
		int y = (false)	? 100 : 50;
					
		
		
		System.out.println(num); // 50
		System.out.println(n); // 50
		System.out.println(y); 
		
		
			String Schoolname = "";
			boolean Batch12 = true;
			
			if (Batch12) {
				Schoolname = "Cybertek";
			}
			else {
				Schoolname = "Invlaid";
			}
			
		
		System.out.println(Batch12 ? "Cybertek":"Invalid");
		
		String BestSchool = Batch12 ? "Cybertek":"Invalid";
		
		System.out.println(BestSchool);
		
		
		
		double d = 10;
		if (true) {
			d=10.5;
		}
		
		double z = true ? 10.5 : 0;
		// in ternary, total number of ? and: needs to be equal
		
		
		double interestRate = 0;
		boolean GoodCredit = true;
		
		interestRate = (GoodCredit == true) ? 0.5 : 0.9; 
		System.out.println(interestRate);
		
		
		byte grade = 60;
		boolean Passed = grade >= 60 ? true : false;
		
		System.out.println(Passed);
		
		
		char FinalGrade = 'C';
		String Group = "";
		/*
		if(FinalGrade =='A') {
			Group ="Early Bird";
		}
		else if(FinalGrade == 'B') {
			Group ="Group 1";
		}
		else {
			Group="After Group1";
		}
		*/
		
		Group = (FinalGrade == 'A') ? "Early Bird"
				: (FinalGrade == 'B') ? "Group 1"
						: "After Group1";
		System.out.println(Group);
		
		/*
		if(FinalGrade =='A') {
			Group ="Early Bird";
		}
		else if(FinalGrade == 'B') {
			Group ="Group 1";
		}
		else{
			Group ="Group 2";
		}
		else {
			Group="After Group2";
		}
		*/
		
		Group = (FinalGrade == 'A') ? "Early Bird"
				: (FinalGrade == 'B') ? "Group 1"
						: (FinalGrade == 'C') ? "Group 2"
								:"After Group2";
		System.out.println(Group);
		
		
		
		
		int score =80;
        char Finals =' ';
        
        if(score >= 90 && score <=100)
                Finals ='A';
        else if(score >= 80 && score <= 89)
                Finals = 'B';
        else if(score >=70 && score <= 79)
                Finals = 'C';
        else if(score>= 60 && score <= 69)
                Finals ='D';
        else if(score>=0 && score <= 59)
                Finals = 'F';
        else
            Finals = ' ';
		
		score =90;
		Finals = (score >= 90 && score <= 100) ? 'A'
				:(score >= 80 && score <= 89) ? 'B' 
						:(score >=70 && score <= 79) ? 'C'
								:(score>= 60 && score <= 69) ? 'D'
										:(score>=0 && score <= 59) ? 'F'
												: '?';
		System.out.println(Finals);
		
		int n1=100, n2=300, n3=400;
		
		int max = (n1 > n2 && n1 > n3)? n1
				: (n2 > n1 && n2 > n3)? n2
					: (n3 > n1 && n3 > n2)? n3
						: 00;
		System.out.println(max);							
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
