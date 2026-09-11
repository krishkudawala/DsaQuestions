package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class zerosandone {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1,0, 0, 0};
        int n = arr.length;

        // Method 1
//        int noofzeros = 0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 0) noofzeros++;
//        }
//        for (int i = 0; i < n; i++) {
//            if (i < noofzeros) arr[i] = 0;
//            else arr[i] = 1;
//
//        }
//        for (int ele : arr){
//            System.out.print(ele+" ");
//        }
//    }
//}

        // Method 2 it is a good method
      int i=0;
      int j =n-1;
      while (i<j){
          if (arr[i]==0) i++;
          else  if(arr[j]==1) j--;
          else if (arr[i]==1 && arr[j]==0){
              arr[i]=0;
              arr[j]=1;
              i++;
              i--;
          }
      }
      for (int ele:arr){
          System.out.print(ele+" ");
      }
        System.out.println();
    }
}
