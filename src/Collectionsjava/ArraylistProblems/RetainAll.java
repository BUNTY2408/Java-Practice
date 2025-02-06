package Collectionsjava.ArraylistProblems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RetainAll {
    public static void main(String[] args)
    {
        List<Integer> al1=new ArrayList<>();
        al1.add(1);
        al1.add(4);
        al1.add(3);
        List<Integer> al2=new ArrayList<>();
        al2.add(3);
        al2.add(4);
        al2.add(5);
        al1.retainAll(al2);
        System.out.println(al1);
        Collections.shuffle(al1);
        System.out.println(al1);
        System.out.println(al2);
    }
}
