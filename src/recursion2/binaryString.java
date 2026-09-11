package recursion2;

import java.util.Scanner;

public class binaryString {
    public static void print(String ans,int s){
        int m=ans.length();
        if (m==s){
            System.out.println(ans);
            return;
        }
        if (m==0 || ans.charAt(m-1)=='0') {
            print(ans+1,s);
            print(ans+0,s);

        }
        else print(ans+0,s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        print("",s);
    }
}
