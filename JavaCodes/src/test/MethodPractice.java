package test;

public class MethodPractice {

    public static void main(String[] args) {
        System.out.println(makeThreeSubstr("hello", 0, 2)); //should be hehehe
        System.out.println(makeThreeSubstr("shenanigans", 3, 7)); //should be naninaninani
        System.out.println(makeThreeSubstr("RidvanGunduz", 6, 9));
    }


    public static String makeThreeSubstr(String word, int startIndex, int endIndex) {


            String str = "";
            for (int i = 0; i < 3; i++) {
                str += word.substring(startIndex, endIndex);

            }

            return str;

        }


    }
