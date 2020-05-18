package test;

public class Test12 {


   static String name = "Aaron";

    public static void main(String[] args) {
        System.out.println("Daniel");
    }

    public static void print(String str){
        System.out.println( str);
    }
    
    static {
        print(name);
    }
}
