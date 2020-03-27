package test;

public class Test123 {

    public static void main(String[] args) {


        //1. Solution
            String input ="12345";
        for(int i = 0; i < input.length(); i++)
            System.out.print( input.charAt(i) + "\n" );

        System.out.println("==========================");

        // 2.Solution
        String input2 = 12345 + "";
        for(int i = 0; i < input2.length(); i++)
            System.out.println( input2.charAt(i) );

        System.out.println("==========================");

        // 3. Solution
        int input3 = 12345;
        String str = String.valueOf(input3);
        for(int i = 0; i < str.length(); i++)
            System.out.print( str.charAt(i) + "\n" );

        System.out.println("==========================");

    }
}
