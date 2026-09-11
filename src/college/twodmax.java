package college;

public class twodmax {
    public static void main(String[] args) {
        int [][] a={{1,2,3,4},{5,6,4,9},{9,7,8,5}};
         int m =a.length;
         int n =a[0].length;
         int max=Integer.MIN_VALUE;
         for (int i=0;i<m;i++) {
             for (int j = 0; j < n; j++) {
                 max = Math.max(max, a[i][j]);
             }
         }
             System.out.println(max);
    }
}
