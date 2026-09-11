package college;

import java.util.Scanner;

public class twodoublet {
    public static void main(String[] args) {
//        int [ ] arr ={1,2,3,4,5};
//        int n=arr.length;
//        int target=3;
//        for (int i=0;i<n;i++){
//            for (int j=i+1;j<n;j++) {
//                if (arr[i] + arr[j] == target) {
//                    System.out.println(arr[i] + " " + arr[j]);
//                }
//            }
//        }

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
