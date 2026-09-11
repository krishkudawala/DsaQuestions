package Heaps;

import java.util.*;

public class KClosetElement {

    static class Pair implements Comparable<Pair>{
        int ele;
        int diff;

        Pair(int ele , int diff){
            this.ele = ele;
            this.diff = diff;
        }

        public int compareTo(Pair p){
            if (this.diff == p.diff)
                return this.ele - p.ele;
            return this.diff - p.diff;
        }
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int ele : arr){
            int diff = Math.abs(x - ele);
            pq.add(new Pair(ele, diff));

            if (pq.size() > k)
                pq.poll();
        }

        List<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty()){
            Pair p = pq.poll();
            ans.add(p.ele);
        }

        Collections.sort(ans);

        return ans;
    }

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,6,7,8};
        int k = 4;
        int x = 3;

        System.out.println(findClosestElements(arr,k,x));
    }
}