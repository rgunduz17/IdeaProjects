package day33_ArrayList;

import com.sun.xml.internal.ws.server.provider.SyncProviderInvokerTube;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListMethodsPractice {
    
    public static void main(String[] args) {
        
        //set(index number, Object):
            ArrayList<String> Javengers =  new ArrayList<>();
                Javengers.add("Jena");  // 0
                Javengers.add("Mary");  // 1
                Javengers.add("Tarah"); // 2
                Javengers.add("Mahriban"); // 3
            
                Javengers.set(1, "Seyfo");  // [Jena, Seyfo, Tarah, Mahriban]
                                // Pilot Nijat Borhan
            
                Javengers.remove( 0 );
                Javengers.add(0, "Pilot Nijat Borhan");
                System.out.println(Javengers);
        
                
        // remove(int):  removes the index
        // remove(Object): removes the first matching object and retuns boolean value
                ArrayList<Integer> numbers = new ArrayList<>();
                        numbers.add(1); //0
                        numbers.add(2); //1
                        numbers.add(3); //2
                        numbers.add(4); //3
                        numbers.add(5); //4
                        
                        numbers.remove( 3 );  // remeovs index 3 ==>[1, 2, 3, 5]
                    System.out.println(numbers);
                    
            //  numbers.remove( Integer.parseInt( "3" ) );  // parse method returns primitives
                boolean result = numbers.remove(  Integer.valueOf("3") ); // value of method returns wrapper class
                    
                System.out.println(numbers);
                System.out.println(result);


              int[] myArray = new int[numbers.size()];
        for (int i=0; i< numbers.size(); i++) {

            myArray[i]= numbers.get(i);

        }
        System.out.println("My array is: "+Arrays.toString(myArray));

        ArrayList<String> students = new ArrayList<>();
        students.add("Holly");
        students.add("Erhan");
        students.add("Nadira");
        students.add("Seyfo");
        students.add("Cihan");

        System.out.println("ArrayList: "+students);
        String[] myArray2 = new String[students.size()];
        for (int i=0; i< students.size(); i++) {

            myArray2[i]= students.get(i);

        }
        System.out.println("My string array is: "+Arrays.toString(myArray2));
        System.out.println(myArray2[0]);

        int []myArray3={9,8,7,6,5,4,3,2,1};
        ArrayList<Integer> list1 = new ArrayList<>(myArray3.length);

        for (int each: myArray3) {
            list1.add(each);
            Collections.sort(list1);
        }
        System.out.println("Int Array to ArrayList: "+list1);



    }
}
