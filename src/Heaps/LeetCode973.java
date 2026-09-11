package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class LeetCode973 {

    public class Triplet implements Comparable<Triplet>{
        int d;
        int x;
        int y;

        Triplet(int x ,int y,int d){
            this.x=x;
            this.y=y;
            this.d=d;
        }

        public int compareTo(Triplet t){
            return this.d - t.d;
        }
    }

    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i=0;i<points.length;i++){
            int x = points[i][0];
            int y = points[i][1];

            int d = x*x + y*y;

            pq.add(new Triplet(x,y,d));

            if (pq.size()>k) pq.remove();
        }

        int ans[][] = new int[k][2];

        for (int i=0;i<k;i++){
            Triplet t = pq.remove();
            ans[i][0] = t.x;
            ans[i][1] = t.y;
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[][] = {{1,3},{-2,2}};
        int k = 1;

        LeetCode973 obj = new LeetCode973();
        obj.kClosest(arr,k);
    }
}