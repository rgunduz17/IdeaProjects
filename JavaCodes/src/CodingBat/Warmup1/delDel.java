package CodingBat.Warmup1;

public class delDel {

    /*
    Given a string, if the string "del" appears starting at index 1,
    return a string where that "del" has been deleted.
    Otherwise, return the string unchanged.


delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
     */

    public static void main(String[] args) {

        delDel obj = new delDel();
        System.out.println(obj.delDel("adelbc"));
        System.out.println(obj.delDel("adelHello"));
        System.out.println(obj.delDel("adedbc"));

    }

    public String delDel(String str) {
    if((str.length()>=4)&&(str.substring(1,4).equalsIgnoreCase("del"))){
        return ""+str.charAt(0)+str.substring(4,str.length());
    }
    return str;
    }
}
