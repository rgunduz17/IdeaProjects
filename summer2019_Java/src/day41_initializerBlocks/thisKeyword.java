package day41_initializerBlocks;

public class thisKeyword {

    String name; // instance variable

    public thisKeyword (){
        this("this(); Calls another constructor");
//      this()
//          used for calling another method
//          must first in constructor body
    }
    public thisKeyword(String name){
        this.name =name;
//      this.VariableName = LocalVariableName;
//        this.
//        used for assign local variable to instance/static variable
        System.out.println("this. assign local variable to instance/static variable ");
    }
    public static void main(String[] args) {
        thisKeyword object = new thisKeyword();
        System.out.println(object.name);
    }
}
