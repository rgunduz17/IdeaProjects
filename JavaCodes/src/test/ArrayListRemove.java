package test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemove {

    public static void removeAll(ArrayList<String> wordList, String targetWord){
       wordList.removeAll(Arrays.asList(targetWord));
        System.out.println(wordList);
    }

    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
       String targetWord ="hi";
        removeAll(wordList,targetWord);



    }
}
