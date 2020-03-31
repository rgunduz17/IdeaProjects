package javacodes;

public class EncapsulationTest {

    public static void main(String[] args) {

        Encapsulation object1 = new Encapsulation();

      //  System.out.println(object1.Name);   access modifier is private

        System.out.println(object1.getName());

        String str = object1.getName();

      //  System.out.println(object1.ID);   access modifier is private

        System.out.println(object1.getID());

        int a = object1.getID();


//      setter
        object1.setName("Ali");

        System.out.println(object1.getName());

        object1.setID(54321);

        System.out.println(object1.getID());


    }
}
