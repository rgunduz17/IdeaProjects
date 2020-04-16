package day49_Recap;

// abstract class
public abstract class Abstraction {
    // abstract method
    public abstract void startTheCar();
}
class Toyota extends Abstraction{
    // public abstract void startTheCar();
    @Override
    public void startTheCar() {
        System.out.println("Brake");
        System.out.println("push the start button");
        System.out.println("Release the brake");
    }
    public static void main(String[] args) {
        //Abstraction  obj = new Abstraction ();
    }}
class Tesla extends Abstraction{
        // regular class MUST implement the abstract methods from the abstract class
    public void startTheCar() {
        System.out.println("voice control");
        System.out.println("driver");
    }
}


//  ABSTRACTION:
//              Concentrating on essentials/important things
//              ignore about the details/implementations
//              hiding the implementation details
//              Only applicable to class or method

//  Abstract method:
//              A method without body/implementations
//              it's a method that is meant to be override in the sub class
//              Cannot be static, private or final
//              Only the instance method can be overridden and can be abstract
//              abstract method can only be declared in abstract class and interface

//   declaration of abstract method:
//              Access modifier abstract return type methodName();
//          EX:  public  abstract void start();

//    shortcut for override method:
//                  Click ==> code => (generate) => override methods

//    abstract class:
//              abstract is something not concrete
//              we cannot create object from abstract class
//              its a class meant to be extended
//              abstract class cannot be final
//              if the sub class is abstract, no need to override


