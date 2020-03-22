package com.InterviewQuestions;

public class Plaindromes {

    public static void main(String[] args) {

//      plaindrome ===> level ,  abba   ,  aba

            String original= "level ";
            String reversed = "";

//            for(int i=original.length()-1;  i >= 0; i--) {
//
//                reversed += original.substring(i, i+1);
//            }

                int i=original.length()-1;

            while (i >= 0) {
                reversed += original.substring(i, i+1);
                i--;
            }

           // boolean result = original.equals(reversed) ? true : false ;


        reversed = reversed.replaceAll("\\s", "");
        boolean result = original.replaceAll("\\s", "").equalsIgnoreCase(reversed);


        System.out.println(result);

        System.out.println(reversed);

    }
}
