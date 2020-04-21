package day23_Arrays;

import java.util.Arrays;

public class arrayTest {

    public static void main(String[] args) {

        int[] myArray3 = {1,3,5,6,2,4,8,9,7,15};
        for(int i=0; i < myArray3.length/2; i++){
            int temp = myArray3[i];
            myArray3[i]= myArray3[myArray3.length-i-1];
            myArray3[myArray3.length-i-1]= temp;
            System.out.println("Replace int "+myArray3[i]+" with "+ myArray3[myArray3.length-1-i]);

        }
        System.out.println();
        System.out.println(Arrays.toString(myArray3));
    }
}
