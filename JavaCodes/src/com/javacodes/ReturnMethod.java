package com.javacodes;

public class ReturnMethod {

        // return method

        // return type (int , String etc...)

        // if the return type is not VOID  the method MUST return a value;

    public static void main(String[] args) {

        name();  //string value

        System.out.println(name ());

        String str = name();

        System.out.println(str);


    }


        public static String name  () {

            return "Hello World";
        }


        public static boolean result  () {

        return true;

        }

}
