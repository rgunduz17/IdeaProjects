package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {


    public static void main(String[] args) {


        int[][] arr = {{2, 3, 2}, {4, 1, 5}, {7, 2, 5}};


        String a = Arrays.toString(arr);
        String b = a.replace("2", "6");


        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j] == 2)
                {
                    arr[i][j] = 6;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));





    }
}
