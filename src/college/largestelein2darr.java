package college;

public class largestelein2darr {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int m=arr.length;
        int n=arr[0].length;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (arr[i][j]>=max )  max=arr[i][j];
            }
        }
        System.out.println(max);
    }
}


