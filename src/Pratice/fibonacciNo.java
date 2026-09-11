package Pratice;

import java.util.Scanner;

public class fibonacciNo {
    public static int fino(int n) {
        if (n<=1) return n;
        return fino(n-1)+fino(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fino(n));
    }
}
