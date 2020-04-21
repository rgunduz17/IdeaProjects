package day33_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListTest {

    static ArrayList <String> list = new ArrayList<>(Arrays.asList("ali","veli","deli"));

    public static void main(String[] args) {
        printList(list);
        System.out.println();
        System.out.print(list);
        System.out.println();
        for(String each : list){
            System.out.print(each+ " ");
        }
    }
//      print each value in arrayList
    public static void printList (ArrayList <String> list){
        Iterator<String> i=list.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+ " ");
        }
    }


}
