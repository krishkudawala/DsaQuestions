package Strings;

public class updateevenposition {
    public static void main(String[] args) {
        String s ="physics wallah";
        System.out.println(s);
        String str="";
        for (int i=0;i<s.length();i++){
            if (i%2==0) str+="a";
            else str += s.charAt(i);
        }
        System.out.println(str);
    }
}
