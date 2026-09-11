package Array;

public class setZeroOneTwo {
    public  static void swap(int []arr ,int mid , int lo){
        int temp = arr[mid];
        arr[mid]=arr[lo];
        arr[lo]=temp;
    }

    public static void main(String[] args) {
        int [] arr ={1,0,2,1,2,1,0,2,2,0,1,0,0,1,2,1,2,1,2,0};
        int n =arr.length;
//        int noOfzeros=0;
//        int noOfones=0 ;
//        for (int i=0;i<n;i++){
//            if (arr[i]==0) noOfzeros++;
//            if (arr[i]==1) noOfones++;
//        }
//        for (int i =0 ;i<n;i++){
//            if (i<noOfzeros) arr[i]=0;
//            else if (i<noOfzeros+noOfones) arr[i]=1;
//            else arr[i]=2;
//        }
//       for (int i=0;i<n;i++){
//           System.out.print(arr[i]+" ");
//       }

        // method 2 Dutch flag algorithm
        int lo=0 , mid=0 ,hi=n-1;
        while (mid<=hi){
            if (arr[mid]==0) {
               swap(arr,mid,lo);
                lo++;
            }
            else if (arr[mid]==1) mid++;
            else {
               swap(arr,mid,hi);
                hi--;
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
