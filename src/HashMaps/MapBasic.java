package HashMaps;

import java.util.HashMap;

public class MapBasic {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Krish",1);
        map.put("Ayushi",2);
        map.put("Prachi",3);
        map.put("Anu",4);
        map.put("RAM",5);
        System.out.println(map+" "+map.size());
        map.put("Krish",100);
        System.out.println(map+" "+map.size());
        map.put("Anurag",4);
        System.out.println(map+" "+map.size());
        System.out.println(map.containsValue(2));
        map.remove("Krish");
        System.out.println(map+" "+map.size());
        map.remove("keshav");
        System.out.println(map.get("RAM"));
    }
}
