package test;

import java.util.*;

public class LengthTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        if(word.length()%2==1 ){
            if (word.length()==1){
                System.out.println(""+word+word+word);
            }else if (word.length()>=3){
                System.out.println(word.charAt(((word.length()+1)/2)-1));
            }else{
                System.out.println();
            }
        }
        else if(word.length()%2==0 ){
            if (word.length()==2){
                System.out.println(""+word+word);
            }else if(word.length()>=4){
                System.out.println(""+word.charAt(word.length()/2-1)+word.charAt(word.length()/2) );
            }else{
                System.out.println();
            }
        }


    }
}
