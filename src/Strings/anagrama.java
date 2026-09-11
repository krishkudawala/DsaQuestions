package Strings;

import java.util.Arrays;

public class anagrama {
    public static void main(String[] args) {
        String s ="anagram";
        String s1="nagaram";
        if (s.length()!=s1.length())return;
        char []ch =s.toCharArray();
        char []ch1=s1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        for (char ele :ch) {
            System.out.print(ele);

        }
        System.out.println();
        for (char ele1:ch1){
            System.out.print(ele1);
        }
    }
}
