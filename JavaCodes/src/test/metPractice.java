package test;

import java.util.*;

public class metPractice {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);


    }//end main

    public static void plus_minus(int []arr){
        int positives=0;
        int negatives=0;
        int zeros =0;

        for (int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                positives++;
            }
            if(arr[i]==0){
                zeros++;
            }
            if(arr[i] <0){
                negatives++;
            }


        }
        System.out.println("positives:"+ positives +",negatives:"+ negatives + ",zeros:"+ zeros);
        System.out.println();
    }
}
