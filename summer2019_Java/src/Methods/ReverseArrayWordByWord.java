package Methods;

public class ReverseArrayWordByWord {

    public static String reverseWord(String str){
       String [] a = str.split(" ");
       int c = a.length;
       String [] b = new String[c];
        String result = "";
       for (int i = 0; i<c; i++ ){
           b[i]= a[c-1-i];
            result += a[c-1-i]+ " ";
       }

        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("Write a Java"));
    }
}
