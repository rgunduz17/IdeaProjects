package day29_ReturnMethods;

public class OverloadPractice {
    
    
    public static void main(String[] kfc) {
        
        System.out.println("String Array");
        
        boolean[] array1 = {true, false};
            main(array1);
            
        double[] array2 = {1,2,3};
          main(array2);
        
          return;
          
        //   System.out.println("hello");  // return statement exits the method as soon as it gets executed
          
          
    }
    
    
    public static void main(int[] a) {
        System.out.println("Int Array");
    }
    
    public static void main(double[] b) {
        System.out.println("double Array");
    }
    
    public static int main (boolean[] c) {  // return type does not matter
        System.out.println("boolean array");
        return 78;
    }
    
//      NOTE:   return type does not matter
//                can use with (void or data types) as return type
//        BENEFITS:   1.increases the readability of the program
//                    2.used to perform a task efficiently
//	                  3.common name with slight variation in argument number or types
}
