package CodingBat.Warmup1;

public class notString {


    /*
    Given a string,
    return a new string where "not " has been added to the front.
    However, if the string already begins with "not",
    return the string unchanged.
    Note: use .equals() to compare 2 strings.


        notString("candy") → "not candy"
        notString("x") → "not x"
        notString("not bad") → "not bad"
     */
    public static void main(String[] args) {
        notString obj = new notString();
        System.out.println(obj.notString("candy"));
        System.out.println(obj.notString("x"));
        System.out.println(obj.notString("not bad"));

    }

    public String notString(String str) {

        if (str.length()<=2) {
            return "not "+ str;
        } else if (str.substring(0,3).equals("not")){
            return str;
        }else {
            return "not "+ str;
        }


    }

}
