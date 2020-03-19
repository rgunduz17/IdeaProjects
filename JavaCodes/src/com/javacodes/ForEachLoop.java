package com.javacodes;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        // enhanced loop
        //  used to access the value iin a collection of values


        // for (DataType VariableName : VariableNameOfCollection) {}
        // for (DataType each : ArrayName) {}


        int [] arr = {1,2,3,4,5};
        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("***********************");

        for (int each: arr) {
            System.out.println(each);
        }

        String [] str1= {"A", "B", "C","D"};
        for (String each: str1) {
            System.out.println (each);
        }


        char []  ch = {'z','x','y','c','b','a'};
        Arrays.sort(ch);

        for (char each: ch) {

            System.out.println(each);

        }


        // for each for 2 dimensional arrays

        int [] arr1D=  {1,2,3};

        int [][] arr2D=  {{1,2,3}, {4,5,6}};

        for (int [] each1 : arr2D) {
            for (int each2 : each1) {
                System.out.print(each2 + " ");
            }
        }

        System.out.println();

            String [] str1D = {"A", "B"};
            String [][] str2D = {{"A", "B"}, {"C","D","E"},{"F", "G", "H","I"}};

            for (String [] each3: str2D) {
                for (String each4 : each3) {
                    System.out.print(each4 + " ");
                }
            }



    }
}
