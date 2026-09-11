package recursion;

import java.io.FilterOutputStream;

public class permutation {
    public static void print(String ans,String s){
        if (s.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            String left=s.substring(0,i);
            String Rright=s.substring(i+1);
            print(ans+ch,left+Rright);
        }
    }
    public static void main(String[] args) {
        String s ="abc";
        print("", s);
    }
}
