package InterviewQuestions;

public class OverloadToMainMethod {


    // In JAVA all methods can overload even main method

    // OVERLOADING ; same method name with different parameter

    public static void main(String[] args) {

        System.out.println("String Array");

    boolean [] array1 = {true, false};
    main (array1);

    double [] array2 = {1,2,3};

    main (array2);

    int [] array3 = {1,2,3};

    main (array3);

    }

    public static void main (int [] args) {

        System.out.println("int Array");
    }

    public static void main (double [] args) {

        System.out.println("double Array");
    }


    public static void main (boolean [] args) {

        System.out.println("boolean Array");
    }





}
