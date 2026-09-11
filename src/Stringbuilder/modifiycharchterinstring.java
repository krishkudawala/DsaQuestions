package Stringbuilder;

public class modifiycharchterinstring {
    public static void main(String[] args) {
        String s="hello";
        //hyllo;
        s=s.substring(0,2) +"y"+s.substring(3);
        System.out.println(s);
    }
}
