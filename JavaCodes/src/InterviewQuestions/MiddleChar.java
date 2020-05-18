package InterviewQuestions;

import java.util.Scanner;

public class MiddleChar {
    private final static Scanner scanner = new Scanner(System.in);
    private static String result= "";
    private static String result2 ="";
    public static void main(String[] args) {

        // find the middle char of given string
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        FindMiddleChar(word);
        MidChar(word);
    }

    public static void FindMiddleChar(String word){

        int wordLength = word.length();
    if(wordLength%2==0) {
        result += "" + word.charAt((wordLength / 2)-1) + word.charAt(wordLength/2);
        System.out.println(result);
    }else{
        result = "" + word.charAt((wordLength / 2));
        System.out.println(result);
    }
    }


    public static void MidChar(String word){
        int wordLength = word.length();
        if(wordLength%2==0) {
            result2 += word.substring(wordLength/2, (wordLength/2)+1);
            System.out.println(result2);
        }else{
            result2 = word.substring(wordLength/2);
        }



    }
}
