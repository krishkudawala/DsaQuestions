package college;

import java.util.ArrayList;

public class subsets {
    static ArrayList<String> arr=new ArrayList<>();
    public static void printsub(int i , String s , String ans){
        if (i==s.length()){
            arr.add(ans);
            return;
        }
            char ch =s.charAt(i);
            printsub(i+1,s,ans+ch);
            printsub(i+1,s,ans);
    }
    public static void main(String[] args) {
        String s ="abcd";
        printsub(0,s,"");
        System.out.println(arr);
    }
}
