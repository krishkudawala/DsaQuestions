package recursion;

import java.util.Scanner;

public class printIncreasingAfterCall {
    public static void print(int n){
        if (n==0) return;
        print(n-1); //1-n
        System.out.println(n);
     //   print(n-1); // n-1
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
