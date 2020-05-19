package scratches;

import java.util.HashMap;
import java.util.LinkedList;

public class HashImplement {

   // Create a stack

    [] size = new int[16];


public void put( int key){

    int hashvalue = key % size.length;

    int[size] = key;


}


    public static  void main(String[] args){

    HashImplement find = new HashImplement();
    find.put(8);

       HashMap<String, Integer> map = new HashMap<>();
        map.put("aaa", 1);
       map.put("bbb", 2);
        map.put("ccc", 3);
        map.put("ddd", 4);
       map.put("aaa", 5);


     System.out.println(map.get("aaa"));
     System.out.println(map.get("bbb"));
   System.out.println(map.get("ccc"));
   System.out.println(map.get("ddd"));
    }
}


