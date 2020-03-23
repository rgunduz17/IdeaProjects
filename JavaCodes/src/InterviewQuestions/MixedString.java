package InterviewQuestions;



public class MixedString {


    public static String mixString(String s1, String s2) {

        String str = "";

        int j=0;
            for (int i = 0; i < s1.length(); i++) {

                str += "" + s1.charAt(i) + s2.charAt(j);
                j++;
            }


            return str;

    }
        //test case below (dont change):

        public static void main (String[] args){
            System.out.println(mixString("12345", "abcde")); //should be 1a2b3c4d5e
            System.out.println(mixString("howdy", "hello")); //should be hhoewldlyo
        }



}