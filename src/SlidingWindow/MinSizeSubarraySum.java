package SlidingWindow;

public class MinSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] arr) {
        int n = arr.length;
        int minLen = Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int sum=0;
        while (j<n && sum<target){
            sum+=arr[j++];
        }
        j--;
        // sliding window
        while (i<n &&j<n){
            int len=j-i+1;
            if(sum>=target) minLen=Math.min(minLen,len);
            sum-=arr[i];
            i++; j++;
            while (j<n && sum<target){
                sum+=arr[j++];
            }
            j--;
        }
        if (minLen == Integer.MAX_VALUE) return 0;
        return minLen;
    }
    public static void main(String[] args) {
        int [] arr={2,3,1,2,4,3};
        int target=7;
        System.out.println( minSubArrayLen(target,arr));
    }
}
