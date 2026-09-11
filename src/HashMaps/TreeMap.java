package HashMaps;

public class TreeMap {
    public static void main(String[] args) {
        java.util.TreeMap<String ,Integer> map=new java.util.TreeMap<>();
        map.put("Krish", 1);
        map.put("Ayushi", 2);
        map.put("Prachi", 3);
        map.put("Anu", 4);
        map.put("RAM", 5);
        for (String key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }
}
