package test;

import java.util.Scanner;
class AddToArray {

    public static void add_to_r(int[] r,int n)
    {
        int size=r.length+1;
        int[]newArr=new int[size];
        for(int i=0;i<r.length;i++){
            newArr[i]=r[i];

        }
        newArr[size-1]=n;

        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }

    }

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(),n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);

    }
}
