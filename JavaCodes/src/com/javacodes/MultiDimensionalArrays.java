package com.javacodes;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;

public class MultiDimensionalArrays {


    public static void main(String[] args) {

//  multidimensional arrays
// contains n-1 dimensional array

        int [] arr1D=  {1,2,3};

        int [][] arr2D=  {{1,2,3}, {4,5,6}};

        String [] str1D = {"A", "B"};
        String [][] str2D = {{"A", "B"}, {"C","D","E"}};

//      [represent index number of 1 dimensional array ] [represent index number of value]
//        [index of array][index of value]

        System.out.println(str2D[0][0]);
        System.out.println(str2D[1][1]);
        System.out.println(str2D[1][2]);

        System.out.println(Arrays.toString(str2D[0]));
        System.out.println(Arrays.toString(str2D[1]));

//         Arrays.deepToString (variableNames  )        for multidimensional arrays
        System.out.println(Arrays.deepToString(str2D));


//      3 dimensional array contains 2 dimensional array

        int [][] Array2D = {{1,2}, {3,4}};

        int [][][] Array3D = { {{1,2}, {3,4}} ,  {{5,6}, {7,8}}       };

        //      [index of 2D array][index of 1D array][index of value]

        System.out.println(Array3D [1][1][1]); //8

        System.out.println(Arrays.toString(Array3D [1][0])); //{5,6}

        System.out.println(Arrays.deepToString(Array3D [1])); // {{5,6}, {7,8}}

        System.out.println(Arrays.deepToString(Array3D));// { {{1,2}, {3,4}} ,  {{5,6}, {7,8}}       }


    }
}
