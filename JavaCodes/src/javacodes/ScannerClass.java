package javacodes;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {


    // SCANNER CLASS

    //import java.util.Scanner; ==> between package and className
    Scanner variableName = new Scanner(System.in);  //==> In main method
        System.out.println("Enter a number: ");  //print something before enter value
    int num =  variableName.nextInt(); // assign a variable and nextInt accept only int number in the scanner

        System.out.println("Your number multiple by 5: " + num * 5); //result
}
}