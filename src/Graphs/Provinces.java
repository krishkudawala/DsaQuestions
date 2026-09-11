package Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Provinces {
    public static int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count = 0;
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                bsf(i, vis, adj);
                count++;
            }
        }
        return count;

    }

    private static void bsf(int i, boolean[] vis, int[][] adj) {
        int n=adj.length;
        vis[i]=true;
        Queue<Integer> queue=new LinkedList<>();
        queue.add(i);
        while (queue.size()>0) {
            int font=queue.remove();
            for (int j=0;j<n;j++) {
                if (adj[font][j] == 1 && vis[j] == false) {
                    queue.add(j);
                    vis[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[][]={{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(findCircleNum(arr));
    }
}
