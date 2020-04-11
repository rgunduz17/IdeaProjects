package Gmail;



import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList arrayListOne=new ArrayList();

        ArrayList<String> letterArray = new ArrayList<>();

        while(true) {
            System.out.println("Type a string:");
            letterArray.add(input.nextLine());


            if (letterArray.size() ==5 ){
                // Display everything in the list
                displayList(letterArray);

                System.out.println("\nNumber of string in array: " + letterArray.size());
                break;
            }
        }



    }


    public static void displayList(ArrayList letterArray) {
        for(int i = 0; i < letterArray.size(); i++)
            System.out.print(letterArray.get(i)+ " ");
    }

}
