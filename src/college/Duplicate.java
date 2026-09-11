package college;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[6];
        int n = arr.length;
        for (int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        boolean flag = false;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    flag=true;
                    break;
                }
            }
        }
        if (flag==true) System.out.println("Duplicate element found");
        else System.out.println("Not duplicate in array");
    }
}
