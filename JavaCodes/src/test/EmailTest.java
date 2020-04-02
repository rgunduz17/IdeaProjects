package test;

import java.util.Scanner;

public class EmailTest {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String result = "";

        if (email.contains("_")) {
            result = email.substring(email.indexOf("_")+1, email.indexOf("@")) +"_"+ email.substring(0, email.indexOf("_")) + "@gmail.com";
            System.out.println(result);
        } else {
            System.out.println(email);
        }


        String firstName= ""+email.toUpperCase().charAt(0)+email.substring(1,email.indexOf("_"));
        System.out.println("First name: "+ firstName);
        String lastName = ""+email.toUpperCase().charAt(email.indexOf("_")+1)+email.substring(email.indexOf("_")+2, email.indexOf("@"));
        System.out.println("Last name: "+ lastName);
        String domain= email.substring(email.indexOf("@")+1, email.indexOf("."));
        System.out.println("Domain: "+ domain);
        String topLevelDomain = email.substring(email.indexOf(".")+1, email.length());
        System.out.println("Top-Level Domain: "+ topLevelDomain);




    }
}
