package HashMaps;

import java.util.HashMap;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> Smap=new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (Smap.containsKey(ch)){
                int freq=Smap.get(ch);
                Smap.put(ch,freq+1);
            }
            else Smap.put(ch,1);
        }
        HashMap<Character,Integer> tmap=new HashMap<>();
        for (int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if (tmap.containsKey(ch)){
                int freq=tmap.get(ch);
                tmap.put(ch,freq+1);
            }
            else tmap.put(ch,1);
        }
        for (char ch:Smap.keySet()){
            int val1=Smap.get(ch);
            if(!tmap.containsKey(ch)) return false;
            int val2=tmap.get(ch);
            if(val1!=val2) return false;
        }
        return true;
    }

    public static void main(String[] args) {
    String s="anagram";
    String t="nagaram";
        System.out.println(isAnagram(s,t));
    }
}
