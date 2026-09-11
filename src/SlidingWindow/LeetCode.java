package SlidingWindow;

public class LeetCode {
    public static  int numOfSubarrays(int[] arr, int k, int t) {
        int i=0 , j=k-1 ,  sum=0 , count=0 , n=arr.length;
        for (int a=0;a<=k-1;a++){// k times
            sum+=arr[a];
        }
        if(sum/k>=t) count++;
        i++ ; j++;
        while (j<n){ //n-k times
            sum=sum-arr[i-1]+arr[j];
            if(sum/k>=t) count++;
            i++;j++;
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr={2,2,2,2,5,5,5,8};
        int k=3;
        int t=4;
        System.out.println(numOfSubarrays(arr,k,t));
    }
}
