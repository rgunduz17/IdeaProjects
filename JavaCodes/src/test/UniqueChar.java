package test;

public class UniqueChar {

    public static void main(String[] args) {


        String str= "AAAABBBASSACCSF";
        String Unique= "";

        for (int j= 0; j < str.length();  j++) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals("" + str.charAt(j))){
                    count++;
                }
            }
            if (count ==1) {
                Unique += "" + str.charAt(j);
            }
        }
        System.out.println(Unique);

    }
}


