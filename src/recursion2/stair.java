package recursion2;

import java.util.Scanner;

public class stair {
    public static int starie(int n) {
        if (n==1) return n;
        if (n==3) return n;
        return starie(n-1)+starie(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(starie(n));
    }
}
