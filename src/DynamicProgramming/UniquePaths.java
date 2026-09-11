package DynamicProgramming;

public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        return paths(0,0,m,n);

    }

    private static int paths(int row, int col, int m, int n) {
        if (row>=m || col>=n) return 0;
        if (row==m-1 && col==n-1) return 1;
        int rightways =paths(row,col+1,m,n);
        int downways  =paths(row+1,col,m,n);
        return rightways+downways;
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,2));
    }
}
