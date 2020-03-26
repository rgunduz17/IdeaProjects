package day15_Scanner_StringClass;

public class WarmUp {

	public static void main(String[] args) {
		   /*
		 write a java program that can convert numbers between 0 ~ 9
		  to words, if the number is greater than 9 or less than zero,
		   out put should be "Invalid".
		     */
		    
		        int num = -9;
		        String result = "";
		        if(num >=0 && num <= 9) {
		            
		            if(num == 9) 
		                    result="nine";
		            else if(num ==8)
		                    result ="eight";
		            else if(num == 7)
		                    result ="seven";
		            else if(num == 6)
		                    result = "six";
		            else if(num == 5)
		                    result = "five";
		            else if(num == 4)
		                    result = "four";
		            else if(num == 3)
		                    result = "three";
		            else if(num == 2 )
		                    result = "two";
		            else if(num == 1)
		                    result = "one";
		            else 
		                result = "Zero";      
		        } else {
		            result = "Invalid";
		        }
		        
		        
		        System.out.println(result);
		        
		int n = 7;
		
		String result2 = (n==9)? "Nine"	: (n==8)? "Eight"
					   : (n==7)? "Seven": (n==6)? "Six"  
					   : (n==5)? "Five"	: (n==4)? "Four" 
				       : (n==3)? "Three": (n==2)? "Two"	 
				       : (n==1)? "One"	: (n==0)? "Zero": "Invalid";
													
		System.out.println(result2);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
