package college;

public class rowmaxele2d {
    public static void main(String[] args) {
        int [][] arr={{1,3,5,7},{3,4,7,8},{1,4,12,3}};
        int m=arr.length;
        int n=arr[0].length;
        int sum=0;
       // int max=Integer.MIN_VALUE;
        for (int i=2;i<m;i++){
            for (int j=0;j<n;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
