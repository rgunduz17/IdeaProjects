package day24_JavaRecap;

public class Quiz {
	 public static void main(String[] args) {
	        
	        int i =5;  
	        do {
	            i--;
	            System.out.print(i + " ");  // 4
	        //  i++;
	            
	        }while(i >0);
	        System.out.println();
	        
	        
	        int x ;
	        int y = 5;
	        for(x = 0; x < y ; x ++ ) { //  x =3  x=6;
	            
	            System.out.print(   (x+=2)   +" ");
	            //                   2  5 
	        }
	        
	        System.out.println();
	        int X =10;  // 10 + 0 = 10+1 =11+2+3+4+5 =25
	        
	        for(int j=0 ; j <= 5; j++) {  // j: 0 1 2 3 4 5
	            X += j;
	        }
	        
	        
	        for( int a =0; a< 5; a++) {
	            System.out.print(a+" ");
	            break;
	        //  System.out.println("Hello");  // break statement is the closing statement
	        }
	        System.err.println();
	        
	        
	        String str = "Java";
	        String str2 = new String(str); // "Java"
	        System.out.println( str == str2); //false,  differnet memory
	        System.out.println( str.equals(str2) );  // true
	        
	        int count  = 10;
	        
	        do {
	            count += 2;
	        }while( str == str2);
	        
	        System.out.println(count);  //12
	        
	        
	        int count2  = 10;
	        
	        while( str == str2) {
	            count2 += 2;
	        }
	        
	        System.out.println(count2);  // 10
	        
	        
	        
	        
	        int a =0;  // a=2, a =4, a = 6, a = 8
	        while( a <= 6 ) { 
	            // 6 <= 6 ==> true
	            a += 2;
	        }
	        
	        System.out.println(a);
	        
	        
	        int I;
	        int J = 7;
	        
	        for(I =0; I < J-1; I+=2 ) { // I=2, I = 4, I = 6
	            //  0;  I < 6 ; I+=2
	            
	            System.out.print(I+" ");
	            //              0 2 4
	        }
	        
	        System.out.println();
	        
	        for(int Y =0 ; Y <= 4; ) {
	            Y++;
	            System.out.print(Y  +  " ");
	            
	        }
	        System.out.println();
	        
	        String s1 ="Cybertek";
	        
	            s1 = s1.toUpperCase();
	            System.out.println(s1);
	        
	            
	            String S1 ="ABC";
	            String S2 ="ABC";
	            
	            System.out.println( "S1 == S2: " +  S1 == S2 );
	            //                  "S1 == S2: ABC"  == "ABC"   ==? false
	        
	        
    }
	
}