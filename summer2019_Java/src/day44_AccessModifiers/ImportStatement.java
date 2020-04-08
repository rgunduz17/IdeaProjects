package day44_AccessModifiers;

import static day44_AccessModifiers.Testdata.ID;

public class ImportStatement {


    public static String Name = "Juline";
    public static String ID = "007";

    public static void main(String[] args) {

        System.out.println( Name );
        System.out.println(Testdata.Name);
        System.out.println( ID );
    }
}
