package college;

import java.util.Scanner;

public class hcf {
    public static int gcf(int a , int b ){
        if (b%a==0) return a;
        return gcf(a%b,a) ;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println(gcf(a,b));
    }
}
