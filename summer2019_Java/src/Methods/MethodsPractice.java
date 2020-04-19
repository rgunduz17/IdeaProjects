package Methods;

public class MethodsPractice {

    //      method declaration
//      access modifier -- specifier-- return type --  method name(parameter/s){
//              statements/body of the method ;
//          }

    int a= 1;       // instance variable
    static int b = 2; // static variable

    public void method1(){  // instance method
        System.out.println("void method");
    }

    public void method2(int a, int b){  // instance method
        System.out.println("void with arguments / parameters");
    }

    public static void method3(){  // static method
        System.out.println("Static method");
    }

    public static int method4(int a , int b){  // static method
        return a+b;
    }

    public static void main(String[] args) {

        method3();
        method4(10,20);

        int b=method4(10,20);
        System.out.println(b);

//      className object = new Constructor();
        MethodsPractice object = new MethodsPractice();
        object.method1();

        object.method2(30,30);

        MethodsPractice object2 = new MethodsPractice();
        System.out.println("a: "+object2.a);
        System.out.println("b: "+ b);

    }


}
