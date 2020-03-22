package test;

import java.util.Scanner;

public class ScannerTest {


    public static void main(String[] args) {





        Scanner scanner = new Scanner(System.in);
        System.out.println("Put your name: ");
        String name = scanner.nextLine();

        System.out.println("Put your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Put your age: ");
        int age = scanner.nextInt();

        System.out.println("FullName: "+ name +" "+ lastName + " and your age is: " + age);
    }
}
