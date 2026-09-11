package Greedy;

import java.util.HashMap;
import java.util.Map;

public class RabbitInForest {
    public static int rabbit(int [] answes) {
        int ans = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int answer : answes) {
            freq.put(answer + 1, freq.getOrDefault(answer + 1, 0) + 1);
            for (int key : freq.keySet()) {
                int val = freq.get(key);
                int q = val / key;
                int r = val % key;
                ans += q * key;
                if (r > 0) {
                    ans += key;
                }
                //System.out.println(key + " " + val + " " + ans);
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr={1,1,2};
        System.out.println(rabbit(arr));
    }
}
