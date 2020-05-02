package test;

import java.util.Arrays;
import java.util.Scanner;

public class testtest2123 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};




        String firstAndLast="";

        for(String word: words){
            firstAndLast+=word.substring(0,1)+word.substring(word.length()-1)+" ";
        }
        String[] newWord=firstAndLast.split(" ");
        for(String element: newWord){
            System.out.println(element);

        }
    }
}
