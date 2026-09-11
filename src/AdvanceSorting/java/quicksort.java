package AdvanceSorting.java;

public class quicksort {
    public static void print(int []arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int [] arr, int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partion(int [] arr ,int lo ,int hi) {
        int pivot = arr[lo], pivotIdx = lo;
        int smallercount = 0;
        for (int i = lo + 1; i <=hi; i++) {
            if (arr[i] <= pivot) smallercount++;
        }
        int correctIdx = pivotIdx + smallercount;
        // swap arr[pidx] &arr[cidx]
        swap(arr, pivotIdx, correctIdx);
        // partation
        int i = lo, j = hi;
        while (i < correctIdx && j > correctIdx) {
            if (arr[i] <= pivot) i++;
            else if (arr[j] > pivot) j--;
            else if (arr[i] > pivot && arr[j] <= pivot) {
                swap(arr, i, j);
            }
        }
        return correctIdx;
    }
    public static void quick(int []arr,int lo ,int hi){
        if (lo>=hi)return;
       int idx=partion(arr,lo,hi);
       quick(arr,lo,idx-1);
        quick(arr,idx+1,hi);
    }
    public static void main(String[] args) {
     int [] arr={4,9,7,1,2,3,6,5,8};
     int n =arr.length;
     quick(arr,0,n-1);
     print(arr);
    }
}
