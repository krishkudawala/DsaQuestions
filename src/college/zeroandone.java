package college;

import java.util.Scanner;

public class zeroandone {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter ele");
        int size =sc.nextInt();
        int [] arr =new int[size];
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        int n =arr.length;
        int i=0;
        int j=n-1;
        while (i<j) {
            if (arr[i] == 0) i++;
            else if (arr[j] == 1) j--;
            else if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
            for (int ele:arr){
                System.out.print(ele+" ");

        }
    }
}
