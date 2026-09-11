package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class largestSumAfterKNegations {
    public static int max(int [] arr,int k){
        Arrays.sort(arr);
        int i=0;
        while (i<arr.length && arr[i] <0 && k>0){
            arr[i] *=-1;
            i++;
            k--;
        }
        if (k%2==1) {
            Arrays.sort(arr);
            arr[0]*=-1;
        }
        int sum=0;
        for (int s : arr){
            sum+=s;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of N : ");
        int n=sc.nextInt();
        int [] arr=new  int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter value of K: ");
        int k= sc.nextInt();
        System.out.println("Sum : "+max(arr,1));
    }
}
