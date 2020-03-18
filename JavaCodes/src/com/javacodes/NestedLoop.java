package com.javacodes;

public class NestedLoop {

    public static void main(String[] args) {

//        Nested loop: loop inside a loop

//              for () {
//            for  (){
//
//            }
//        }
        for (int z=0; z < 5; z++) {
            for (int i = 1; i <= 5; i++) {

                System.out.println(i);

            }
            System.out.println();
        }

    }
}
