package test;

public class QuestionOfTheDay {

    /*
    int a = 20;
    int b = 3;
    Please divide  “a” to “b”  without using “/” and “%”.
     */


    // creating a method to divide a to b
    static int division(int a, int b)
    {
        if (a == 0)
            return 0;
        if (b == 0)
            return -1; // not divisible

        boolean negativeResult = false; // if negative

        // Handling negative numbers
        if (a < 0)
        {
            a = -a ;
            if (b < 0)
                b = - b ;
            else
                negativeResult = true;
        }
        else if (b < 0)
        {
            b = - b ;
            negativeResult = true;
        }

        // if a is greater than equal to b
        // subtract b from a and increase
        // quotient by one.
        int quotient = 0;
        while (a >= b)
        {
            a = a - b ;
            quotient++ ;
        }

        // checking if neg equals to 1 then making
        // quotient negative
        if (negativeResult)
            quotient = - quotient ;
        return quotient ;
    }

    // Driver program
    public static void main (String[] args)
    {
        int a = -21, b = -3 ;
        System.out.println( "Division of "+ a+ " to "+b +" is: "+division(a, b) );

    }
    
// this line is edited in github
      
}



