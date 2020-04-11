package InterviewQuestions;

import java.util.Arrays;

public class ArrayReplace {


    public static void main(String[] args) {


        String str = "$12, $23, $10, $2, $5, $2";


        String [] array =str.split(", ");


        int count=0;
        for (int i=0; i< 6; i++){

            count += Integer.parseInt((array[i].replace("$", "")));
        }

        System.out.print(count);
    }
}
