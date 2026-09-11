package Heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {

        int [] arr={6 ,2 ,3 ,2 ,1 ,5 ,6 ,4};
        int k=3;
        Arrays.sort(arr);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele:arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }
        System.out.println(pq.peek());
    }
}
