package com.javacodes;

public class MethodOverloading {


    // more than one method with same name but different parameter


    public static void main(String[] args) {

        int result = sum(10,20,30);
        int result2 = sum(40,50);

        System.out.println(result);
        System.out.println(result2);








    }
    public static int sum (int a, int b) {

        return a+b;
    }


    public static int sum (int a, int b, int c){
        return a+b+c;
    }



}
