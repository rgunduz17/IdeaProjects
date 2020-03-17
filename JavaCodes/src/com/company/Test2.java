package com.company;
import java.util.Scanner;
public class Test2 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        double max = inp.nextDouble(); //int n = s.nextInt();
        if (isPrime(max)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    public static boolean isPrime(double max) {
        if (max <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(max); i++) {
            if (max % i == 0) {
                return false;
            }
        }
        return true;

    }
}
