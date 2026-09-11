package ArrayList;

import java.util.ArrayList;

public class BasicsofArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(5);
        arr.add(0,1);
        arr.add(1,2);
        arr.add(2,3);
        arr.add(3,4);
        arr.add(4,5);
        arr.remove(0);
        arr.remove(2);
        arr.remove(3);
        arr.remove(4);
        System.out.println(arr);

        }
    }

