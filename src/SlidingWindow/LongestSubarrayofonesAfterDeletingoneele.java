package SlidingWindow;

public class LongestSubarrayofonesAfterDeletingoneele {
    public static int longestSubarray(int[] arr) {
        int n=arr.length;
        int i=0 , j=0 ,z=0  ;
        int zeroes=0 , maxlen=0;

        for(int ele :arr){
            if(ele==0) z++;
        }
        if(z==0) return n-1;
        while (i<n && arr[i]==0) {
            i++;
        }
        if(i==n) return 0;
        j=i;
        while (j<n){
            if (arr[j]==1) j++;
            else {
                if (zeroes==0){
                    j++;
                    zeroes++;
                }
                else {
                    int len=j-i-1;
                    maxlen=Math.max(maxlen,len);
                    j++;
                    while (i<n &&arr[i]==1)i++;
                    i++;
                }
            }
        }
        if (zeroes==1) {
            int len = j - i - 1;
            maxlen = Math.max(maxlen, len);
        }
        if(zeroes==0) return j-i;
        return maxlen;
    }
    public static void main(String[] args) {
        int [] arr={1,1,0,1};
        System.out.println(longestSubarray(arr));

    }
}
