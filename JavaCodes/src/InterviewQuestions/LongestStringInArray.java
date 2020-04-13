package InterviewQuestions;

import java.util.Scanner;

public class LongestStringInArray {

    /*
    Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];


        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below
        int maxLength = 0;
        String longestString = "";
        for (String each : words) {
            if (each.length() > maxLength) {
                maxLength = each.length();
                longestString = each;
            }

        }
        System.out.println(longestString);

    }
}
