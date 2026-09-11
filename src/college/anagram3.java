package college;

import java.util.Arrays;

public class anagram3 {
    public static void main(String[] args) {
        String s="anagram";
        String s1="nagaram";
        char [] ch=s.toCharArray();
        char [] ch1=s1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        for (char ele:ch){
            System.out.print(ele+" ");
        }
        System.out.println();
        for (char ele1 :ch1){
            System.out.print(ele1+" ");
        }
    }
}
