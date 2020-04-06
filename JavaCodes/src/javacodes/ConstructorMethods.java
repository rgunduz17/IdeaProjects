package javacodes;



public class ConstructorMethods {

//      Constructor:
//          1. Every class must have constructor,
//          2. If we don't give any constructor
//              then compiler will give the default constructor
//          3. Execution depends on the creation of the object
//          4. Constructor's name MUST be same with class
//          5. Constructor can be overload
//          6. No return type needed

//      declaration of constructor:
//          access modifier className (parameter) {
//              statement;
//          }

    public ConstructorMethods() {

        System.out.println("Default constructor - without parameter");
    }


// to execute constructor : create a new object

                        //    className  referenceName = new  existingConstructorMethod

    public ConstructorMethods(int a){

        System.out.println("Constructor - with parameter: "+ a);
    }

//    constructor call;
//      1. Only a constructor can call another constructor
//      2. Constructor cannot be called by their name,
//          we must use this() keyword to call current constructor
//      3. Constructor call has to be priority in the constructor
//      4. One constructor can only call one constructor
//      5. Constructor cannot call itself or contain itself

    public ConstructorMethods(boolean a){

        this(100);
        System.out.println("Constructor - with parameter: "+ a);
    }

    public ConstructorMethods(double a){

        this(100);
        // this(20);   only call one constructor


    }





    public static void main(String[] args) {

//      created a new object

        ConstructorMethods object1 = new ConstructorMethods();

        ConstructorMethods object2 = new ConstructorMethods(12345);

        ConstructorMethods object3 = new ConstructorMethods(100);

        ConstructorMethods object4 = new ConstructorMethods(true);






        }



    }


