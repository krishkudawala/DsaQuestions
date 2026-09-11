package HashMaps;

import java.util.HashMap;

public class lengthLeetCode3 {
    public static int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if (n<=1) return n;
        int maxlen=0;
        int i=0;
        int j=0;
        HashMap<Character,Integer> map=new HashMap<>();

        while (j<n){
            char ch=s.charAt(j);
            if (map.containsKey(ch) && map.get(ch)>=i){
                int len=j-i;
                maxlen=Math.max(maxlen,len);
                // i ko leke jao ch ki puarni position se aage
                while (s.charAt(i)!=ch)i++;
                i++;

            }
             map.put(ch,j);
            j++;
        }
        int len=j-i;
        maxlen=Math.max(maxlen,len);
        return maxlen;
    }
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
