package Collectionsjava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class KeyExist {
   public static void main(String[] args)
   {
       HashMap<Integer,String> mp=new HashMap<>();
       mp.put(1,"bunty");
       mp.put(2,"akssh");
       mp.put(3,"karan");
       mp.put(4,"now");
       mp.put(5,"njnw");
       int key=2;
       boolean check=false;
       Iterator<Map.Entry<Integer,String>> iterator=mp.entrySet().iterator();
       while (iterator.hasNext())
       {
           Map.Entry<Integer,String> it= iterator.next();
           if(it.getKey()==key)
           {
               check=true;
           }
       }
       System.out.println(check);
   }
}
