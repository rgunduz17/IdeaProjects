package CodingBat.Warmup1;

public class in1020 {

    /*
    Given 2 int values,
    return true if either of them is in the range 10..20 inclusive.


in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
     */

    public static void main(String[] args) {

        in1020 obj =new in1020();
        System.out.println(obj.in1020(12,99));
        System.out.println(obj.in1020(21,12));
        System.out.println(obj.in1020(8,99));

    }

    public boolean in1020(int a, int b) {

        if((((a >= 10 && a <= 20) || (b >= 10 && b <= 20)))){
            return true;
        }
        return false;
    }
}
