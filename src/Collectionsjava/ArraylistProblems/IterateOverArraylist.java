package Collectionsjava.ArraylistProblems;

import java.util.ArrayList;
import java.util.List;

public class IterateOverArraylist {
    public static void main(String[] args)
    {
        List<String> colors=new ArrayList<>();
        colors.add("blue");
        colors.add("green");
        colors.add("red");
        colors.add("yellow");

        for(String s:colors) {
            System.out.println(s);
        }
    }

}
