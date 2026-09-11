package HashMaps;

import java.util.HashMap;
import java.util.Objects;

public class IterateMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Krish", 1);
        map.put("Ayushi", 2);
        map.put("Prachi", 3);
        map.put("Anu", 4);
        map.put("RAM", 5);
        System.out.println(map);

        for (String key : map.keySet()){
            int val=map.get(key);
            System.out.println(key+" "+val);
        }
        System.out.println();
        for (Object pair : map.entrySet()){
            System.out.println(pair);
        }
    }
}
