package TwoDarrayList;

import java.util.ArrayList;
import java.util.List;

public class Function {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(10) ; a.add(20); a.add(30);
        List<Integer> b=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        List<Integer> d=new ArrayList<>();
        d.add(60);
        b.add(40); b.add(50);
        List<List<Integer>>arr=new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c); arr.add(d);
//        for (int i=0;i<=arr.size();i++){
//            System.out.println(arr.get(i));
//        }
//        System.out.println(arr.get(1).get(1));
        for (int i=0;i<arr.size();i++){
            for (int j = 0; j <arr.get(i).size() ; j++) {
                System.out.println(arr.get(i).get(j));
            }
        }
    }
}
