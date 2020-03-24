package InterviewQuestions;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String removed=  RemoveDuplicate ("aabbaaabbbcccccDD");
        System.out.println(removed);

    }

    public static String RemoveDuplicate (String str){


   // String str = "aabbaaabbbcccccDD";
    String RemoveDuplicates = "";

        for (int i = 0; i < str.length(); i++) {

        if (!RemoveDuplicates.contains(str.substring(i, i + 1))) {

            RemoveDuplicates += str.substring(i, i + 1);


        }

    }


        return RemoveDuplicates;
}
}