package CodingBat.Warmup1;

public class missingChar {

/*
Given a non-empty string and an int n,
return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string
(i.e. n will be in the range 0..str.length()-1 inclusive).


missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
 */
    public static void main(String[] args) {
        missingChar obj = new missingChar();
        System.out.println(obj.missingChar("kitten",1));
        System.out.println(obj.missingChar("kitten",0));
        System.out.println(obj.missingChar("kitten",4));


    }

    public String missingChar(String str, int n) {
        return (str.substring(0,n)+str.substring(n+1, str.length()));
    }

}
