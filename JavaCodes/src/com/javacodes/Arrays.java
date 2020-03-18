package com.javacodes;

public class Arrays {

    public static void main(String[] args) {

//              Arrays
//              dataType [] variableName = {10, 20, 30, 40 };

                int [] arr = {10, 20, 30, 40, 50};

             System.out.println(arr);

//          variableName [indexNumber]

            System.out.println(arr[0]);

            String [] names = {"Ridvan", "Mustafa", "Yakup"};

            System.out.println(names [0]);

//      index


        double [] myArray = {1,2,3,4,5,6,7,8,9};
        for(int i=0; i < 9; i++) {

            System.out.println(myArray[i]);
        }

//      length

        int [] myArray2 = {1,2,3,4,5,6,7,8,9};

            int len = myArray2.length;
        System.out.println(len);
            int HighestIndexNum = myArray2.length -1;
        System.out.println(HighestIndexNum);


        for(int i =0; i < myArray2.length; i++) {
            System.out.print(myArray2 [i] + " ");

        }

//

    }
}
