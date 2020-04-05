package test;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter number " +(i+1)+" :");
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[4]);

    }
}
