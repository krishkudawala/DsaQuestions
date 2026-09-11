package HashMaps;

import java.util.HashSet;

public class basicsset {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(100);
        set.add(-8);
        System.out.println("This is a size "+set.size());
        System.out.println(set.contains(50));
        set.add(50);
        System.out.println(set.contains(50));

        System.out.println(set+" "+set.size() );
    }
}
