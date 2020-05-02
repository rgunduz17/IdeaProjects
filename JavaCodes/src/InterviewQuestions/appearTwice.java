package InterviewQuestions;


public class appearTwice {

    public static void main(String[] args) {
        System.out.println(appearsTwice("java", "java is fun!"));
        System.out.println(appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old."));
    }

    public static boolean appearsTwice(String target, String sentence) {

        sentence = sentence.replace('.', ' ');
        sentence = sentence.replace(',', ' ');
        String[] arr = sentence.split(" ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (target.equals(arr[i])) {
                count++;
            }
        }
        if(count ==2 ){
            return true;
        }else{
            return false;
        }


    }

}