package recursion;

import java.util.Scanner;

public class binarysStrings {
    public static void print(String s,int n ){
        int m =s.length();
        if (m==n) {
            System.out.println(s);
            return;
        }
        if (m==0 || s.charAt(m-1)=='0'){
            print(s+1,n);
            print(s+0,n);
        }
        else print(s+0,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int n = sc.nextInt();
        print("",n);

    }
}
