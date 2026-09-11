package DynamicProgramming;

import java.util.Scanner;

public class SubsetSum {
    public static boolean subset(int i,int [] arr ,int target, int [] [] dp) {
        if (i==-1   ) {
            if (target==0) return true;
            else return false;
        }
        if (dp[i][target]!=-1) return (dp[i][target]==1);
        boolean ans=false;
        boolean skip = subset(i-1,arr,target,dp);
        if (target-arr[i]<0) ans=skip;
        else {
            boolean pick = subset(i-1,arr,target-arr[i],dp);
            ans = pick || skip;
        }
        if (ans) dp[i][target]=1;
        else dp[i][target]=0;
        return ans;
    }

    public static void main(String[] args) {

        int [] arr={1,5,11,5};
        int target=4;
        int n=arr.length;
        // i to n-1 | target=target to 0
        int [][] dp=new int[arr.length][target+1];
        for (int i=0;i<dp.length;i++)
            for (int j=0;j<dp[0].length;j++) dp[i][j]=-1;
        System.out.println(subset(n-1,arr,target,dp));
    }
}
