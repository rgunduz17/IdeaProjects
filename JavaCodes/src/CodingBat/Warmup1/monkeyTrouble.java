package CodingBat.Warmup1;

public class monkeyTrouble {

    /*
    We have two monkeys, a and b,
    and the parameters aSmile and bSmile indicate if each is smiling.
    We are in trouble if they are both smiling or if neither of them is smiling.
    Return true if we are in trouble.


monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
     */
    public static void main(String[] args) {
        monkeyTrouble obj = new monkeyTrouble();
        System.out.println(obj.monkeyTrouble(true,true));
        System.out.println(obj.monkeyTrouble(false,false));
        System.out.println(obj.monkeyTrouble(true,false));

    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile)|| (!aSmile && !bSmile)){
            return true;
        }
        return false;
    }
}
