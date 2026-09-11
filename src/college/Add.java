package college;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr ele");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println(size+" ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) max = arr[i];
        }
        int smax = Integer.MIN_VALUE;
        for (int i =0;i<size;i++){
            if ( arr[i]!=max && arr[i]>smax) smax = arr[i];
        }
        int tmax = Integer.MIN_VALUE;
        for (int i=0 ;i<size;i++){
            if (arr[i]>tmax && arr[i]!=smax && arr[i]!=max) tmax=arr[i];
        }
        System.out.println("maximum ele : "+max);
        System.out.println("second max ele: "+smax);
        System.out.println("Third max ele: "+tmax);
    }
}
