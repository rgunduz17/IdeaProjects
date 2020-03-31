package javacodes;

public class Encapsulation {

//    OOP: Object Oriented Programming

//    Encapsulation: to hide the instance variable (hiding data)

    private String Name= "Ridvan";

    private int ID = 12345;

//  private : only visible within the class / codes outside the class cannot access to the data

//            1. hiding the data by giving private access modifier
//            2. grants other classes get access to the private data using public getter and setter

//      getter (Read): an instance method that returns private data / access modifier should be public


//      setter (Modify): an instance method that passes a parameter.
//                       the parameter must be assign to the instance variable.
//                       if the parameter has the same name with instance variable,
    //                        we need to use this. keyword to call instance variable.

//      getter
    public String getName(){
        return Name;
    }

    public int getID(){
        return ID;
    }

// setter
    public void setName(String Name){
        this.Name = Name;
    }

    public void setID(int ID){
        this.ID = ID;
    }





// this. : used for calling the instance variables in an object instance
//         we only use it when the local variable has the same name with the instance variable
}
