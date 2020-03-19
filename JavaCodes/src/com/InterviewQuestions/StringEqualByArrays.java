package com.InterviewQuestions;

import java.util.Arrays;

public class StringEqualByArrays {

    public static void main(String[] args) {
//          str2 needs to has same letters from str1

//        if str1= "aabbbc";  ==> str2 = "cab";
//        output: true;
//
//
//        if str1 = "abcd";  ===> str3 = "abc";
//        output: false;
//
        String a= "aabbbc", b ="cabaabbabc";
       // removed duplicates

        String a1= "";


        for (int j= 0; j < a.length(); j++) {

            for (int i = 0; i < a.length(); i++) {

                if (!a1.contains(a.substring(j,j+1))) {
                    a1 += a.substring(j,j+1);
                }
            }
        }
        System.out.println(a1);


//      b ="cabaabbabc";

        String b1= "";

        for (int j= 0; j < b.length(); j++) {

            for (int i = 0; i < b.length(); i++) {

                if (!b1.contains(b.substring(j,j+1))) {
                    b1 += b.substring(j,j+1);
                }
            }
        }
        System.out.println(b1);


       // String a1

        String [] arr1 = a1.split("");

        // String a2

        String [] arr2 = b1.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        if (Arrays.toString(arr1).equals( Arrays.toString(arr2))) {
            System.out.println("true");

        }else {
            System.out.println("false");
        }


        char [] ch1= a1.toCharArray();
        System.out.println(Arrays.toString(ch1));

        char [] ch2= b1.toCharArray();
        System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String str1= Arrays.toString(ch1);
        String str2= Arrays.toString(ch2);


        System.out.println(str1 +" " + str2);

        if (str1.equals(str2)) {
            System.out.println("Yes,true");

        }else {
            System.out.println("no, false");
        }





    }
}
