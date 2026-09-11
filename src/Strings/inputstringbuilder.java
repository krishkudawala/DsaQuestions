package Strings;

import java.util.Scanner;

public class inputstringbuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     //   StringBuilder sb= new StringBuilder(sc.nextInt());

        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        sb.setCharAt(0,'a');
        System.out.println(sb);

    }
}
