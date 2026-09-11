package college;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1= "race";
        String s2="care";
        if (s1.length()==s2.length()){
            char [] ch= s1.toCharArray();
            char [] ch1 = s2.toCharArray();
            Arrays.sort(ch);
            Arrays.sort(ch1);
            for (char ele :ch){
                System.out.print(ele);
            }
            System.out.println();
            for (char ele1:ch1){
                System.out.print(ele1);
            }
        }
    }
}
