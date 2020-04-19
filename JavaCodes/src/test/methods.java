package test;

public class methods {

//      method declaration
//      access modifier -- specifier-- return type --  method name(parameter/s){
//              statements/body of the method ;
//          }


//      VOID RETURN TYPE:

    int a=1;
    static int b=2;


    public  void method1(){
        System.out.println("Void return type without parameter");
    }

    public  void method2(int a, int b){
        System.out.println("Void return type with parameters: "+ (a+b));
    }


    public static void main(String[] args) {



        methods object0 = new methods();
        object0.method1();  // void
        object0.method2(10,20);  //  void

        System.out.println("***********************************");

        methods object = new methods();
        object.sum(15,20);  // instance method return type int
        System.out.println(object.sum(15,20));

        object.sum2(20,20); // instance method return type void

        System.out.println("***********************************");

        methods object2 = new methods(); // default constructor
        methods object3 = new methods(50,50); // constructor with parameters

        System.out.println("***********************************");

        method3();      // static method
        method4(50,30);  // static method
        System.out.println(method4(50,30));



    }


// INSTANCE METHOD:  (NO STATIC KEYWORD)


    public int sum(int a, int b){
        return a+b;
    }

    public void sum2(int a , int b){
        System.out.println(a+b);
    }


//     CONSTRUCTOR

    public methods(){
        this(10,20); // method calling in another constructor
        System.out.println("Default constructor");
    }

    public methods(int a, int b){
       // System.out.println("Constructor with parameters: "+ (a+b));
    }

//    STATIC METHOD

    public static void method3(){
        System.out.println("Static method");
    }

    public static int method4(int a, int b){
        return a-b;
    }


    {
        System.out.println("Instance block");
    }

    static {
        System.out.println("static block");
    }


}
