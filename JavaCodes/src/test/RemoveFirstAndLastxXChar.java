package test;


import java.util.Scanner;

public class RemoveFirstAndLastxXChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if(word.startsWith("X") || word.startsWith("x")){

            word = word.replaceFirst("X", "");
            word = word.replaceFirst("x", "");
            if( word.endsWith("X") || word.endsWith("x")  ){
                word = word.substring(0, word.length()-1);
            }

            System.out.println(word);
        }else if (word.endsWith("X") || word.endsWith("x")){
            word = word.substring(0, word.length()-1);
            System.out.println(word);
        }else {
            System.out.println(word);
        }



    }
}
