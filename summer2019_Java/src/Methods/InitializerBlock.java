package Methods;

public class InitializerBlock {



    static {
        System.out.println("static initializer block");  // executed as soon as class loaded,
                                                        // runs only one time
    }
    {
        System.out.println("Instance Block");
    }

    public InitializerBlock(){
        System.out.println("constructor block");
    }



    public static void main(String[] args) {

        InitializerBlock object1 = new InitializerBlock();
        InitializerBlock object2 = new InitializerBlock();

    }
}
