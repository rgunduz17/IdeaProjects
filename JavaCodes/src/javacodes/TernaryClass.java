package javacodes;

import java.util.Scanner;

public class TernaryClass {

    public static void main(String[] args) {

//         TERNARY CLASS
//         (IF WITHOUT CURLY BRACES AND IF/ ELSE IF/ ELSE WORDS )

//         RULE
//         variableName = (if) Boolean value ? return statement
//                       : (else if) Boolean value ? return statement
//                       : (else) return statement;
//


        char FinalGrade= 'A';
        String Grade= "";
        Grade = (FinalGrade == 'A') ? "Super"
                :(FinalGrade == 'B') ? "Guzel"
                :(FinalGrade == 'C') ? " Fena Degil"
                :(FinalGrade == 'D') ? " Idare Eder"
                : "Dersten kaldin";

        System.out.println(Grade);
        System.out.println("************************************************");


        // SCANNER CLASS

        //import java.util.Scanner; ==> between package and className
        Scanner scan = new Scanner(System.in);  //==> In main method
        System.out.println("Enter a number: ");
        int x = scan.nextInt();


        int result=0;
        result = ( x >= 5) ? x : (-x);
        System.out.println(result);




    }
}
