package DynamicProgramming;

public class MatrixChainMultiplication {
//    public static int costmcm(int i,int j,int [][] arr){
//        if (i==j) return 0;
//        int minCost=Integer.MAX_VALUE;
//        for (int k=i;k<j;k++){
//            int x=arr[i][0] * arr[j][1] *arr[k][1];
//            int tc=costmcm(i,k,arr) +costmcm(k+1,j,arr) +x;
//            minCost=Math.min(minCost,tc);
//        }
//        return minCost;
//    }
public static int costmcm(int i,int j,int [] arr,int [][]dp){
    if (i==j) return 0;
    if (dp[i][j]!=-1) return dp[i][j];
    int minCost=Integer.MAX_VALUE;
    for (int k=i;k<j;k++){
        int x=arr[i] * arr[j+1] *arr[k+1];
        int tc=costmcm(i,k,arr,dp) +costmcm(k+1,j,arr,dp) +x;
        minCost=Math.min(minCost,tc);
    }
    return minCost;
}

    public static int costmcm2(int [] arr){
        int n=arr.length;
        int [][] dp=new int[n-1][n-1];
        for (int i=n-2;i>=0;i--){
            for (int j=0;j<=n-2;j++){
                if (i>=j){
                    dp[i][j]=0;
                    continue;
                }
                int minCost=Integer.MAX_VALUE;
                for (int k=i;k<j;k++){
                  int x=arr[i] * arr[j+1] *arr[k+1];
                  int tc=dp[i][k]+dp[k+1][j]+x;
                  minCost=Math.min(minCost,tc);
        }
        dp[i][j]=minCost;
            }
        }
        return dp[0][n-2];
    }
    public static void main(String[] args) {
       // int [][] arr={{1,2},{2,3},{3,4} };
        int [] arr={1,2,3,4};
        int n=arr.length;
        int [][] dp=new int[n-1][n-1];
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1;j++){
                dp[i][j]=-1;
            }
        }
        //System.out.println(costmcm(0,n-2,arr,dp));
        System.out.println(costmcm2(arr));

    }
}
