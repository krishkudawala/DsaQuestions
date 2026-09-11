package Twodimarray;

public class transepose1 {
    public static void main(String[] args) {
        int [][] arr = {{7,9,11},{8,10,12}};
        int m =arr.length;
        int n=arr[0].length;
        int[][] transepose=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transepose[i][j]=arr[j][i];
                System.out.print(transepose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
