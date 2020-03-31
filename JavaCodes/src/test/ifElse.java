package test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ifElse {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = scan.nextLine();

        System.out.println("Enter second string:");
        String str2 = scan.nextLine();


        if (str1.equals(str2)){
            System.out.println(str1 + " is equal to"+ str2);
        }else {
            System.out.println(str1 + " is NOT equal to "+ str2);
        }







    }
}
