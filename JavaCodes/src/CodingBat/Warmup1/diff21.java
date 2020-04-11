package CodingBat.Warmup1;

public class diff21 {

    /*
    Given an int n, return the absolute difference between n and 21,
    except return double the absolute difference if n is over 21.

    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0
    */

    public static void main(String[] args) {
        diff21 obj1 = new diff21();
        System.out.println(obj1.diff21(19));
        System.out.println(obj1.diff21(10));
        System.out.println(obj1.diff21(21));
        System.out.println(obj1.diff21(-1));
        System.out.println(obj1.diff21(0));

    }



    public int diff21(int n) {
        int result = 0;
        if (n > 21) {
            result = 2 * (n-21);
        }else if(n <0){
            result = 21 + (-n);
        }else {
            result = 21-n;
        }
        return result;
    }
}
