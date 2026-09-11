package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class BasibsHeepCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(1);
        System.out.println(priorityQueue);
        priorityQueue.add(20);
        priorityQueue.add(3);
        priorityQueue.remove();
        priorityQueue.add(40);
        System.out.println(priorityQueue);

    }
}
