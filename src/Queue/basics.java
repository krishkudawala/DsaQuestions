package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class basics {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        //  Queue<Integer> qq=new LinkedList<>();
       queue.add(1);
       queue.add(2);
       queue.add(3);
       queue.add(4);
        //System.out.println(queue);
      //  queue.poll();
      // queue.remove();
        System.out.println(queue);
        //System.out.println(queue.size());
        //System.out.println(queue.isEmpty()  );
        queue.remove();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println();
    }
}
