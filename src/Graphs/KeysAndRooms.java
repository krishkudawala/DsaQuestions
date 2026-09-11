package Graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeysAndRooms {
    public static boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n=adj.size();
        boolean [] vis=new boolean[n];
        vis[0]=true;
        bsf(0,adj,vis);
        for (boolean ele : vis){
            if (ele==false) return false;
        }
        return true;
    }

    private static void bsf(int start, List<List<Integer>> adj, boolean[] vis) {
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        while (q.size()>0){
            int front=q.remove();
            for (int ele : adj.get(front)){
                if (!vis[ele]){
                    vis[ele]=true;
                    q.add(ele);
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
