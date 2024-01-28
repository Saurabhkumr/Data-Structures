import java.util.HashMap;
import java.util.HashSet;

import java.util.Iterator;

public class hashing {
    
    public static void main(String[] args) {

    //     HashSet<Integer> set = new HashSet<>();
    //     set.add(4);
    //     set.add(3);
    //     set.add(2);
    //     set.add(2);
        
    //     System.out.println(set);

    //     Iterator it = set.iterator();

    //    while(it.hasNext()){
    //     System.out.println(it.next());
    //    }


    //   HashMap

    HashMap<String,Integer> map = new HashMap<>();
    map.put("India", 190);
    map.put("China", 200);
    map.put("USA", 50);
    map.put("Nepal", 10);

    System.out.println(map);
   
    map.put("Japan", 70);

    System.out.println(map);

    System.out.println(map.containsKey("USA"));

    System.out.println(map.get("India"));

    System.out.println(map.size());

    System.out.println(map.keySet());
    
    



    }
    
}
