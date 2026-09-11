package Strings;

import java.util.Scanner;

public class convertIntintoString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int n= sc.nextInt();
        String s="";
        s+=n;
        System.out.println(s);
        System.out.println(s.length());
    }
}
