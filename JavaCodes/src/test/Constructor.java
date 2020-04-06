package test;

public class Constructor {

    public Constructor() {
        System.out.println("Default constructor - without parameter");
    }

    public Constructor(int a) {
        System.out.println("Constructor - with parameter: " + a);
    }

    public static void main(String[] args) {
//      to execute constructor : create a new object

//       className  referenceName = new  existingConstructorMethod
        Constructor object1 = new Constructor();
        // default constructor - no parameter

        Constructor object2 = new Constructor(10);
        // constructor with a  parameter
    }
}

