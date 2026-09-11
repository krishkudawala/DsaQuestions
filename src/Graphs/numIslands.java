package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class numIslands {
    public static   int numIslandss(char[][] grid) {//'1' -> land , '0' -> water
        int m=grid.length   , n=grid[0].length;
        int cont=0;
        boolean[][] vis=new boolean[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (grid[i][j]=='1' && vis[i][j]==false){
                    bsf(i,j,grid,vis);
                    cont++;
                }
            }
        }
        return cont;
    }
static class  Pair {
        int row;
        int column;
        Pair(int row , int column){
            this.row=row;
            this.column=column;
        }
}
    private static   void bsf(int i, int j, char[][] grid, boolean[][] vis) {
        int m = grid.length, n = grid[0].length;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(i, j));
        while (queue.size() > 0) {
            Pair front = queue.remove();
            int row = front.row, col = front.column;
            // top  row-1 ,col

            if (row > 0) {
                if (vis[row - 1][col] == false && grid[row - 1][col] == '1') {
                    queue.add(new Pair(row - 1, col));
                    vis[row - 1][col] = true;
                }
            }
            // top  row+1 ,col

            if (row + 1 < m) {
                if (vis[row + 1][col] == false && grid[row + 1][col] == '1') {
                    queue.add(new Pair(row + 1, col));
                    vis[row + 1][col] = true;
                }
            }
            // top  row ,col-1

            if (col>0) {
                if (vis[row][col-1] == false && grid[row ][col-1] == '1') {
                    queue.add(new Pair(row, col-1));
                    vis[row ][col-1] = true;
                }
            }
            // top  row+1 ,col

            if (col+1<n) {
                if (vis[row][col+1] == false && grid[row][col+1] == '1') {
                    queue.add(new Pair(row, col+1));
                    vis[row ][col+1] = true;
                }
            }

        }

    }

    public static void main(String[] args) {
        char[][] arr={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(numIslandss(arr));

}
}
