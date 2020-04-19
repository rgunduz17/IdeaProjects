package day54_Polymorphism;

class Animal{
    
    public void Talk() {
        System.out.println("Animal is talking");
    }
    
}
class Tiger extends Animal{
    
    public void Hunt() {
        System.out.println("Tiger is hunting");
    }
    
    public void Talk() {
        System.out.println("Tiger is talking ==> Roar");
    }
}
class Octopus extends Animal {
    
    public void Swim() {
        System.out.println("Octopus is swimming");
    }
    
    
    public void Talk() {
        System.out.println("Octopus is talking ==> gologolo");
    }
    
    
}
public class Zoo {
    
    public static void main(String[] args) {
        Tiger tiger1 =  new Tiger();
        Tiger[] Tigers = { tiger1, new Tiger() };
        
        Octopus octopus1 = new Octopus();
        Octopus[] octopus = {octopus1, new Octopus() };
        
        Animal        animal1     =   new Tiger();
//  reference type    referenceName    object
            animal1.Talk();
           // animal1.Hunt();
                    // reference type decides what can be called, 
            // hunt method is not exist in reference type
        
        Animal  animal2  =  new   Octopus(); 
    //  animal2.Swim();  
            // animal class (referencetype) does not have swim()
        
        animal2.Talk();   // Octopus is talking 
        
        
    }
    
}


//      Polymorphism: objects to behave in multiple forms
//                    occurs when the super class/interface is reference type
//                      and object is created from the classes that
//                         has IS A relation with the super class

//                  classA          object          =        new classA();
//                  referenceType   referenceName            object

//      2 IMPORTANT RULES:
//              1. reference type decides what is accessible and what can be used
//              2. reference type can be parent class or interface, and objects can be any sub class

//      IS A relation: is inherited relationship between classes
//                  Ex: class dog extends Animal
//                      class Husky extends Dog
//                      Dog is an Animal
//                      Husky is a Dog
//                      Husky is an Animal

//      HAS A relation: instance of the class (object) is used in another classes
/*
                  Ex: class Car {
                        Engine obj = new Engine();
                  }
                Car has an engine

                    class zoo {
                    Tiger obj1 = new Tiger();
                    Octopus obj2 = new Octopus();
                    Animal obj3 = new Tiger();

            Zoo has a Tiger
            Zoo has an Octopus
            Zoo has an Animal

            Tiger is an Animal
 */