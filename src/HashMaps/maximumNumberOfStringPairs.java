package HashMaps;

import java.util.HashSet;

public class maximumNumberOfStringPairs {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String rev = reverse(words[i]);
            if (set.contains(rev)) {
                count++;
            }
            else set.add(words[i]);
        }
    return count;
    }
    public String reverse(String s){
        StringBuilder stringBuilder=new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
    public static void main(String[] args) {

    }
}
