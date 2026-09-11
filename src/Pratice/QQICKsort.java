package Pratice;

public class QQICKsort {
    public static void print(int [] arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partation(int [] arr ,int lo ,int hi){
        int pivod=arr[lo] ,pvtidx=lo;
        int smallerCount=0;
        for (int i=lo+1;i<=hi;i++){
            if (arr[i]<=pivod) smallerCount++;
        }
        int correctidx=pvtidx+smallerCount;
        swap(arr,pvtidx,correctidx);

        int i=lo, j=hi;

        while (i<correctidx && j>correctidx) {
            if (arr[i]<=pivod) i++;
            else if (arr[j]>pivod) j--;
            else if (arr[i]>pivod && arr[j]<=pivod) {
                swap(arr,i,j);

            }
        }
        return correctidx;
    }
    public static void quicksort(int [] arr,int lo,int hi){
        if (lo>=hi) return;
        int idx=partation(arr,lo,hi);
        quicksort(arr,lo,idx-1);
        quicksort(arr,idx+1,hi);
    }

    public static void main(String[] args) {
        int [] arr={2,1,3,2,4,2,1,5,6,7};
        int n=arr.length;
        quicksort(arr,0,n-1);
        print(arr);
    }
}
