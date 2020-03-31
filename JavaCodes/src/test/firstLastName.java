package test;

import java.util.Scanner;

public class firstLastName {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String firstName= scan.next();
        String lastName = scan.next();
        System.out.println(""+firstName.toUpperCase().charAt(0)+ lastName.toUpperCase().charAt(0));

    }
}