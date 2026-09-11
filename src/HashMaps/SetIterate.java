package HashMaps;

import java.util.HashSet;

public class SetIterate {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        HashSet<Integer> set=new HashSet<>();
        set.add(12);
        set.add(3);
        set.add(2);
        set.add(5);
        for (int ele :set)
            System.out.print(ele+" ");
    }
}
