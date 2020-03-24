package javacodes;

import java.util.ArrayList;
import java.util.Arrays;
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
//        1. add(object);
//           add(index, object)

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(15);

        System.out.println("Add value to ArrayList : "+ list2);

//          addAll(object);
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ridvan", "Ali","Veli","Deli"));

        System.out.println("addAll method: "+names);


//      2. get(indexNum);

        System.out.println("Get from ArrayList : "+list2.get(1));

//      3. size();      total length of ArrayList


        System.out.println("Size of ArrayList : "+list2.size());

//      4.Collections.sort (VariableName);   // to sort ArrayList

        Collections.sort(list2);

        System.out.println("Sorted List: "+list2);

//      5. set(index number, object);  given object will replace with whatever index is;

        list2.set(2, 100); // index 2 (20) is changed with 100

        System.out.println("Set method: " +list2);

//      6.contains();
//      boolean value (true or false)


        ArrayList<String> goodGuys = new ArrayList<>();

        goodGuys.add("Ali");
        goodGuys.add("Veli");
        goodGuys.add("Deli");
        goodGuys.add("Hali");
        goodGuys.add("Mali");

        boolean result = goodGuys.contains("Ridvan");
        System.out.println("Contain method result is: "+result);

//     7.  equals(ArrayList);

        ArrayList<String> badGuys = new ArrayList<>();

        badGuys.add("Ali");
        badGuys.add("Veli");
        badGuys.add("Deli");
        badGuys.add("Hali");
        badGuys.add("Mali");


        boolean result2 = badGuys.equals(goodGuys);
        System.out.println("Equals method result: "+result2);

//      8.remove
//        remove(index);    remove values from that index number
//        remove(String);   remove values from that index number
//        remove(Integer);  remove first matching object at the same return boolean value
//        removeAll(Interface)

        ArrayList<Integer> list5 = new ArrayList<>();

        list5.add(1);
        list5.add(2);
        list5.add(3);
        list5.add(4);
        list5.add(5);
        list5.add(6);

        System.out.println(list5);
        list5.remove(1);
        System.out.println("Remove method "+list5);



        ArrayList<String> Guys = new ArrayList<>();

        Guys.add("Ali");
        Guys.add("Veli");
        Guys.add("Deli");
        Guys.add("Hali");
        Guys.add("Mali");

        System.out.println(Guys);

        Guys.remove("Deli");
        System.out.println("Removed method string: "+Guys);

     //remove(Integer);

        ArrayList<Integer> list6 = new ArrayList<>();

        list6.add(1);
        list6.add(2);
        list6.add(3);
        list6.add(4);
        list6.add(5);
        list6.add(6);
        list6.add(1);

        Integer a=2;
        boolean r1=list6.remove(a);
        System.out.println("Removed Integer: "+list6);
        System.out.println(r1);

        // removeAll

        list6.removeAll(Arrays.asList(1));
        System.out.println("removeAll 1 in the list: "+list6);

//      9. clear();  removes values from arrayList


        list2.clear();

        System.out.println("Clear method : "+list2);

//      10. IndexOf(Object);   return the index of the given object


        ArrayList<Integer> list9 = new ArrayList<>();

        list9.add(1);
        list9.add(Integer.valueOf("3"));
        list9.add(5);
        list9.add(7);
        list9.add(Integer.parseInt("9"));
        list9.add(11);

        System.out.println(list9);


        int a9 = list9.indexOf(5);
        System.out.println("Index of method: "+a9);


//      11. lastindexOf(object);  return last occurence of objects index number


        System.out.println(list9);
        int a10 = list9.lastIndexOf(11);
        System.out.println("Last index of method: "+ a10);


//      Arrays.asList(object Array);    Converting Array to ArrayList

       Integer[] arr9= {1,2,3,4,5,6};
         System.out.println(Arrays.toString(arr9));

       ArrayList<Integer> list10 = new ArrayList<>(Arrays.asList(arr9));
       list10.add(7);
       list10.add(8);
        System.out.println("Arrays.asList method: "+list10);

//      Examples


        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Ridvan");
        nameList.add("Gunduz");

        System.out.println(nameList);

        System.out.println("******************************");

//      Add value by user input to ArrayList

//        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> studentNames = new ArrayList<>();
//
//        while (true) {
//            System.out.println("Enter student name: ");
//
//            String name = scanner.nextLine();
//
//            studentNames.add(name);
//
//            System.out.println("Do you want to add another name? ");
//
//            String Answer = scanner.nextLine().toLowerCase();
//
//            if( ! (Answer.equals("yes") ||(Answer.equals("no")) )){
//                System.out.println("Invalid Answer");
//                break;
//            }
//
//            if (Answer.equalsIgnoreCase("no")) {
//                break;
//            }
//
//
//        }
//
//        System.out.println(studentNames);

        System.out.println("**********************************");


        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("apple");
        shoppingList.add("orange");
        shoppingList.add("grape");
        System.out.println(shoppingList);



        shoppingList.add("strawberry");
        System.out.println(shoppingList);


        shoppingList.add(1,"banana");
        System.out.println(shoppingList);
        shoppingList.clear();
        System.out.println(shoppingList);

    }



}
