package test;

public class StaticBlock {

    static String name; // static variable
    String lastName;    // instance variable

//      STATIC BLOCK
    static {
        name = "Ridvan";
        System.out.println(name);
        System.out.println("Static block");
    }
//      INSTANCE BLOCK
    {
        System.out.println("instance Block");
    }

    public StaticBlock(String lastName){
        this.lastName= lastName;
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        StaticBlock object = new StaticBlock("Gunduz");
        System.out.println(object.lastName);

    }
}
