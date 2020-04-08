package day43_JavaRecap;

import netscape.javascript.JSUtil;

public class InstanceMethod {

    public static void main(String[] args) {
        InstanceMethod obj = new InstanceMethod();
//          instance method
//              create an object to call it
        System.out.println(obj.sum(3, 2));

//      static method (no need to create an object)
//      call through methodName
        int result = test(1,2);
        System.out.println(result);
//      call through className
        int result2= InstanceMethod.test(3,4);
        System.out.println(result2);
    }
    int f;  // instance variable
    public double sum(int x, int y) {
//         this method is instance method
//         because we don't write static
        f = x + y;
        return f;
    }

    public static int test (int a, int b){
    //  static method
        return a+b;
    }
}

