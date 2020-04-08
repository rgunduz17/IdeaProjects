package day44_AccessModifiers;

import static day44_AccessModifiers.Testdata.ID;

//import static day44_AccessModifiers.Testdata.Name;
//                  packagename    classname.staticName
 
import static day44_AccessModifiers.Testdata.*;
// import all class members from package

public class Test {
    public static String Name ="Muhtar";
    
    public static void main(String[] args) {
        
        System.out.println( Name );  // Muhtar
        System.out.println(Testdata.Name); // Ridvan
        System.out.println( ID ); // 007
        // ID class member imported
    }
}
