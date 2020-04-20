package InterviewQuestions;


/*
warmup task:
1.  write a return method that accepts a String and removes duplicate values from the String
    Ex:
            RemoveDuplicate("aaabbbccc");  ==> "abc"
2. write a return method that accepts two strings str1 & str2, and returns the frequency of str2 in str1 as an int
    Ex:
        Frequency("AAABB", "A");  ==> 3
        Frequency("ABAB", "B"); ==> 2
3. (This one I will do it too tomorrow in class) Combine above two methods to write a return method that can return the frequency of characters as a string from any given string
    Ex:
        FrequencyOfChars("ABABCB"); ==> "A2B3C1";
        FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"
 */


import java.util.Scanner;

public class WarmUpSolution {

     static String str1;
     static String str2;


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string by using repeating characters:");
        WarmUpSolution.str1= scanner.nextLine();
        str1= str1.toUpperCase();
        System.out.println("Enter ONLY one character from your string:");
        WarmUpSolution.str2=scanner.nextLine();
        str2= str2.toUpperCase();
        System.out.println("Duplicates Removed: "+RemoveDuplicate(str1));
        System.out.println("Frequency of "+ str2+" is: "  +Frequency(str1, str2));
        System.out.println("Occurrence of each char: "+FrequencyOfChars(str1));

    }

    //   Warm Up Task 1
    public static String RemoveDuplicate(String str1) {
        WarmUpSolution.str1=str1;

        String RemoveDuplicates = "";
        for (int i = 0; i < str1.length(); i++) {
            if (!RemoveDuplicates.contains(str1.substring(i, i + 1))) {
                RemoveDuplicates += str1.substring(i, i + 1);
            }
        }
        return  RemoveDuplicates;
    }

    //      Warm Up Task 2
    public static int Frequency(String str1, String str2) {
        WarmUpSolution.str1=str1;
        WarmUpSolution.str2=str2;
        int count=0;
        for (int j =0;j<=str1.length()-1;j++){
            for (int i =0; i<=str1.length()-1; i++){
                if (str1.contains(str2)){
                    count++;
                    str1 = str1.replaceFirst(str2,"");
                }
            }
        }
        return count;
    }

    //  Warm Up Task 3
    public static String FrequencyOfChars(String str1) {
        WarmUpSolution.str1=str1;
        String nonDup = RemoveDuplicate(str1);
        String result = "";
        for(int i=0; i<nonDup.length(); i++) {
            int count = Frequency(str1, ""+nonDup.charAt(i) );
            result+= ""+nonDup.charAt(i)+ count;
        }
        return result;
    }
}

        // Warm Up Task 3
//   public static String FrequencyOfChars(String str1) {
//
//        String result = "";
//        for (int j = 0; j < str1.length(); j++) {
//            int count = 0;
//            for (int i = 0; i < str1.length(); i++) {
//                if (str1.charAt(i) == str1.charAt(j)) {
//                    count++;
//                }
//            }
//            result += "" + str1.charAt(j) + count;
//            str1 = str1.replace("" + str1.charAt(j), "");
//        }
//        return result;
//      }