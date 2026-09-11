package AdvanceSorting.java;

public class RandomizeQuickSort {
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
        int mid=(lo+hi)/2;
        int pivot=arr[mid] , pidx=mid;
        int smallercount=0;
        for(int i=lo;i<=hi;i++){
            if(i==mid) continue;
            if(arr[i]<=pivot) smallercount++;
        }
        int correctidx=lo+smallercount;
        swap(arr,pidx,correctidx);
        int i=lo , j=hi;
        while(i<correctidx && j>correctidx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr ,i,j);

            }
        }
        return correctidx;
    }
    public static void quick(int []arr,int lo ,int hi){
        if (lo>=hi)return;
        int idx=partion(arr,lo,hi);
        quick(arr,lo,idx-1);
        quick(arr,idx+1,hi);
    }
    public static void main(String[] args) {
        int [] arr={2,5,1,4,2};
        int n =arr.length;
        quick(arr,0,n-1);
        print(arr);
    }
}


