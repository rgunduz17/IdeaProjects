package javacodes;

public class StaticKeyWords {

    // static : access the members through the class name

    // static members: belongs to class

    // static variables: created in the class, outside any method with static keyword

    // static methods: a method that we can call through the class name



    //  instance variable VS static variables
    // belongs to object        belongs to class(class variables)
    //

    int a; // instance variable
    static int b;


    public static void main(String[] args) {

        StaticKeyWords obj1 = new StaticKeyWords();
        obj1.a=100;

        StaticKeyWords obj2 = new StaticKeyWords();
        obj2.a=200;

        System.out.println(obj1.a);
        System.out.println(obj2.a);

        System.out.println("===================");

        System.out.println(StaticKeyWords.b);
        System.out.println(obj1.b);
        System.out.println(obj2.b);


        System.out.println("===================");

        StaticKeyWords obj3 = new StaticKeyWords();
        obj3.a=100;
        System.out.println(obj3.a);
        obj3.b=400;
        System.out.println(obj3.b);

        StaticKeyWords obj4 = new StaticKeyWords();

        System.out.println(obj4.a);
        System.out.println(obj4.b);


        StaticKeyWords.method1(); // (static keyword )can call with classname with method name
        //StaticKeyWords.method2();   cannot call with classname with method name
                                    // create object with new keyword

        StaticKeyWords object5 = new StaticKeyWords();
        object5.method2();
    }

    public static void method1(){
        System.out.println("Static method");
    }

    public void method2(){
        System.out.println("non static method");
    }
}
