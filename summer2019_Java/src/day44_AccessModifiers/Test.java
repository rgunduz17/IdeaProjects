package day44_AccessModifiers;

import static day44_AccessModifiers.Testdata.ID;

import java.util.Arrays;

//import static day44_AccessModifiers.Testdata.Name;
//                  packagename    classname.staticName
 
import static day44_AccessModifiers.Testdata.*;
 
public class Test {
    public static String Name ="Muhtar";
    
    public static void main(String[] args) {
        
        System.out.println( Name );
        System.out.println(Testdata.Name);
        System.out.println( ID );
        System.out.println( SchoolName);
        
        System.out.println(age);
        
        
    }
}
