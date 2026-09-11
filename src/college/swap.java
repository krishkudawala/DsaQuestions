package college;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("this is not a swap number" +a+" & "+b);
//        int temp = a;
//        a=b;
//        b=temp;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("this is swap number "+a+" & "+b);
    }
}
