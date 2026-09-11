package college;

import java.util.Scanner;

public class fact {
    public static int factt(int n){
        if (n==1) return 1;
        return n*(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factt(n));
    }
}
