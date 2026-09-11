package recursion;

public class subsets {
    public static void subsets(int i , String s,String ans){
        if (i==s.length()){
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(i);
        subsets(i+1,s,ans+ch); //take
        subsets(i+1,s,ans); // not take
    }
    public static void main(String[] args) {
        String s ="abcd";
        subsets(0,s,"");
    }
}
