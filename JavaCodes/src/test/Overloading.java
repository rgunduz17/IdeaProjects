package test;

public class Overloading {

    public static void method1(){
        System.out.println("no parameter");
    }

    public static void method1(String name){
        System.out.println("with String parameter");
    }

    public static void method1(int a){
        System.out.println("with int parameter");
    }

    public static String method1(String test, String test2){
        return "Test";
    }

    public static int method1(int a, int b){

        return a+b;
    }

    public static void main(String[] args) {
        method1();
        method1("abc");
        method1(10);
        System.out.println(method1("abc", "def"));
        System.out.println(method1(10,20));
    }

}
