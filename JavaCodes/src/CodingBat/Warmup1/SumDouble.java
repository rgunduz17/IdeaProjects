package CodingBat.Warmup1;

public class SumDouble {

    /*
    Given two int values, return their sum.
    Unless the two values are the same,
    then return double their sum.


sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8

     */

    public static void main(String[] args) {

        SumDouble object = new SumDouble();
        System.out.println(object.sumDouble(1,2));
        System.out.println(object.sumDouble(3,2));
        System.out.println(object.sumDouble(2,2));

    }

    public int sumDouble(int a, int b) {

        if (a==b){
            return 2*(a+b);
        }
        return a+b;
    }
}
