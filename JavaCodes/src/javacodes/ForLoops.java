package javacodes;

public class ForLoops {

    public static void main(String[] args) {

//       repeating steps multiple times

//          for(init; condition; increment/decrement ){
//
//          }
//      statement will continue until becomes FALSE

        for (  int i =10; i>0; i--) {

            System.out.println("Value of i is :" + i);
        }

        System.out.println("***********************************");

        for (  int i =1; i<=10; i++) {

            System.out.println("Value of i is :" + i);
        }
        System.out.println("***********************************");


        for (  int i =1; i<=100; i++) {

            System.out.println("Square of " + i +" is : " + (i*i));
        }


        System.out.println("***********************************");

        String str ="Ridvan Gunduz";
        String reversed = "";
        for (int i = str.length()-1; i >=0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println(reversed);

        
        System.out.println("***********************************");
        System.out.println();
    }
}
