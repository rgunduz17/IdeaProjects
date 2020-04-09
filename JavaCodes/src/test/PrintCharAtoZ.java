package test;

public class PrintCharAtoZ {

    public static void main(String[] args) {

        char result;
        result ='a';
        do {
            System.out.print(result+ " ");
            result++;
        }
        while (result <= 'z');

        System.out.println();

        char result2;

        for(result2 = 'A'; result2 <= 'Z'; result2++) {
            System.out.print(result2 + " ");
        }
    }
}







