package Array;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[6];
        int n = arr.length;
        for (int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for (int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
