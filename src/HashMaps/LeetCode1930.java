package HashMaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCode1930 {
    public static int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> first=new HashMap<>();
        HashMap<Character ,Integer> last=new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (!first.containsKey(ch)) first.put(ch,i);
            last.put(ch,i);
        }
        int count=0;
        for (char ch : first.keySet()){
            int firstidx=first.get(ch);
            int lastidx=last.get(ch);
            Set<Character> set=new HashSet<>();
            for (int i=firstidx+1;i<=lastidx-1;i++){
                set.add(s.charAt(i));
            }
            count+=set.size();
        }
        return count;
    }

    public static void main(String[] args) {
String s="aabca";
        System.out.println(countPalindromicSubsequence(s));
    }
}
