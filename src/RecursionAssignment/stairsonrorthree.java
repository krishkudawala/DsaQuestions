package RecursionAssignment;

import java.util.Scanner;

public class stairsonrorthree {
    public static int staris(int n) {
        if (n<=3) return n;
        return staris(n-1) +staris(n-3);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(staris(n));
    }
}
