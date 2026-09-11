package Binarysearch;

public class lowerbound {
    public static void main(String[] args) {
        int[] arr={10,20,30,45,55,67,77};
       int n=arr.length;
       int target=50;
       int lb=n;
       int lo=0 , hi=n-1;
       while (lo<=hi){
           int mid = lo+(hi-lo)/2;
           if (arr[mid]>target){
               lb=Math.min(lb,mid);
               hi=mid-1;
           }
           else lo=mid+1;
       }
        System.out.println(lb);
    }
}
