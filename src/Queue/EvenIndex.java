package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class EvenIndex {
    static Queue <Integer> q;
    static Queue <Integer>  newq;

    static void removeEven(){
        newq=new ArrayDeque<>();
        while (!q.isEmpty()){
            q.remove();
            if(!q.isEmpty()){
                newq.add(q.remove());
            }
        }
        q=newq;
    }
    public static void main(String[] args) {
        q=new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        removeEven();
        System.out.println(q);


    }
}
