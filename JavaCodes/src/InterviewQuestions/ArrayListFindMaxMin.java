package InterviewQuestions;

import java.util.ArrayList;

public class ArrayListFindMaxMin {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // FIND MAX AND MIN NUMBER WITHOUT USING SORT METHOD

        int maxNum= maximum(list);
        System.out.println(maxNum);

        int minNum = minimum(list);
        System.out.println(minNum);


    }

    public static  int maximum (ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;

        for(int each : list ){
            if (each > max){
                max= each;
            }
        }



        return max;
    }

    public static  int minimum (ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;

        for(int each : list ){
            if (each < min){
                min= each;
            }
        }



        return min;
    }












}
