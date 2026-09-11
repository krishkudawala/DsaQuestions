package Array;

import java.util.Scanner;

public class findinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter target element");
        int x = sc.nextInt();
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int [] arr =new int[n];
        System.out.println("Enter array element");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        boolean flag=false;
        for (int i=0;i<n;i++){
            if (arr[i]==x){
                flag =true; break;
            }
        }
        if (flag==true) System.out.println("found");
        else System.out.println("Not found");
    }
}
