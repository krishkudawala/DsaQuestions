package recursion2;

import java.util.Scanner;

public class PreInPost {
    public static void pre(int n) {
        if (n==0) return;
        System.out.println(n);
        pre(n-1);
        System.out.println(n);
        pre(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        pre(3);
    }
}
