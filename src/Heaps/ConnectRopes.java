package Heaps;

import java.util.PriorityQueue;

public class ConnectRopes {
    public static int mincost(int [] arr){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int ele :arr){
            pq.add(ele);
        }
        int cost=0;
        while (pq.size()>1){
            int y=pq.remove();
            int x=pq.remove();
            cost+=x+y;
            pq.add(x+y);
        }
        return cost;
    }
    public static void main(String[] args) {
        int [] arr={2,7,4,1,8};
        System.out.println(mincost(arr));
    }
}
