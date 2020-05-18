package InterviewQuestions;


import java.util.Scanner;

public class TwoWords {

    private final static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("enter first word:");
        String word1 = scanner.nextLine();
        System.out.println("enter second word:");
        String word2 = scanner.nextLine();

     //   TwoWordsString(word1,word2);
        printWords(word1,word2);
    }


    public static void printWords(String word1, String word2){
        String result2 = "";
        result2 += ""+word1+word2+word2+word1;
        System.out.println(result2);

    }

    public static void TwoWordsString(String word1, String word2){

        String result= "";
        result= word1.substring(1)+word2.substring(1);
        System.out.println(result);
    }
}
