package com.test;

import java.util.Arrays;

public class ArrayReviews {

    public static void main(String[] args) {


        // Array:

        int [] arr = {10};


        System.out.println(arr[0]);

        int [] arr2 = new int[2];

        System.out.println(arr2[0]); //  default value = 0


        String [] cars = new String[5];

        cars[4]="Subaru";
        cars[3]="Toyota";
        cars[2]="Audi";
        cars[1]="Jeep";
        cars[0]="Tesla";

        for(String each: cars){
            System.out.print(each+ " ");
        }


        System.out.println();
// reset all arrays and start from 5-10 only
        // reinitalize 1-4 again otherwise 1-4 null
        cars = new String [10];


        cars[5]="Ford";
        cars[6]="Honda";
        cars[7]="Bmw";
        cars[8]="Volvo";
        cars[9]="VolksWagen";

        System.out.println(Arrays.toString(cars));







    }


}
