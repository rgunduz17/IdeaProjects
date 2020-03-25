package test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListPractice {

    public static void main(String[] args) {

//      Array to ArrayList
        int [] arr = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> list = ArrayToArrayList(arr);
        System.out.println("Array to ArrayList: "+list);

//      Find maximum value in ArrayList
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int max = maxNum(list3);
        System.out.println("Maximum number in ArrayList: "+max);

//      Find second maximum value in ArrayList
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int secondMax= SecondMax(list4);
        System.out.println("Second maximum number in ArrayList: "+secondMax);

//      Find third maximum value in ArrayList
        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int thirdMax= ThirdMax(list5);
        System.out.println("Third maximum number in ArrayList: "+thirdMax);

//      Find the minimum number in ArrayList
        ArrayList<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int min  = minNum(list6);
        System.out.println("Minimum number in ArrayList: "+min);

//      Find the second minimum number in ArrayList
        ArrayList<Integer> list7 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int secondMin= SecondMin(list7);
        System.out.println("Second minimum number in ArrayList: "+secondMin);
    }



    //      Find maximum value in ArrayList
    public static ArrayList<Integer> ArrayToArrayList (int [] arr){

        ArrayList<Integer> list = new ArrayList<>();

        for (Integer each : arr){

            list.add(each);
        }

        return list;
    }


    //      Find maximum value in ArrayList
    public static int maxNum (ArrayList<Integer> list){
        int max= Integer.MIN_VALUE;

        for (int each: list){
            if  (each > max){
                max = each;

            }
        }
        return max;
    }


    //      Find second maximum value in ArrayList
    public static int SecondMax (ArrayList<Integer> list){
        Integer max = maxNum(list);
        list.removeAll(Arrays.asList(max));

        int secondMax= maxNum(list);
        return secondMax;

    }


    //      Find third maximum value in ArrayList
    public static int ThirdMax (ArrayList<Integer> list){
        Integer secondMax = SecondMax(list);
        list.removeAll(Arrays.asList(secondMax));

        int thirdMax= maxNum(list);
        return thirdMax;

    }


    //      Find the minimum number in ArrayList
    public static int minNum (ArrayList<Integer> list){
        int min= Integer.MAX_VALUE;

        for (int each: list){
            if  (each < min){
                min = each;

            }
        }
        return min;
    }


    //      Find the second minimum number in ArrayList
    public static int SecondMin (ArrayList<Integer> list){
        Integer min = minNum(list);
        list.removeAll(Arrays.asList(min));

        int secondMin= minNum(list);
        return secondMin;

    }
}
