package day27_CustomMethods.Methods;

public class ReturnMiddleWord {

    public static void main(String[] args) {
        String Word= "I love Java";
        System.out.println(middleWord(Word));

    }

    public static String middleWord(String Word){


        String [] b = Word.split(" ");
        int a= b.length;

        if (a % 2==0){
            return b[(a/2)-1];
        }
        return b[a/2];
    }
}
