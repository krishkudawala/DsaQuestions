package Array;

public class nextgreatestelemet {
    public static void main(String[] args) {
        int [] arr={6,5,4,9,2,1};
        int n= arr.length;
        int nge=arr[n-1];
        for (int i=n-2;i>0;i--){
            arr[i]=nge;
            nge=Math.max(nge,arr[i]);
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
