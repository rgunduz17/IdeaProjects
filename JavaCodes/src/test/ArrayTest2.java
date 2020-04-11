package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();

        String[] arr1 = str1.split(" ");

        int[] intArr = new int[arr1.length];

        int count = 0;

        for(int i = 0 ; i < intArr.length ; i++){

            int i1 = Integer.parseInt(arr1[i]);

            intArr[count] =i1;

            count++;
        }

        String str =Arrays.toString(intArr);
        if (str.contains("1") && str.contains("4")){
            System.out.println(false);
        }else {
            System.out.println(true);
        }
    }
}
