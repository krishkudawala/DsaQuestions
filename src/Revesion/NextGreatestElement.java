package Revesion;

public class NextGreatestElement {
    public static void main(String[] args) {
        int [] arr={12,8,34,56,444,77,54};
        int n= arr.length;
        arr[n-1]=-1;

        //Method 1
//        for (int i=0;i<n-1;i++){
//            int max=Integer.MIN_VALUE;
//            for (int j=i+1;j<n;j++){
//                max=Math.max(max,arr[j]);
//            }
//            arr[i]=max;
//        }

        // Method 2

        int nge=arr[n-1];
        for (int i=n-2;i>= 0;i--){
            arr[i]=nge;
            nge=Math.max(nge,arr[i]);
        }

        for (int ele :arr){
            System.out.print(ele+" ");
        }
    }
}
