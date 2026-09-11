package recursion2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class subsets {
    static List<String> list=new ArrayList<>();
    public static void print(int i,String s,String ans){
        if (i==s.length()){
            list.add(ans);
            return;
        }
        char ch=s.charAt(i);
        print(i+1,s,ans+ch);
        print(i+1,s,ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        print(0,s,"");
        System.out.println(list);
    }
}
