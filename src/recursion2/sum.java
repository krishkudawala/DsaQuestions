package recursion2;

import java.util.Scanner;

public class sum {
    public static int summ(int n){
        if (n==1 || n==0) return n;
        return n+summ(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(summ(n));
    }
}
