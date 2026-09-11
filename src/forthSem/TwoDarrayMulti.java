package forthSem;

public class TwoDarrayMulti {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6},{3,2,1}};
        int[][] b={{1,2,3},{4,5,6},{3,4,5}};
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
