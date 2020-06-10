package test;

public class Test {

    public Test() {
        System.out.println("Test 1");
    }

    public Test(String name){
        this();
        System.out.println("Test 2");

    }

    public Test(int a){
        this("aaa");
        System.out.println("test 3");
    }

    public static void main(String[] args) {
    //    Test obj1 = new Test();
    //    Test obj2 = new Test("abc");
    //    Test obj3 = new Test(10);
        Test2 obj4= new Test2();

    }


    public static class Test2 extends Test{

        public Test2(){
          //  super();
            super("test2");
            System.out.println("abc");
        }
    }
}
