package Stringbuilder;

import java.util.Scanner;

public class frequecy {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        int [] frq=new int[26];
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=(int)ch-97;
            frq[idx]++;
        }
         int maxreq=-1;
        for (int i=0;i<frq.length;i++){
            maxreq=Math.max(maxreq,frq[i]);
        }
        for (int i=0;i<frq.length;i++){
            if (frq[i]==maxreq){
                char ch = (char) (i+97);
                System.out.println(ch);
            }
        }
    }
}
