package test;

import java.util.Scanner;

public class maxNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();

        System.out.println("Max: "+Math.max(a,Math.max(b,Math.max(c,Math.max(d,e)))));
        System.out.println("Min: "+Math.min(a,Math.min(b,Math.min(c,Math.min(d,e)))));


    }
}
