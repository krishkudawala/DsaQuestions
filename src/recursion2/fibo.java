package recursion2;

import java.util.Scanner;

public class fibo {
    public static int fiboo(int n){
        if (n<=1) return n;
        return fiboo(n-1) + fiboo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fiboo(n));
    }
}
