package InterviewQuestions;

import java.util.Scanner;

public class FindLongestStringOfnWord {

    public static void main(String[] args) {

//      3. write a program that can ask the user to "enter a word"
//      five times and returns the word that has the maximum length

        Scanner scan = new Scanner(System.in);
        String str ="";

        for (int i=0; i < 5; i++){
            System.out.println("Enter a word:");
            String word = scan.nextLine();
            if (str.length() < word.length()){
                str= word;
            }
        }
        System.out.println(" The word has maximum length is: "+str);




    }
}
