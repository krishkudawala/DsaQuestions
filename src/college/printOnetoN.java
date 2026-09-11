package college;

import java.util.Scanner;

public class printOnetoN {
    static int x;
    public static void print(int n){
        if (n>x) return;
        System.out.println(n);
        print(n+1);

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       x =sc.nextInt();
        print(1);
    }
}
