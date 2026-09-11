package recursion2;

import java.util.Scanner;

public class arrTraversal {
    public static void print(int i,int [] arr){
        if (i== arr.length) return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] ar=new int[n];
        for (int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        //int [] arr={11,1,2,3,5,5,7,8};
        print(0,ar);
    }
}
