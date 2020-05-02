package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class newTest {

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));

        System.out.println(list);

        Collections.swap(list, 1, 2);

        System.out.println(list);
    }

    public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2)
    {
        Collections.swap(list, pos1, pos2);
        return list;
    }
}
