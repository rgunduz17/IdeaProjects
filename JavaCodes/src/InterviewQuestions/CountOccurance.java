package InterviewQuestions;

public class CountOccurance {

    public static void main(String[] args) {

        // count how many a b c d are there in string

        int count =   count("abcadabcdaabada", "a");
        System.out.println(count);

        // remove repeating characters and return non repeating char.
        String remove= RemoveDup("abcabcabcabcd");
        System.out.println(remove);


        // check how many a are there and return a5, check how many b are there return b4 etc

        String frequency = frequency("abcdabcdabcdabcdabcabcdaabcd");
        System.out.println(frequency);
    }


    // remove repeating characters and return non repeating char.
    public static String RemoveDup(String str){

        String result = "";


        for (int i= 0; i < str.length(); i++){

            if ( ! (result.contains(str.substring(i, i + 1)))){

                result += str.substring(i, i+1);
            }


        }


        return result;
    }



    // count how many a b c d are there in string
    public static int count(String a, String b){

        int count =0;
        while (a.contains(b)){
            count++;
            a = a.replaceFirst(b, "");
        }


        return count;
    }


    // check how many a are there and return a5, check how many b are there return b4 etc
    public static String frequency(String str) {

        String nonDup = RemoveDup(str);
        String result = "";

        for (int i=0; i < nonDup.length(); i++){

            int count = count(str, ""+nonDup.charAt(i));
            result += ""+ nonDup.charAt(i) + count;
        }




        return result;
    }







}
