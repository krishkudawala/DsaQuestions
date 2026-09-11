package recursion2;

import java.util.Scanner;

public class Stringtraversal {
    public static void skip(int i ,String s,String ans){
        if (i==s.length()){
            System.out.print(ans);
            return;
        }
        if (s.charAt(i)!='a') ans+=s.charAt(i);
        skip(i+1,s,ans);
    }
    public static void print(int i,String s){
        if (i==s.length()) return;
        System.out.print(s.charAt(i));
        print(i+1,s);
     }
    public static void main(String[] args) {
        String s="krish kudawala rajput";
        //print(0,s);
        skip(0,s," ");
        Scanner sc=new Scanner(System.in);
        String ss=sc.next();
    }
}
