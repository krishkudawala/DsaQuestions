package SlidingWindow;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int [] arr={10,20,1,3,-40,80,10};
        int k=3;
        int maxSum=0;
        int n =arr.length;
//        for (int i=0;i<n-k+1;i++){
//            int sum=0;
//            for (int j=i;j<=i+k-1;j++){
//                sum+=arr[j];
//            }
//            maxSum=Math.max(maxSum,sum);
//        }

        int i=0 , j=k-1;
        int sum=0;
        for (int a=i;a<j;a++){// k times
            sum+=arr[a];
        }
        i++ ; j++;
        while (j<n){ //n-k times
            sum=sum-arr[i-1]+arr[j];
            maxSum=Math.max(maxSum,sum);
            i++;j++;
        }
        System.out.println(maxSum);
    }
}
