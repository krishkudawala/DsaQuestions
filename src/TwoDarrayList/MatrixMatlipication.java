package TwoDarrayList;

public class MatrixMatlipication {
    public static void main (String[] args) throws java.lang.Exception
    {
        int [][] a={{3, 2 ,3},{1,4},{2,5}};
        int [][] b={{3,6},{7,8,6},{10,11,12}};
        if(a.length!=b[0].length){
            System.out.println("Not possible");
        }
        else {
            int [][] c =new int[a.length][b[0].length];
            for(int i=1;i<a.length;i++){
                for(int j=0;j<b[0].length;j++){
                    for(int k=0;k<b.length;k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                    System.out.println(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
