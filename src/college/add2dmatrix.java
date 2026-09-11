package college;

public class add2dmatrix {
    public static void main(String[] args) {
        int [][] a={{1,2,3},{4,5,6},{7,8,9}};
        int [][] b={{4,5,8},{0,0,8},{1,2,0}};
        int [][] c=new int[a.length][b[0].length];
        for (int i=0;i<c.length;i++){
            for (int j=0;j<c[0].length;j++){
            c[i][j]+=a[i][j]+b[i][j];
            System.out.print(c[i][j]+" ");
        }
            System.out.println();
        }
    }
}
