package test;

public class mergeStrings {

    public static void main(String[] args) {

        String one ="1234567";
        String two ="abcde";

        String result = "";
        if(one.length()<two.length()){
            for (int i = 0; i <one.length() ; i++) {
                result+=""+one.charAt(i)+two.charAt(i);
            }
            result+=two.substring(one.length());
            System.out.println(result);
        }else{
            for (int i = 0; i <two.length() ; i++) {
                result+=""+one.charAt(i)+two.charAt(i);
            }
            result+=one.substring(two.length());
            System.out.println(result);
        }

    }
}
