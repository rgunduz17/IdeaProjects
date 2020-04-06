package test;

import java.util.Scanner;

public class javaTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.contains("java")){
            System.out.println(true);
        }else {
            System.out.println(false);

        }


    }


}
