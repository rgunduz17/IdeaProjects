package test;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodReview {

    public static ArrayList<Integer> RemoveDup(ArrayList<Integer> list) {

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {

        if (! result.contains(each)) {
            result.add(each);

            }
        }
        return result;
    }

    public static ArrayList<String> RemoveDup2(ArrayList<String> list) {

        ArrayList<String> result = new ArrayList<>();

        for (String each : list) {

            if (! result.contains(each)) {
                result.add(each);

            }
        }
        return result;
    }



    public static void main(String[] args) {

//      remove duplicate int
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,1,2,2,2,3,3,3,3));
        list = RemoveDup(list);
        System.out.println(list);

//      remove duplicate String
        ArrayList<String> list2 =new ArrayList<>(Arrays.asList("Deli", "Ali","Deli", "Ali","Veli"));
        list2 = RemoveDup2(list2);
        System.out.println(list2);




    }


}