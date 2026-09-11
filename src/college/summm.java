package college;

import java.util.Scanner;

public class summm {
    public static void sum(){

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int ld = n % 10; n != 0; sum += ld) {
            n /= 10;
        }
        System.out.println(sum);
    }
}
