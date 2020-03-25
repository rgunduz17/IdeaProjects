package javacodes;



public class ConstructorMethods {


//  declaration of constructor
//  access modifier className (parameter) { statement}

    public ConstructorMethods() {

        System.out.println("Default constructor - without parameter");
    }


// to execute constructor : create a new object

                        //    className  referenceName = new  existingConstructorMethod

    public ConstructorMethods(int num){

        System.out.println("Constructor - with parameter: "+ num);
    }


    public static void main(String[] args) {

//      created a new object

        ConstructorMethods object1 = new ConstructorMethods();

        ConstructorMethods object2 = new ConstructorMethods(12345);

//        System.out.println("object1: "+object1);
//
//        System.out.println("object2: "+object2);

//          Constructor Methods

//          1.

        }



    }


