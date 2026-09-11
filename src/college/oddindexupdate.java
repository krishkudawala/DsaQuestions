package college;

import java.util.Scanner;

public class oddindexupdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str="";
        int n=s.length();
        for (int i=0;i<n;i++){
            if (i%2!=0) str+="#";
            else str+=s.charAt(i);
        }
        System.out.println(str);

    }
}
