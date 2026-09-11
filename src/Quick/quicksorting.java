package Quick;

public class quicksorting {
    public static void swap(int [] arr, int i,int j ){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void print(int [] arr){
        for (int ele: arr){
            System.out.print(arr+" ");
        }
        System.out.println();
    }
    public static void partition(int []arr,int lo , int hi){
        int pivot=arr[lo] , pivotIx=0;
        int smallercount = 0;
        for (int i=lo+1;i<=hi;i++){
            if (arr[i]<=pivot) smallercount++;
        }
  int correctInx = pivot + smallercount;
        swap(arr,pivotIx,correctInx);
        // partition
        int i=lo , j = hi;
        while (i<correctInx && j>correctInx){
            if (arr[i]<=pivot) i++;
            else if (arr[j]>pivot) j--;
            else if (arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);
            }
        }
     //   return correctInx;
    }
    public static void ouicksort(int[] arr ,int lo ,int hi ){
        if (lo>=hi) return;
        //pivot arr[lo] ko sahi jagah rkho
        // & left part me<=pivot
//        int idx = partition//(arr,lo);
//        ouicksort(arr,lo,idx-1);
//        ouicksort(arr,idx+1,hi);
//    }
//    public static void main(String[] args) {
//        int [] arr = {4,9,7,1,3,2,6,5,8};
//
   }
}