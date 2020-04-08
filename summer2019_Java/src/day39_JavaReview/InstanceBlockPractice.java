package day39_JavaReview;

import day41_initializerBlocks.InstanceBlock;

public class InstanceBlockPractice {
    public String name = "Ridvan"; // instance variable
    {
        name = "Ali";  // instance block
//      Execute first
    }
    public InstanceBlockPractice(){
        this(10); // call another constructor
//      Execute second

        name = "Veli";
//      Execute third
    }
    public InstanceBlockPractice(int a) {
        name = "Deli"; // Execute second (this(10))
    }
    public static void main(String[] args) {
        InstanceBlockPractice object = new InstanceBlockPractice();

        System.out.println(object.name); // Veli

        object.name = "John";   // assign new value to object
        System.out.println(object.name); // John
    }
}
