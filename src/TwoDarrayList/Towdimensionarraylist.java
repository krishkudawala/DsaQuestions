package TwoDarrayList;

import java.util.ArrayList;
import java.util.List;

public class Towdimensionarraylist {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(10) ; a.add(20); a.add(30);
        List<Integer> b =new ArrayList<>();
        b.add(40) ; b.add(50);
        List<Integer> c =new ArrayList<>();
        List<Integer> d =new ArrayList<>();
        d.add(60); d.add(70);

        List<List<Integer>> grid=new ArrayList<>();
        grid.add(a);grid.add(b);grid.add(c);grid.add(d);
        for (int i=0;i<grid.size();i++){
            System.out.println(grid.get(i));
        }

    }
}
