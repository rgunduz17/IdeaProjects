package javacodes;

public class Methods {


    public static void main(String[] args) {

        myFirstMethod();

        even0To100();




        oddOrEven(51);

        int b = 100;

        oddOrEven(b);




        sumOfTwoNumbers (10, 20);






        String e= "abbasdfsadfadfasdfasdfasdfasdf";

        removeDuplicates(e);

    }

//      Method declaration
//       public             static          void            main(String[] args) {
//      access modifier ---specifier -----return type ----Method name () {}

//      access modifier: public, protected, default, private,
//      specifiers: static, abstract, final
//      return type void ...

//      return type
//      1. void ==>> does not return any value

    public static void myFirstMethod() {

        System.out.println("Hello World");

        System.out.println("Hello Cybertek");

        System.out.println("Hello Ridas");


    }

    public static void even0To100() {

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
//      2. Method with parameters /(arguments);

//      access modifier --specifier --  return type--  method name (parameter)

    //         You must provide correct type while calling method in main method
    public static void oddOrEven(int a) {

        if (a % 2 == 0) {
            System.out.println(a + " is even number.");
        } else {
            System.out.println(a + " is odd number.");

        }

    }


    public static void sumOfTwoNumbers (int c, int d) {



        System.out.println("Sum of " + c + " and " + d +" is " + (c+d));

    }


    public static void removeDuplicates (String e) {


        String result = "";
        for(int i= 0; i< e.length(); i++) {
            if (!result.contains(e.substring(i, i+1))){
                //          ("" + word.charAt(i))
                result += e.substring(i, i+1);
            }

        }
        System.out.println(result);



    }









}


