package day33_ArrayList;

import java.util.Arrays;

public class WarmUp {
    
    /*
     Warm up:
    write a return method that accepts an int array and sorts it in descending order
    write a return method that accepts a double array and sorts it in descending order
    write a return method that accepts a char array and sorts it in descending order
    write a return method that accepts a String array and sorts it in descending order
        Hint: method overloading is prefered here
     */
    
    public static void main(String[] args) {
        
        int[] arr = {10,89,20,300,10,900, 0, 1};
        
            arr =   SortDe(arr);
            
            System.out.println( Arrays.toString( arr ) );
            
        double[] arr2 = { 10.5, 5.5, 300, 2.0, 6.5};    
            
            // arr2 = SortDe( arr2 );
            System.out.println(   Arrays.toString(  SortDe( arr2 ) ) );
        
            
        char[] ch = {'c','a', 'b', 'z', 'x', 'k'};
        
            ch = SortDe(ch);
            
            System.out.println(Arrays.toString(ch));
            
        String[] names = {"Mikray", "Jin", "Minever", "Nurzat", "Viktoria", "Erhan" };
        
        names = SortDe(names);
        
        System.out.println(Arrays.toString(names));
        
        
        
    }
    
    
    public static int[] SortDe(int[] arr) {
        
        Arrays.sort(arr);  // ascending order
        int[] arr2 = new  int[arr.length];   // can contain all values of arr
        int j=0;
        
        for(int i = arr.length-1;  i >= 0 ; i-- ) {
                arr2[j] = arr[i];
            //  arr2[arr.length-1-i] = arr[i];
                    j++;
        }
        
        return arr2;
    }
    
    
    public static double[] SortDe(double[] arr) {
        Arrays.sort(arr);  // ascending order
        double[] arr2 = new  double[arr.length];   // can contain all values of arr
        int j=0;
        
        for(int i = arr.length-1;  i >= 0 ; i-- ) {
                arr2[j] = arr[i];
            //  arr2[arr.length-1-i] = arr[i];
                    j++;
        }
        
        return arr2;
    }
    
    
    public static char[] SortDe(char[] arr) {
        Arrays.sort(arr);  // ascending order
        char[] arr2 = new  char[arr.length];   // can contain all values of arr
        int j=0;
        
        for(int i = arr.length-1;  i >= 0 ; i-- ) {
                arr2[j] = arr[i];
            //  arr2[arr.length-1-i] = arr[i];
                    j++;
        }
        
        return arr2;
    }
    
    
    public static String[] SortDe(String[] arr) {
        Arrays.sort(arr);  // ascending order
        String[] arr2 = new  String[arr.length];   // can contain all values of arr
        int j=0;
        
        for(int i = arr.length-1;  i >= 0 ; i-- ) {
                arr2[j] = arr[i];
            //  arr2[arr.length-1-i] = arr[i];
                    j++;
        }
        
        return arr2;
    }
    
    
    public static Integer[] SortDe(Integer[] arr) {
        Arrays.sort(arr);  // ascending order
        Integer[] arr2 = new  Integer[arr.length];   // can contain all values of arr
        int j=0;
        
        for(int i = arr.length-1;  i >= 0 ; i-- ) {
                arr2[j] = arr[i];
            //  arr2[arr.length-1-i] = arr[i];
                    j++;
        }
        
        return arr2;
    }


    public static class MethodCalls {

        public static void main(String[] args) {

            method1();   // method cannot can it self

                int max2 =  max(10, 20);  //20
                System.out.println( max2 );

                int max3 =  max(100, 200, 50);  // 200
                System.out.println(max3);


                maximum(400, 50000, 999999);  //999999

                String str = print(10,20,30);  // 30
                System.out.println(str);


        }


        public static void method1() {
        //   method2();         method cannot call it self.
            System.out.println("A");
        }

        public static void method2() {
            method1(); //A
            System.out.println("B"); //B
        }

        public static void method3() {
            method2(); // A B
            System.out.println("C");  //C
        }


        public static int max(int a, int b) {
                return ( a > b) ? a : b;
        }

        public static int max(int a, int b, int c) {
                //int largestNum = max(a, b);
            return  ( max(a, b)  > c ) ? max(a, b) : c ;

        }

        public static int max(int a, int b, int c, int d) {
            /*
            int result = max(a, b, c);
            if(result > d) {
                return result;
            } else {
                return d;
            }
            */
            // return  (result > d) ? result : d;

            return  max(    max(a, b)  ,   max(c, d)  );

        }

        public static int max(int a, int b, int c, int d, int e) {

                return  max(    max(a,b,c,d)  ,  e );

        }




        public static void maximum(int a, int b, int c) {
             System.out.println(    max(a, b, c) );
        }

        public static String print(int a, int b, int c) {
            maximum(a, b, c);
            return "900";
        }




    }
}