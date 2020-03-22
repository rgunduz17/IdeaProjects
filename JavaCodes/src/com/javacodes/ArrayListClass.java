package com.javacodes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListClass {


//     1. presented in "java.util" package
//        import java.util.ArrayList;
//     2. ArrayList does not support primitives
//     3. ArrayList store Objects ONLY

//      ArrayList <ClassType> variableName = new ArrayList <>();

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<Integer>();

        System.out.println("ArrayList : "+ list2);

//        method of arrayList;
//
//
//        1. add(value);

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(15);

        System.out.println("Add value to ArrayList : "+ list2);

//      2. get(indexNum);

        System.out.println("Get from ArrayList : "+list2.get(1));

//      3. size();      total length of ArrayList


        System.out.println("Size of ArrayList : "+list2.size());

//         4.Collections.sort (VariableName);   // to sort ArrayList

        Collections.sort(list2);

        System.out.println("Sorted List: "+list2);




        

//      5. clear();  removes values from arrayList


        list2.clear();

        System.out.println("Clear method : "+list2);





//      Examples


        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Ridvan");
        nameList.add("Ridas");

        System.out.println(nameList);

        System.out.println("******************************");



        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();

        while (true) {
            System.out.println("Enter student name: ");

            String name = scanner.nextLine();

            studentNames.add(name);

            System.out.println("Do you want to add another name? ");

            String Answer = scanner.nextLine().toLowerCase();

            if( ! (Answer.equals("yes") ||(Answer.equals("no")) )){
                System.out.println("Invalid Answer");
                break;
            }

            if (Answer.equalsIgnoreCase("no")) {
                break;
            }


        }

        System.out.println(studentNames);





    }



}
