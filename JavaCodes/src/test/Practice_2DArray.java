package test;

import java.util.Arrays;

public class Practice_2DArray {

    public static void main(String[] args) {

        int [][] arr2D = {{1,2},{3,4,5,6,7 }, {8,9}};

        int length = arr2D.length;

        System.out.println(length);

        for(int i=0; i < arr2D.length; i++) {
            System.out.println(Arrays.toString(arr2D[i]));

        }



                  for(int i=0; i < arr2D.length; i++) {

                      for (int j = 0; j < arr2D[i].length; j++) {
                          System.out.print(arr2D[i][j] + " ");
                      }

                  }
//        for (int j= 0; j < arr2D.length; j++ ){
//                for(int i=0; i < arr2D[j].length; i++) {
//
//
//                System.out.print(arr2D[j][i] + " ");
//            }









    }
}
