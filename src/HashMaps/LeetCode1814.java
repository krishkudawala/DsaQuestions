package HashMaps;

import java.util.HashMap;

public class LeetCode1814 {
    public static int countNicePairs(int[] nums) {
        int count=0;
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<n;i++) {
            int ele = nums[i] - rev(nums[i]);
            if (map.containsKey(ele)){
            int freq = map.get(ele);
            count+=freq;
            count%=1000000007;
                map.put(ele, freq + 1);
            }
            else map.put(ele,1);
        }
        return count;
    }
    public static int rev(int n){
        int r=0;
        while (n!=0){
            r=r*10 + n%10;
            n/=10;
        }
        return r;
    }

    public static void main(String[] args) {
int [] arr ={42,11,1,97};
        System.out.println(countNicePairs(arr));
    }
}
