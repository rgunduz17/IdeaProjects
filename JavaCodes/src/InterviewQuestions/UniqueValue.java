package InterviewQuestions;

import org.w3c.dom.ls.LSOutput;

public class UniqueValue {

    public static void main(String[] args) {
        String words= "one two three";

        String [] arr = words.split(" ");
        int a= arr.length;
        System.out.println(a);

        String uniqueCharacters = UniqueVal("AMAAABBBASSACCSFG");
        System.out.println(uniqueCharacters);
    }
    public static String UniqueVal (String str) {



        String Unique= "";

        for (int j= 0; j < str.length();  j++) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals("" + str.charAt(j))){
              //if (str.charAt(i) == str.CharAt(j)) {}
                    count++;
                }
            }
            if (count ==1) {
                Unique += "" + str.charAt(j);
            }
        }

        return Unique;
    }



}
