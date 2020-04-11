package CodingBat.Warmup1;

public class frontBack {

    /*
    Given a string,
    return a new string where the first and last chars have been exchanged.


    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
     */


    public static void main(String[] args) {
        frontBack obj = new frontBack();


        System.out.println(obj.frontBack("code"));
        System.out.println(obj.frontBack("a"));
        System.out.println(obj.frontBack("ab"));



    }
    public String frontBack(String str) {
        if(str.length()>1) {
            return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
        }
        return str;
    }

}
