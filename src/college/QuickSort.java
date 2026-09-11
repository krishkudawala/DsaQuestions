package college;

public class QuickSort {
    public static void swap(int[]arr ,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void print(int []arr){
        for (int ele :arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int partation(int []arr,int lo ,int hi){
        int pivot=arr[lo] ,pidx = lo;
        int smallercount=0;
        for (int i=lo+1;i<=hi;i++){
            if (arr[i]<=pivot) smallercount++;
        }
        int correctidx=lo+smallercount;
        swap(arr,pidx,correctidx);
        int i=lo ,j=hi;
        while (i<correctidx && j>correctidx){
             if (arr[i]<=pivot) i++;
             else if(arr[j]>pivot) j--;
             else if (arr[i]>pivot && arr[j]<=pivot){
                 swap(arr,i,j);
             }
        }
        return correctidx;
    }
    public static void Quicksort(int []arr,int lo,int hi){
        if (lo>=hi)return;
        int idx= partation(arr,lo,hi);
        Quicksort(arr,lo,idx-1);
        Quicksort(arr,idx+1,hi);

    }
    public static void main(String[] args) {
        int [] arr={4,9,7,1,2,3,6,5,8};
        int n=arr.length;
        print(arr);
        Quicksort(arr,0,n-1);
        print(arr);
    }
}
