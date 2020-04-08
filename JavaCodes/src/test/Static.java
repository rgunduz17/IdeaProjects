package test;

import javacodes.StaticKeyWords;

public class Static {

    int a;          // instance variable
    static int b;   // static variable

    public static void main(String[] args) {

        Static obj1 = new Static();
        obj1.a = 100;  // assign value to instance variable

        Static obj2 = new Static();
        obj2.b = 200;  // assign value to static variable

        Static obj3 = new Static();
        System.out.println("Instance Variable: "+obj3.a);  // 0
        System.out.println("Static Variable: "+obj3.b);    // 200

        Static.method1();
//         (method with static keyword )
//         can be call with classname through method name
//
//       //StaticKeyWords.method2();
//        (method without static keyword)
//        CANNOT be call with classname through method name
        Static object5 = new Static();
        object5.method2();

    }
    public static void method1() {
        System.out.println("Static method");
    }

    public void method2() {
        System.out.println("non static method");
    }
}


