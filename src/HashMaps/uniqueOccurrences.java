package HashMaps;

import java.util.HashMap;
import java.util.HashSet;

public class uniqueOccurrences {
    public static boolean uniqueOccurrencess(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            if (map.containsKey(ele)) {
                int freq = map.get(ele);
                map.put(ele, freq + 1);
            } else map.put(ele, 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int key : map.keySet()) {
            int val = map.get(key);
            set.add(val);
        }
        return (map.size() == set.size());
    }
    public static void main(String[] args) {
        int []arr={1,2,2,1,1,3};
        System.out.println(uniqueOccurrencess(arr));
    }
}
