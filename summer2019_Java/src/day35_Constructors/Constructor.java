package day35_Constructors;

public class Constructor {

    public Constructor(int a) {
        this(10.5); // 1. this() must be first statement in constructor body
//                       2. Only a constructor can call another constructor
        System.out.println("constructor with INT argument: "+a);
    }
    public Constructor(double a) {
//        this(15.5);   3. Constructor CANNOT call/contain itself
        System.out.println("constructor with DOUBLE argument: "+a);
    }
    public Constructor(boolean a) {
        this(25.5);
//        this(500);   4. One constructor ONLY call one constructor
        System.out.println("constructor with BOOLEAN argument of: "+a);
    }
    public static void main(String[] args) {
//      Constructor(100);  5. Constructor cannot be called by constructorName()
        Constructor object1 = new Constructor(100);
        Constructor object2 = new Constructor(true);
    }


//    Constructor Call:
//        1. this() must be first statement in constructor body
//        2. Only a constructor can call another constructor
//        3. Constructor CANNOT call/contain itself
//        4. One constructor ONLY call one constructor
//        5. Constructor cannot be called by constructorName()
}
