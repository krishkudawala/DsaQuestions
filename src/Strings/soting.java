package Strings;

import java.util.Arrays;

public class soting {
    public static void main(String[] args) {
        String s ="krish";
        char [] ch =s.toCharArray();
        for (char ele :ch){
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(ch);
        for (char ele :ch){
            System.out.print(ele);
        }
        System.out.println();
    }
}
