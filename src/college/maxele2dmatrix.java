package college;

public class maxele2dmatrix {
    public static void main(String[] args) {
        int [][] arr={{1,2,3,4},{5,6,7,8}};
        int m=arr.length;
        int n=arr[0].length;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++) {
                if (max < arr[i][j])  max=arr[i][j] ;
            }
        }
        System.out.print(max);
    }
}
