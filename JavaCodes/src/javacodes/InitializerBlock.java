package javacodes;

import java.util.ArrayList;
import java.util.Arrays;

public class InitializerBlock {

    //Static initializer block: used for initializing static variables
    //  executed as soon as class loaded (before main method)

    //      static {
    //          statement;
    //         }


    public InitializerBlock (){

        System.out.println("Constructor method");


    }


    static {

        System.out.println("static block");
    }


    public static void main(String[] args) {
        System.out.println("Main method");

        InitializerBlock object1 = new InitializerBlock();


        System.out.println(name);

        System.out.println(Arrays.toString(arr1));

        System.out.println(list);

        System.out.println(students);
    }

    static {

        System.out.println("static block 2");
    }



    public static String name;
    public static int[] arr1;
    public static ArrayList <String> list = new ArrayList<>();
    public static ArrayList <String> students = new ArrayList<>();
    public static String [] online = {"Ali", "Veli", "Deli"};
    public static String [] inClass= {"Ayse", "Fatma", "Hayriye"};



    static {
        name= "Ali";

        arr1 = new int[5];
        arr1[0]= 1;
        arr1[2]= 3;

        list.add("Coffee");
        list.add("Tea");

        students.addAll(Arrays.asList(online));
    }


    static {
        name ="Ridvan";

        arr1 = new int[3];
        arr1[1]=2;

        list.add("Coke");

        students.addAll(Arrays.asList(inClass));
    }

//      instance initializer block : used for initializing instance variables, belongs to object

    // declaration of instance block:

        //   {
        //    statement;
        //     }


    {
        System.out.println("instance block");
    }

    {
        System.out.println("instance block 2");
    }

}
