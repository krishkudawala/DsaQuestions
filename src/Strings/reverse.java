package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void reverse(StringBuilder sc , int i, int j){
        while (i<=j){
            char temp =sc.charAt(i);
            sc.setCharAt(i,sc.charAt(j));
            sc.setCharAt(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s=new StringBuilder(sc.nextLine());
//        StringBuilder a=new StringBuilder("am");
//        StringBuilder b=new StringBuilder("raghav");
//        StringBuilder c=new StringBuilder("garg");
//        System.out.print(s+" ");
//        System.out.print(a.reverse()+" ");
//        System.out.print(b.reverse()+" ");
//        System.out.print(c.reverse() );
//
//        StringBuilder sb=new StringBuilder(sc.nextLine());
//
//    }
//    public  static void reversee(stringbuilder sb,int i,int j){
//        while (i<=j){
//            char temp;
//        }


    }
}
