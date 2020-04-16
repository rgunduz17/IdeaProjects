package CodingBat.Warmup1;

public class startHi {

    /*
    Given a string,
    return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
     */

    public boolean startHi(String str) {
        if((str.length()>=2) && str.substring(0,2).equalsIgnoreCase("hi") ){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        startHi obj = new startHi();
        System.out.println(obj.startHi("hi there"));
        System.out.println(obj.startHi("hi"));
        System.out.println(obj.startHi("hello hi"));

    }
}
