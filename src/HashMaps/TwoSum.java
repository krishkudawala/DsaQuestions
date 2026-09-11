package HashMaps;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = {-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (map.containsKey(rem)) {
                ans[0] = i;
                ans[1] = map.get(rem);
                break;
            }
            else map.put(nums[i], i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target  =9;
        int[] result = twoSum(arr, target);

        System.out.println(result[1] + " " + result[0]);
    }
}
