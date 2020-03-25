package InterviewQuestions;

import javax.swing.JOptionPane;

public class VendingMachine {
    public static void main(String[] args)
    {

        //Greet user
        JOptionPane.showMessageDialog(null,  "Welcome to the Vending Machine.");

        //Get cost of the item and convert it to a double
        String costString = JOptionPane.showInputDialog(null, "Enter price of item\n (from 25 cents to a dollar, in 5- cent increments");
        int costAsInt = Integer.parseInt(costString);

        //Determine how much change is left over
        int changeInQuarters = ((100-costAsInt)/25);
        int changeInDimes = ((100-costAsInt-(changeInQuarters*25))/10);
        int changeInNickles = ((100-costAsInt-(changeInQuarters*25) - (changeInDimes*10))/5);
        int changeInPennies = ((100-costAsInt-(changeInQuarters*25) - (changeInDimes*10))%5);

        //Display results to user
        JOptionPane.showMessageDialog(null,  "You bought an item for " + costAsInt + " and gave me a dollar.\n" +
                "So your change is:\n" +
                changeInQuarters + " Quarters\n" +
                changeInDimes + " Dimes\n" +
                changeInNickles + " Nickels\n" +
                changeInPennies + " Pennies");




    }

}