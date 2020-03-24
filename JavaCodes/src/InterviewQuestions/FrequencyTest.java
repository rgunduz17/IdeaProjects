package InterviewQuestions;

public class FrequencyTest {


    // FrequencyTest("XXXYYYZZZ)
    // output: X3Y3Z3



    public static void main(String[] args) {


        String str = "aabbaaabbbcccccDD";
        String RemoveDuplicates = "";

        for (int i = 0; i < str.length(); i++) {

            if (!RemoveDuplicates.contains(str.substring(i, i + 1))) {

                RemoveDuplicates += str.substring(i, i + 1);


            }

        }
        System.out.println(RemoveDuplicates);

        // result = a5b5c5


        String result = "";


        for (int j = 0; j < RemoveDuplicates.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                if (str.substring(i, i + 1).equals(RemoveDuplicates.substring(j, j + 1))) {
                    count++;
                }
            }

            result += RemoveDuplicates.substring(j, j + 1) + count;

        }

        System.out.println(result);


        // EASY WAY

        String str2 = "AABBCCDD";

        String result2 = "";


        for (int j = 0; j < str2.length(); j++) {


        int count = 0;
        for (int i = 0; i < str2.length(); i++) {

            if (str2.charAt(i) == str2.charAt(j)) {

                count++;
            }
        }

        result2 += "" + str2.charAt(j) + count;
        str2 = str2.replace(""+str2.charAt(j), "");
    }

        System.out.println(result2);



        }




    }

