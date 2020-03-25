package InterviewQuestions;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
public class VendingMachine2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int itemPrice = scanner.nextInt();

        if(itemPrice < 25 || itemPrice >100){
            System.out.println("Invalid price!");
            System.exit(0);
        }

        if ( !(itemPrice % 5 ==0) ){
            System.out.println("Invalid price!");
            System.exit(0);
        }

        int changeInQuarters = ((100-itemPrice)/25);
        int changeInDimes = ((100-itemPrice-(changeInQuarters*25))/10);
        int changeInNickles = ((100-itemPrice-(changeInQuarters*25) - (changeInDimes*10))/5);


        System.out.println("Your change is "+changeInQuarters+ " quarters, "+ changeInDimes+ " dimes, and " + changeInNickles+ " nickels.");
    }
}