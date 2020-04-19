package day53_InterfaceContinue;

// interface declaration
public interface InterfacePractice {

    public default void methodC() {

    } // default method

    public abstract void methodA(); // abstract method

    public static void mm() {

    } // static method

    int a =100; // public static final by default

    // public static final given by default
    public static final int b = 200;

    public static void main(String[] args) {
        InterfacePractice.mm();

        System.out.println(a); // variables are static by default
    }
}

interface Data2{
    public void methodA();
}

interface Data{
}
//                      unlimited supertype
class Test2 implements Data2,           Data {
//	  subtype			supertype,	  supertype

    @Override
    public void methodA() {

    }
}