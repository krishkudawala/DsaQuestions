package Array;

import java.io.FileOutputStream;

public class thirdmax {
    public static void main(String[] args) {
        int[] arr = {10,20, 30, 40, 50, 60,70};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        int smax = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>smax && arr[i]!=max) smax=arr[i];
        }
        int tmax=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>tmax &&arr[i]!=smax && arr[i]!=max) tmax=arr[i];
        }
        System.out.println("Third largest element in arr=> "+tmax);
    }
}
