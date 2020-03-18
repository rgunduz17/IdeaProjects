package com.test;

public class Plaindromes {

    public static void main(String[] args) {

//      plaindrome ===> level ,  abba   ,  aba

            String original= "level";
            String reversed = "";

            for(int i=original.length()-1;  i >= 0; i--) {

                reversed += original.substring(i, i+1);
            }

           // boolean result = original.equals(reversed) ? true : false ;

                boolean result = original.equals(reversed);

                System.out.println(result);
                System.out.println(reversed);

    }
}
