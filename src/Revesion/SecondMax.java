package Revesion;

public class SecondMax {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,4,5,66,54,111};
        int n= arr.length;
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for (int i=0;i<n;i++) {
             if (arr[i]>max) {
                 smax=max;
                 max = arr[i];
             }
             else if (arr[i]>smax && arr[i]!=max){
                 smax=arr[i];
             }
        }

        System.out.println(smax);
    }
}
