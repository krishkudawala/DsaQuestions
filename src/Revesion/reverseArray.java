package Revesion;

import java.util.Scanner;

public class reverseArray {
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        for (int ele :arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int i=0, j=arr.length-1;
        while (i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele :arr) {
            System.out.print(ele + " ");
        }
    }
}
