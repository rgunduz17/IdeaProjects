package day27_CustomMethods.Methods;

public class Mustafa {

    // public Mustafa(){        // constructor method
    //  statement;
    //  }

    String name;  // instance variable

    public static void main(String[] args) {
//  creating new object
        Mustafa object1 = new Mustafa();
       // Mustafa object2 = new Mustafa(3,5);

    }

    public Mustafa(){
        this(3,5);
        System.out.println("Default constructor");

    }

    public Mustafa(int a, int b){
        System.out.println("constructor with parameters "+ (a+b));
    }

    public Mustafa(String name){
        this.name = name; // local variable = instance variable

    }


}
