package com.javacodes;

public class NestedLoop {

    public static void main(String[] args) {

//        Nested loop: loop inside a loop

//            for () {
//                  for  (){
//            }
//        }
        for (int z=0; z <= 5; z++) {
            for (int i = 1; i <= 5; i++) {

                System.out.print(i);

            }
            System.out.println();
        }

        int z=1;
        while(z <= 5) {
            int i = 1;
            while (i <= 5) {
                System.out.print("*");
                i++;
            }
            System.out.println();

            z++;
        }
        System.out.println("\n\n");

        for(int i=1; i<=10; i++){


            for (int j=1; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\n");


        int i=1;
        while( i<=10 ){


            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }

        System.out.println("\n\n");


//        int i=1;
//        do{
//            for (int j=1; j<i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            i++;
//        }while( i<=10 );


    }
}
