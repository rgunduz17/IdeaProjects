package CodingBat.Warmup1;

public class loneTeen {

    /*
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 2 int values, return true if one or the other is teen, but not both.


loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false

     */


    public static void main(String[] args) {
        loneTeen obj = new loneTeen();
        System.out.println(obj.loneTeen(13,99));
        System.out.println(obj.loneTeen(21,19));
        System.out.println(obj.loneTeen(13,13));

    }

    public boolean loneTeen(int a, int b) {
        if (((a>=13 && a<=19) && !(b>=13 && b<=19)) || (!(a >= 13 && a <= 19)&& (b >= 13 && b <= 19))){
            return true;
        }
        return false;
    }
}
