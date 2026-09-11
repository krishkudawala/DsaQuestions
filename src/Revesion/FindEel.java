package Revesion;

import java.util.Scanner;

public class FindEel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Target value");
        int n = sc.nextInt();
        System.out.println("Enter Arrays Value");
        int x = sc.nextInt();
        int [] arr=new int[x];
        for (int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;

        for (int i = 0; i < x; i++) {
            if (arr[i]==x){
                flag=true;
                break;
            }
        }
       if (flag==true) System.out.println("Found") ;
       else System.out.println("Not found");
    }
}
